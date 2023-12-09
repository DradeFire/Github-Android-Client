package com.example.androidgithubclient.view.fragments.reposes;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.example.androidgithubclient.R;
import com.example.androidgithubclient.databinding.FragmentGithubListRepositoriesBinding;
import com.example.androidgithubclient.model.retrofit.model.repos.RepositoryList;
import com.example.androidgithubclient.view.MainActivity;
import com.example.androidgithubclient.view.fragments.reposes.adapter.RepositoryAdapter;
import com.example.androidgithubclient.view.fragments.reposes.adapter.RepositoryAdapterDiffUtil;
import com.example.androidgithubclient.viewmodel.GitViewModel;
import java.util.Objects;

public class GithubListRepositoriesFragment extends Fragment {

    private FragmentGithubListRepositoriesBinding binding;
    private GitViewModel viewmodel;
    private final Handler h = new Handler();

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        init(inflater, container);
        setUpObservers();

        if(isAdded() && !isNetworkConnected() && viewmodel.repositoryList.getValue() != null){
            setNewDataInAdapter(viewmodel.repositoryList.getValue());
            Toast.makeText(requireContext(), "Used saved data, maybe you should refresh it (swipe)", Toast.LENGTH_SHORT).show();
        } else if(isAdded()){
            if (viewmodel.repositoryList.getValue() == null)
                viewmodel.requestRepositoryList(viewmodel.token);
            else {
                setNewDataInAdapter(viewmodel.repositoryList.getValue());
                Toast.makeText(requireContext(), "Used saved data, maybe you should refresh it (swipe)", Toast.LENGTH_SHORT).show();
            }
        }

        Runnable r = new Runnable() {
            @Override
            public void run() {
                if(isAdded() && !isNetworkConnected()){
                    Toast.makeText(requireContext(), "Check your internet connection!", Toast.LENGTH_SHORT).show();
                    setNewDataInAdapter(viewmodel.repositoryList.getValue());
                    h.postDelayed(this, 7000);
                }
                else if(isResumed()) {
                    h.removeCallbacks(this);
                    viewmodel.requestRepositoryList(viewmodel.token);
                }
            }
        };
        h.post(r);

        return binding.getRoot();
    }

    private boolean isNetworkConnected() {
        ConnectivityManager cm = (ConnectivityManager) requireActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
        return cm.getActiveNetworkInfo() != null && cm.getActiveNetworkInfo().isConnected();
    }

    private void setNewDataInAdapter(RepositoryList list) {
        RepositoryAdapterDiffUtil repDiffUtil =
                new RepositoryAdapterDiffUtil(((RepositoryAdapter) Objects.requireNonNull(binding.rcReps.getAdapter())).getData(), viewmodel.repositoryList.getValue());
        DiffUtil.DiffResult diffResult = DiffUtil.calculateDiff(repDiffUtil);

        ((RepositoryAdapter) Objects.requireNonNull(binding.rcReps.getAdapter())).setNewReps(list);
        diffResult.dispatchUpdatesTo(((RepositoryAdapter) Objects.requireNonNull(binding.rcReps.getAdapter())));
        binding.swipeView.setRefreshing(false);
    }

    private void init(LayoutInflater inflater, ViewGroup container) {
        viewmodel = new ViewModelProvider(requireActivity()).get(GitViewModel.class);

        binding = FragmentGithubListRepositoriesBinding.inflate(inflater, container, false);
        binding.rcReps.setAdapter(new RepositoryAdapter(requireContext(), new RepositoryList(), viewmodel));
        binding.rcReps.setLayoutManager(new LinearLayoutManager(requireContext()));

        binding.swipeView.setOnRefreshListener(() ->{
            if(isAdded()){
                if(!isNetworkConnected()) binding.swipeView.setRefreshing(false);
                viewmodel.requestRepositoryList(viewmodel.token);
            }
        });
    }

    private void setUpObservers() {
        viewmodel.repLiveData.observe(getViewLifecycleOwner(),
                repo -> {
            if(isAdded()){
                if (repo == null)
                {
                    Toast.makeText(requireContext(), "Problem with taking list of repositories, try refresh", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (!viewmodel.isBackFromSingle) {
                    viewmodel.isBackFromSingle = true;
                    ((MainActivity) requireActivity()).navController.navigate(R.id.githubSingleRepositoryFragment);
                    return;
                }
                viewmodel.isBackFromSingle = false;
            }
        });
        viewmodel.repositoryList.observe(getViewLifecycleOwner(), repList -> {
            if(isAdded()){
                if (repList == null)
                {
                    Toast.makeText(requireContext(), "Problem with taking list of repositories, try refresh", Toast.LENGTH_SHORT).show();
                    return;
                }
                setNewDataInAdapter(repList);
            }
        });
    }

    @Override
    public void onDestroyView() {
        binding = null;
        viewmodel = null;
        super.onDestroyView();
    }

}
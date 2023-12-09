package com.example.androidgithubclient.view.fragments.repos;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.androidgithubclient.databinding.FragmentGithubSingleRepositoryBinding;
import com.example.androidgithubclient.model.retrofit.model.commit.CommitList;
import com.example.androidgithubclient.view.fragments.repos.adapter.CommitAdapter;
import com.example.androidgithubclient.viewmodel.GitViewModel;

import java.util.Objects;

public class GithubSingleRepositoryFragment extends Fragment {

    private FragmentGithubSingleRepositoryBinding binding;
    private GitViewModel viewModel;
    private final Handler h = new Handler();

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        if(isAdded()){
            init(inflater, container);
            setUpObservers();
            bindView();
        }

        return binding.getRoot();
    }

    private boolean isNetworkConnected() {
        ConnectivityManager cm = (ConnectivityManager) requireActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
        return cm.getActiveNetworkInfo() != null && cm.getActiveNetworkInfo().isConnected();
    }


    private void setUpObservers() {
        viewModel.commitList.observe(getViewLifecycleOwner(), commitList -> {
            if(isAdded()){
                if (commitList == null) {
                    Toast.makeText(requireContext(), "There are no commits!", Toast.LENGTH_SHORT).show();
                    ((CommitAdapter) Objects.requireNonNull(binding.rcCommit.getAdapter())).setNewCommits(new CommitList());
                    return;
                }
                ((CommitAdapter) Objects.requireNonNull(binding.rcCommit.getAdapter())).setNewCommits(commitList);
            }
        });
    }

    private void bindView() {
        binding.txRepName.setText(Objects.requireNonNull(viewModel.repLiveData.getValue()).getName());
        binding.txRepDescr.setText(Objects.requireNonNull(viewModel.repLiveData.getValue()).getDescription());
        binding.txRepAuthor.setText(Objects.requireNonNull(viewModel.repLiveData.getValue()).getOwner().getLogin());
        binding.txRepForks.setText(String.valueOf(Objects.requireNonNull(viewModel.repLiveData.getValue()).getForks_count()));
        binding.txRepWatches.setText(String.valueOf(Objects.requireNonNull(viewModel.repLiveData.getValue()).getWatchers_count()));

        Glide.with(requireContext())
                .load(Objects.requireNonNull(viewModel.repLiveData.getValue()).getOwner().getAvatar_url())
                .circleCrop()
                .into(binding.imRepAvatar);
    }

    private void init(LayoutInflater inflater, ViewGroup container) {
        binding = FragmentGithubSingleRepositoryBinding.inflate(inflater, container, false);
        binding.rcCommit.setLayoutManager(new LinearLayoutManager(requireContext()));
        binding.rcCommit.setAdapter(new CommitAdapter(new CommitList()));
        viewModel = new ViewModelProvider(requireActivity()).get(GitViewModel.class);

        internetHandle();
    }

    private void internetHandle() {
        String url = Objects.requireNonNull(viewModel.repLiveData.getValue()).getCommits_url().substring(23, viewModel.repLiveData.getValue().getCommits_url().length() - 6);
        h.post(
                new Runnable() {
                    @Override
                    public void run() {
                        if(isAdded() && !isNetworkConnected()){
                            Toast.makeText(requireContext(), "Check your internet connection!", Toast.LENGTH_SHORT).show();
                            ((CommitAdapter) Objects.requireNonNull(binding.rcCommit.getAdapter())).setNewCommits(new CommitList());
                            h.postDelayed(this, 8000);
                        }
                        else if(isResumed()) {
                            h.removeCallbacks(this);
                            viewModel.requestListOfCommits(url, viewModel);
                        }
                    }
                }
        );
    }

    @Override
    public void onDestroyView() {
        binding = null;
        viewModel = null;
        super.onDestroyView();
    }

}
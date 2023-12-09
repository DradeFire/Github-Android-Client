package com.example.androidgithubclient.view.fragments.auth;

import static com.example.androidgithubclient.consts.Consts.client_id;
import static com.example.androidgithubclient.consts.Consts.redirect_url;
import static com.example.androidgithubclient.consts.Consts.secret_id;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.androidgithubclient.R;
import com.example.androidgithubclient.view.MainActivity;
import com.example.androidgithubclient.viewmodel.GitViewModel;

public class GithubAuthFragment extends Fragment {

    private GitViewModel viewmodel;
    private final Handler h = new Handler();

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        viewmodel = new ViewModelProvider(requireActivity()).get(GitViewModel.class);

        networkHandle();

        if (!requireActivity().getSharedPreferences("pref", Context.MODE_PRIVATE).contains("token")){
            setUpObservers();
            githubLoging();
        }

        return inflater.inflate(R.layout.fragment_github_auth, container, false);
    }

    private void networkHandle() {

        h.post(new Runnable() {
            @Override
            public void run() {
                if(!isNetworkConnected()){
                    Toast.makeText(requireContext(), "Check your internet connection!", Toast.LENGTH_SHORT).show();
                    h.postDelayed(this, 4000);
                }
                else if(isResumed()) {
                    h.removeCallbacks(this);
                    if(!checkTokenAndOpenListReps()) handleGithubCode();
                }
            }

            private void handleGithubCode() {
                Uri uri = requireActivity().getIntent().getData();
                if(uri != null && uri.toString().startsWith(redirect_url)) {
                    String code = uri.getQueryParameter("code");
                    viewmodel.requestAccessToken(client_id, secret_id, code);
                } else {
                    Toast.makeText(requireContext(), "Try again, please!", Toast.LENGTH_SHORT).show();
                    githubLoging();
                }
            }
        });
    }

    private boolean isNetworkConnected() {
        ConnectivityManager cm = (ConnectivityManager) requireActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
        return cm.getActiveNetworkInfo() != null && cm.getActiveNetworkInfo().isConnected();
    }

    private void setUpObservers() {
        viewmodel.accessToken.observe(getViewLifecycleOwner(), accessToken -> {
            if (accessToken == null)
            {
                Toast.makeText(requireContext(), "Problem with taking Access Token", Toast.LENGTH_SHORT).show();
                return;
            }
            requireActivity().getSharedPreferences("pref", Context.MODE_PRIVATE).edit().putString("token", accessToken.getAccessToken()).apply();
            viewmodel.token = accessToken.getAccessToken();
            ((MainActivity) requireActivity()).navController.navigate(R.id.action_githubAuthFragment_to_githubListRepositoriesFragment);
        });
    }

    private boolean checkTokenAndOpenListReps() {
        if (requireActivity().getSharedPreferences("pref", Context.MODE_PRIVATE).contains("token")){
            viewmodel.token = requireActivity().getSharedPreferences("pref", Context.MODE_PRIVATE).getString("token", "");
            ((MainActivity) requireActivity()).navController.navigate(R.id.action_githubAuthFragment_to_githubListRepositoriesFragment);
            return true;
        }
        return false;
    }

    private void githubLoging() {
        Uri uri = requireActivity().getIntent().getData();
        if (uri == null){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(
                    "https://github.com/login/oauth/authorize?scope=repo&client_id=" + client_id + "&redirect_uri=" + redirect_url
            ));
            startActivity(intent);
        }

    }

    @Override
    public void onDestroyView() {
        viewmodel = null;
        super.onDestroyView();
    }

}
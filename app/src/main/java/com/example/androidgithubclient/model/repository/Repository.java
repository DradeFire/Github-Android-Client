package com.example.androidgithubclient.model.repository;

import static com.example.androidgithubclient.model.retrofit.RetrofitInstanse.retrofit;
import static com.example.androidgithubclient.model.retrofit.RetrofitInstanse.retrofitSpecApi;

import com.example.androidgithubclient.model.retrofit.model.commit.CommitList;
import com.example.androidgithubclient.model.retrofit.model.repos.RepositoryList;
import com.example.androidgithubclient.model.retrofit.model.token.AccessToken;
import io.reactivex.rxjava3.core.Single;

public class Repository {

    public Single<AccessToken> getAccessToken(
            String client_id,
            String secret_id,
            String code
    ) {
        return retrofit.getAccessToken(client_id, secret_id, code);
    }

    public Single<RepositoryList> getListOfRepositories(
            String token
    ) {
        return retrofitSpecApi.getListOfRepositories("token " + token);
    }

    public Single<CommitList> getListOfCommits(
            String url, String token
    ){
        return retrofitSpecApi.getListOfCommits(url, "token " + token);
    }

}

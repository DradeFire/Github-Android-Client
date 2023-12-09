package com.example.androidgithubclient.model.api;

import com.example.androidgithubclient.model.retrofit.model.commit.CommitList;
import com.example.androidgithubclient.model.retrofit.model.repos.RepositoryList;
import com.example.androidgithubclient.model.retrofit.model.token.AccessToken;
import io.reactivex.rxjava3.core.Single;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Url;

public interface GitApi {

    @Headers("Accept: application/json")
    @POST("login/oauth/access_token")
    @FormUrlEncoded
    Single<AccessToken> getAccessToken(
            @Field("client_id") String client_id,
            @Field("client_secret") String secret_id,
            @Field("code") String code
    );

    @GET("user/repos")
    Single<RepositoryList> getListOfRepositories(
            @Header("Authorization") String token
    );

    @Headers("Accept: application/vnd.github+json")
    @GET
    Single<CommitList> getListOfCommits(
            @Url String url, @Header("Authorization") String token
    );

}

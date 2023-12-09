package com.example.androidgithubclient.model.retrofit;

import static com.example.androidgithubclient.consts.Consts.BASE_URL;
import static com.example.androidgithubclient.consts.Consts.BASE_URL_API;
import com.example.androidgithubclient.model.api.GitApi;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstanse {

    public static final GitApi retrofit = createRetrofit(BASE_URL);
    public static final GitApi retrofitSpecApi = createRetrofit(BASE_URL_API);

    private static GitApi createRetrofit(String base_url) {
        return new Retrofit.Builder()
                .baseUrl(base_url)
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(GitApi.class);
    }

}

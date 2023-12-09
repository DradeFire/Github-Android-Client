package com.example.androidgithubclient.model.retrofit.model.commit;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import kotlin.jvm.internal.Intrinsics;

public  class Parent {
    @NotNull
    private final String sha;
    @NotNull
    private final String url;

    @NotNull
    public final String getSha() {
        return this.sha;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public Parent(@NotNull String sha, @NotNull String url) {
        Intrinsics.checkNotNullParameter(sha, "sha");
        Intrinsics.checkNotNullParameter(url, "url");
        this.sha = sha;
        this.url = url;
    }

    @NotNull
    public final String component1() {
        return this.sha;
    }

    @NotNull
    public final String component2() {
        return this.url;
    }

    @NotNull
    public final Parent copy(@NotNull String sha, @NotNull String url) {
        Intrinsics.checkNotNullParameter(sha, "sha");
        Intrinsics.checkNotNullParameter(url, "url");
        return new Parent(sha, url);
    }

    // $FF: synthetic method
    public static Parent copy$default(Parent var0, String var1, String var2, int var3, Object var4) {
        if ((var3 & 1) != 0) {
            var1 = var0.sha;
        }

        if ((var3 & 2) != 0) {
            var2 = var0.url;
        }

        return var0.copy(var1, var2);
    }
}


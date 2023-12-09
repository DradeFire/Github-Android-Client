package com.example.androidgithubclient.model.retrofit.model.commit;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import kotlin.jvm.internal.Intrinsics;

public  class Committer {
    @NotNull
    private final String date;
    @NotNull
    private final String email;
    @NotNull
    private final String name;

    @NotNull
    public final String getDate() {
        return this.date;
    }

    @NotNull
    public final String getEmail() {
        return this.email;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public Committer(@NotNull String date, @NotNull String email, @NotNull String name) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(name, "name");
        this.date = date;
        this.email = email;
        this.name = name;
    }

    @NotNull
    public final String component1() {
        return this.date;
    }

    @NotNull
    public final String component2() {
        return this.email;
    }

    @NotNull
    public final String component3() {
        return this.name;
    }

    @NotNull
    public final Committer copy(@NotNull String date, @NotNull String email, @NotNull String name) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(name, "name");
        return new Committer(date, email, name);
    }

    // $FF: synthetic method
    public static Committer copy$default(Committer var0, String var1, String var2, String var3, int var4, Object var5) {
        if ((var4 & 1) != 0) {
            var1 = var0.date;
        }

        if ((var4 & 2) != 0) {
            var2 = var0.email;
        }

        if ((var4 & 4) != 0) {
            var3 = var0.name;
        }

        return var0.copy(var1, var2, var3);
    }
}


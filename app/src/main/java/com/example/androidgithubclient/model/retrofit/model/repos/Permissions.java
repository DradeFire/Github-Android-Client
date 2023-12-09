package com.example.androidgithubclient.model.retrofit.model.repos;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public  class Permissions {
    private final boolean admin;
    private final boolean pull;
    private final boolean push;

    public final boolean getAdmin() {
        return this.admin;
    }

    public final boolean getPull() {
        return this.pull;
    }

    public final boolean getPush() {
        return this.push;
    }

    public Permissions(boolean admin, boolean pull, boolean push) {
        this.admin = admin;
        this.pull = pull;
        this.push = push;
    }

    public final boolean component1() {
        return this.admin;
    }

    public final boolean component2() {
        return this.pull;
    }

    public final boolean component3() {
        return this.push;
    }

    @NotNull
    public final Permissions copy(boolean admin, boolean pull, boolean push) {
        return new Permissions(admin, pull, push);
    }

    // $FF: synthetic method
    public static Permissions copy$default(Permissions var0, boolean var1, boolean var2, boolean var3, int var4, Object var5) {
        if ((var4 & 1) != 0) {
            var1 = var0.admin;
        }

        if ((var4 & 2) != 0) {
            var2 = var0.pull;
        }

        if ((var4 & 4) != 0) {
            var3 = var0.push;
        }

        return var0.copy(var1, var2, var3);
    }
}


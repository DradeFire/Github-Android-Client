package com.example.androidgithubclient.model.retrofit.model.commit;

import org.jetbrains.annotations.NotNull;
import kotlin.jvm.internal.Intrinsics;

public  class Verification {
    @NotNull
    private final Object payload;
    @NotNull
    private final String reason;
    @NotNull
    private final Object signature;
    private final boolean verified;

    @NotNull
    public final Object getPayload() {
        return this.payload;
    }

    @NotNull
    public final String getReason() {
        return this.reason;
    }

    @NotNull
    public final Object getSignature() {
        return this.signature;
    }

    public final boolean getVerified() {
        return this.verified;
    }

    public Verification(@NotNull Object payload, @NotNull String reason, @NotNull Object signature, boolean verified) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.payload = payload;
        this.reason = reason;
        this.signature = signature;
        this.verified = verified;
    }

    @NotNull
    public final Object component1() {
        return this.payload;
    }

    @NotNull
    public final String component2() {
        return this.reason;
    }

    @NotNull
    public final Object component3() {
        return this.signature;
    }

    public final boolean component4() {
        return this.verified;
    }

    @NotNull
    public final Verification copy(@NotNull Object payload, @NotNull String reason, @NotNull Object signature, boolean verified) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(signature, "signature");
        return new Verification(payload, reason, signature, verified);
    }

    // $FF: synthetic method
    public static Verification copy$default(Verification var0, Object var1, String var2, Object var3, boolean var4, int var5, Object var6) {
        if ((var5 & 1) != 0) {
            var1 = var0.payload;
        }

        if ((var5 & 2) != 0) {
            var2 = var0.reason;
        }

        if ((var5 & 4) != 0) {
            var3 = var0.signature;
        }

        if ((var5 & 8) != 0) {
            var4 = var0.verified;
        }

        return var0.copy(var1, var2, var3, var4);
    }
}


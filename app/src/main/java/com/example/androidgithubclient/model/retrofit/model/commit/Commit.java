package com.example.androidgithubclient.model.retrofit.model.commit;

import org.jetbrains.annotations.NotNull;
import kotlin.jvm.internal.Intrinsics;

public class Commit {
    @NotNull
    private final AuthorX author;
    private final int comment_count;
    @NotNull
    private final Committer committer;
    @NotNull
    private final String message;
    @NotNull
    private final Tree tree;
    @NotNull
    private final String url;
    @NotNull
    private final Verification verification;

    @NotNull
    public final AuthorX getAuthor() {
        return this.author;
    }

    public final int getComment_count() {
        return this.comment_count;
    }

    @NotNull
    public final Committer getCommitter() {
        return this.committer;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final Tree getTree() {
        return this.tree;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final Verification getVerification() {
        return this.verification;
    }

    public Commit(@NotNull AuthorX author, int comment_count, @NotNull Committer committer, @NotNull String message, @NotNull Tree tree, @NotNull String url, @NotNull Verification verification) {
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(committer, "committer");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(tree, "tree");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(verification, "verification");
        this.author = author;
        this.comment_count = comment_count;
        this.committer = committer;
        this.message = message;
        this.tree = tree;
        this.url = url;
        this.verification = verification;
    }

    @NotNull
    public final AuthorX component1() {
        return this.author;
    }

    public final int component2() {
        return this.comment_count;
    }

    @NotNull
    public final Committer component3() {
        return this.committer;
    }

    @NotNull
    public final String component4() {
        return this.message;
    }

    @NotNull
    public final Tree component5() {
        return this.tree;
    }

    @NotNull
    public final String component6() {
        return this.url;
    }

    @NotNull
    public final Verification component7() {
        return this.verification;
    }

    @NotNull
    public final Commit copy(@NotNull AuthorX author, int comment_count, @NotNull Committer committer, @NotNull String message, @NotNull Tree tree, @NotNull String url, @NotNull Verification verification) {
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(committer, "committer");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(tree, "tree");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(verification, "verification");
        return new Commit(author, comment_count, committer, message, tree, url, verification);
    }

    // $FF: synthetic method
    public static Commit copy$default(Commit var0, AuthorX var1, int var2, Committer var3, String var4, Tree var5, String var6, Verification var7, int var8, Object var9) {
        if ((var8 & 1) != 0) {
            var1 = var0.author;
        }

        if ((var8 & 2) != 0) {
            var2 = var0.comment_count;
        }

        if ((var8 & 4) != 0) {
            var3 = var0.committer;
        }

        if ((var8 & 8) != 0) {
            var4 = var0.message;
        }

        if ((var8 & 16) != 0) {
            var5 = var0.tree;
        }

        if ((var8 & 32) != 0) {
            var6 = var0.url;
        }

        if ((var8 & 64) != 0) {
            var7 = var0.verification;
        }

        return var0.copy(var1, var2, var3, var4, var5, var6, var7);
    }
}

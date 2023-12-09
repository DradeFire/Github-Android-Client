package com.example.androidgithubclient.model.retrofit.model.commit;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import kotlin.jvm.internal.Intrinsics;

public class CommitListItem {
    @NotNull
    private final Author author;
    @NotNull
    private final String comments_url;
    @NotNull
    private final Commit commit;
    @NotNull
    private final CommitterX committer;
    @NotNull
    private final String html_url;
    @NotNull
    private final String node_id;
    @NotNull
    private final List parents;
    @NotNull
    private final String sha;
    @NotNull
    private final String url;

    @NotNull
    public final Author getAuthor() {
        return this.author;
    }

    @NotNull
    public final String getComments_url() {
        return this.comments_url;
    }

    @NotNull
    public final Commit getCommit() {
        return this.commit;
    }

    @NotNull
    public final CommitterX getCommitter() {
        return this.committer;
    }

    @NotNull
    public final String getHtml_url() {
        return this.html_url;
    }

    @NotNull
    public final String getNode_id() {
        return this.node_id;
    }

    @NotNull
    public final List getParents() {
        return this.parents;
    }

    @NotNull
    public final String getSha() {
        return this.sha;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public CommitListItem(@NotNull Author author, @NotNull String comments_url, @NotNull Commit commit, @NotNull CommitterX committer, @NotNull String html_url, @NotNull String node_id, @NotNull List parents, @NotNull String sha, @NotNull String url) {
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(comments_url, "comments_url");
        Intrinsics.checkNotNullParameter(commit, "commit");
        Intrinsics.checkNotNullParameter(committer, "committer");
        Intrinsics.checkNotNullParameter(html_url, "html_url");
        Intrinsics.checkNotNullParameter(node_id, "node_id");
        Intrinsics.checkNotNullParameter(parents, "parents");
        Intrinsics.checkNotNullParameter(sha, "sha");
        Intrinsics.checkNotNullParameter(url, "url");
        this.author = author;
        this.comments_url = comments_url;
        this.commit = commit;
        this.committer = committer;
        this.html_url = html_url;
        this.node_id = node_id;
        this.parents = parents;
        this.sha = sha;
        this.url = url;
    }

    @NotNull
    public final Author component1() {
        return this.author;
    }

    @NotNull
    public final String component2() {
        return this.comments_url;
    }

    @NotNull
    public final Commit component3() {
        return this.commit;
    }

    @NotNull
    public final CommitterX component4() {
        return this.committer;
    }

    @NotNull
    public final String component5() {
        return this.html_url;
    }

    @NotNull
    public final String component6() {
        return this.node_id;
    }

    @NotNull
    public final List component7() {
        return this.parents;
    }

    @NotNull
    public final String component8() {
        return this.sha;
    }

    @NotNull
    public final String component9() {
        return this.url;
    }

    @NotNull
    public final CommitListItem copy(@NotNull Author author, @NotNull String comments_url, @NotNull Commit commit, @NotNull CommitterX committer, @NotNull String html_url, @NotNull String node_id, @NotNull List parents, @NotNull String sha, @NotNull String url) {
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(comments_url, "comments_url");
        Intrinsics.checkNotNullParameter(commit, "commit");
        Intrinsics.checkNotNullParameter(committer, "committer");
        Intrinsics.checkNotNullParameter(html_url, "html_url");
        Intrinsics.checkNotNullParameter(node_id, "node_id");
        Intrinsics.checkNotNullParameter(parents, "parents");
        Intrinsics.checkNotNullParameter(sha, "sha");
        Intrinsics.checkNotNullParameter(url, "url");
        return new CommitListItem(author, comments_url, commit, committer, html_url, node_id, parents, sha, url);
    }

    // $FF: synthetic method
    public static CommitListItem copy$default(CommitListItem var0, Author var1, String var2, Commit var3, CommitterX var4, String var5, String var6, List var7, String var8, String var9, int var10, Object var11) {
        if ((var10 & 1) != 0) {
            var1 = var0.author;
        }

        if ((var10 & 2) != 0) {
            var2 = var0.comments_url;
        }

        if ((var10 & 4) != 0) {
            var3 = var0.commit;
        }

        if ((var10 & 8) != 0) {
            var4 = var0.committer;
        }

        if ((var10 & 16) != 0) {
            var5 = var0.html_url;
        }

        if ((var10 & 32) != 0) {
            var6 = var0.node_id;
        }

        if ((var10 & 64) != 0) {
            var7 = var0.parents;
        }

        if ((var10 & 128) != 0) {
            var8 = var0.sha;
        }

        if ((var10 & 256) != 0) {
            var9 = var0.url;
        }

        return var0.copy(var1, var2, var3, var4, var5, var6, var7, var8, var9);
    }

    @NotNull
    public String toString() {
        return "CommitListItem(author=" + this.author + ", comments_url=" + this.comments_url + ", commit=" + this.commit + ", committer=" + this.committer + ", html_url=" + this.html_url + ", node_id=" + this.node_id + ", parents=" + this.parents + ", sha=" + this.sha + ", url=" + this.url + ")";
    }

    public int hashCode() {
        Author var10000 = this.author;
        int var1 = (var10000 != null ? var10000.hashCode() : 0) * 31;
        String var10001 = this.comments_url;
        var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        Commit var2 = this.commit;
        var1 = (var1 + (var2 != null ? var2.hashCode() : 0)) * 31;
        CommitterX var3 = this.committer;
        var1 = (var1 + (var3 != null ? var3.hashCode() : 0)) * 31;
        var10001 = this.html_url;
        var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var10001 = this.node_id;
        var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        List var4 = this.parents;
        var1 = (var1 + (var4 != null ? var4.hashCode() : 0)) * 31;
        var10001 = this.sha;
        var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var10001 = this.url;
        return var1 + (var10001 != null ? var10001.hashCode() : 0);
    }

    public boolean equals(@Nullable Object var1) {
        if (this != var1) {
            if (var1 instanceof CommitListItem) {
                CommitListItem var2 = (CommitListItem)var1;
                if (Intrinsics.areEqual(this.author, var2.author) && Intrinsics.areEqual(this.comments_url, var2.comments_url) && Intrinsics.areEqual(this.commit, var2.commit) && Intrinsics.areEqual(this.committer, var2.committer) && Intrinsics.areEqual(this.html_url, var2.html_url) && Intrinsics.areEqual(this.node_id, var2.node_id) && Intrinsics.areEqual(this.parents, var2.parents) && Intrinsics.areEqual(this.sha, var2.sha) && Intrinsics.areEqual(this.url, var2.url)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}

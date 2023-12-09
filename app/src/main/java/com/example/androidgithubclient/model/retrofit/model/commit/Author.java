package com.example.androidgithubclient.model.retrofit.model.commit;

import org.jetbrains.annotations.NotNull;
import kotlin.jvm.internal.Intrinsics;

public class Author {
    @NotNull
    private final String avatar_url;
    @NotNull
    private final String events_url;
    @NotNull
    private final String followers_url;
    @NotNull
    private final String following_url;
    @NotNull
    private final String gists_url;
    @NotNull
    private final String gravatar_id;
    @NotNull
    private final String html_url;
    private final int id;
    @NotNull
    private final String login;
    @NotNull
    private final String node_id;
    @NotNull
    private final String organizations_url;
    @NotNull
    private final String received_events_url;
    @NotNull
    private final String repos_url;
    private final boolean site_admin;
    @NotNull
    private final String starred_url;
    @NotNull
    private final String subscriptions_url;
    @NotNull
    private final String type;
    @NotNull
    private final String url;

    @NotNull
    public final String getAvatar_url() {
        return this.avatar_url;
    }

    @NotNull
    public final String getEvents_url() {
        return this.events_url;
    }

    @NotNull
    public final String getFollowers_url() {
        return this.followers_url;
    }

    @NotNull
    public final String getFollowing_url() {
        return this.following_url;
    }

    @NotNull
    public final String getGists_url() {
        return this.gists_url;
    }

    @NotNull
    public final String getGravatar_id() {
        return this.gravatar_id;
    }

    @NotNull
    public final String getHtml_url() {
        return this.html_url;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getLogin() {
        return this.login;
    }

    @NotNull
    public final String getNode_id() {
        return this.node_id;
    }

    @NotNull
    public final String getOrganizations_url() {
        return this.organizations_url;
    }

    @NotNull
    public final String getReceived_events_url() {
        return this.received_events_url;
    }

    @NotNull
    public final String getRepos_url() {
        return this.repos_url;
    }

    public final boolean getSite_admin() {
        return this.site_admin;
    }

    @NotNull
    public final String getStarred_url() {
        return this.starred_url;
    }

    @NotNull
    public final String getSubscriptions_url() {
        return this.subscriptions_url;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public Author(@NotNull String avatar_url, @NotNull String events_url, @NotNull String followers_url, @NotNull String following_url, @NotNull String gists_url, @NotNull String gravatar_id, @NotNull String html_url, int id, @NotNull String login, @NotNull String node_id, @NotNull String organizations_url, @NotNull String received_events_url, @NotNull String repos_url, boolean site_admin, @NotNull String starred_url, @NotNull String subscriptions_url, @NotNull String type, @NotNull String url) {
        Intrinsics.checkNotNullParameter(avatar_url, "avatar_url");
        Intrinsics.checkNotNullParameter(events_url, "events_url");
        Intrinsics.checkNotNullParameter(followers_url, "followers_url");
        Intrinsics.checkNotNullParameter(following_url, "following_url");
        Intrinsics.checkNotNullParameter(gists_url, "gists_url");
        Intrinsics.checkNotNullParameter(gravatar_id, "gravatar_id");
        Intrinsics.checkNotNullParameter(html_url, "html_url");
        Intrinsics.checkNotNullParameter(login, "login");
        Intrinsics.checkNotNullParameter(node_id, "node_id");
        Intrinsics.checkNotNullParameter(organizations_url, "organizations_url");
        Intrinsics.checkNotNullParameter(received_events_url, "received_events_url");
        Intrinsics.checkNotNullParameter(repos_url, "repos_url");
        Intrinsics.checkNotNullParameter(starred_url, "starred_url");
        Intrinsics.checkNotNullParameter(subscriptions_url, "subscriptions_url");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(url, "url");
        this.avatar_url = avatar_url;
        this.events_url = events_url;
        this.followers_url = followers_url;
        this.following_url = following_url;
        this.gists_url = gists_url;
        this.gravatar_id = gravatar_id;
        this.html_url = html_url;
        this.id = id;
        this.login = login;
        this.node_id = node_id;
        this.organizations_url = organizations_url;
        this.received_events_url = received_events_url;
        this.repos_url = repos_url;
        this.site_admin = site_admin;
        this.starred_url = starred_url;
        this.subscriptions_url = subscriptions_url;
        this.type = type;
        this.url = url;
    }

    @NotNull
    public final String component1() {
        return this.avatar_url;
    }

    @NotNull
    public final String component2() {
        return this.events_url;
    }

    @NotNull
    public final String component3() {
        return this.followers_url;
    }

    @NotNull
    public final String component4() {
        return this.following_url;
    }

    @NotNull
    public final String component5() {
        return this.gists_url;
    }

    @NotNull
    public final String component6() {
        return this.gravatar_id;
    }

    @NotNull
    public final String component7() {
        return this.html_url;
    }

    public final int component8() {
        return this.id;
    }

    @NotNull
    public final String component9() {
        return this.login;
    }

    @NotNull
    public final String component10() {
        return this.node_id;
    }

    @NotNull
    public final String component11() {
        return this.organizations_url;
    }

    @NotNull
    public final String component12() {
        return this.received_events_url;
    }

    @NotNull
    public final String component13() {
        return this.repos_url;
    }

    public final boolean component14() {
        return this.site_admin;
    }

    @NotNull
    public final String component15() {
        return this.starred_url;
    }

    @NotNull
    public final String component16() {
        return this.subscriptions_url;
    }

    @NotNull
    public final String component17() {
        return this.type;
    }

    @NotNull
    public final String component18() {
        return this.url;
    }

    @NotNull
    public final Author copy(@NotNull String avatar_url, @NotNull String events_url, @NotNull String followers_url, @NotNull String following_url, @NotNull String gists_url, @NotNull String gravatar_id, @NotNull String html_url, int id, @NotNull String login, @NotNull String node_id, @NotNull String organizations_url, @NotNull String received_events_url, @NotNull String repos_url, boolean site_admin, @NotNull String starred_url, @NotNull String subscriptions_url, @NotNull String type, @NotNull String url) {
        Intrinsics.checkNotNullParameter(avatar_url, "avatar_url");
        Intrinsics.checkNotNullParameter(events_url, "events_url");
        Intrinsics.checkNotNullParameter(followers_url, "followers_url");
        Intrinsics.checkNotNullParameter(following_url, "following_url");
        Intrinsics.checkNotNullParameter(gists_url, "gists_url");
        Intrinsics.checkNotNullParameter(gravatar_id, "gravatar_id");
        Intrinsics.checkNotNullParameter(html_url, "html_url");
        Intrinsics.checkNotNullParameter(login, "login");
        Intrinsics.checkNotNullParameter(node_id, "node_id");
        Intrinsics.checkNotNullParameter(organizations_url, "organizations_url");
        Intrinsics.checkNotNullParameter(received_events_url, "received_events_url");
        Intrinsics.checkNotNullParameter(repos_url, "repos_url");
        Intrinsics.checkNotNullParameter(starred_url, "starred_url");
        Intrinsics.checkNotNullParameter(subscriptions_url, "subscriptions_url");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(url, "url");
        return new Author(avatar_url, events_url, followers_url, following_url, gists_url, gravatar_id, html_url, id, login, node_id, organizations_url, received_events_url, repos_url, site_admin, starred_url, subscriptions_url, type, url);
    }

    // $FF: synthetic method
    public static Author copy$default(Author var0, String var1, String var2, String var3, String var4, String var5, String var6, String var7, int var8, String var9, String var10, String var11, String var12, String var13, boolean var14, String var15, String var16, String var17, String var18, int var19, Object var20) {
        if ((var19 & 1) != 0) {
            var1 = var0.avatar_url;
        }

        if ((var19 & 2) != 0) {
            var2 = var0.events_url;
        }

        if ((var19 & 4) != 0) {
            var3 = var0.followers_url;
        }

        if ((var19 & 8) != 0) {
            var4 = var0.following_url;
        }

        if ((var19 & 16) != 0) {
            var5 = var0.gists_url;
        }

        if ((var19 & 32) != 0) {
            var6 = var0.gravatar_id;
        }

        if ((var19 & 64) != 0) {
            var7 = var0.html_url;
        }

        if ((var19 & 128) != 0) {
            var8 = var0.id;
        }

        if ((var19 & 256) != 0) {
            var9 = var0.login;
        }

        if ((var19 & 512) != 0) {
            var10 = var0.node_id;
        }

        if ((var19 & 1024) != 0) {
            var11 = var0.organizations_url;
        }

        if ((var19 & 2048) != 0) {
            var12 = var0.received_events_url;
        }

        if ((var19 & 4096) != 0) {
            var13 = var0.repos_url;
        }

        if ((var19 & 8192) != 0) {
            var14 = var0.site_admin;
        }

        if ((var19 & 16384) != 0) {
            var15 = var0.starred_url;
        }

        if ((var19 & '耀') != 0) {
            var16 = var0.subscriptions_url;
        }

        if ((var19 & 65536) != 0) {
            var17 = var0.type;
        }

        if ((var19 & 131072) != 0) {
            var18 = var0.url;
        }

        return var0.copy(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18);
    }

    @NotNull
    public String toString() {
        return "Author(avatar_url=" + this.avatar_url + ", events_url=" + this.events_url + ", followers_url=" + this.followers_url + ", following_url=" + this.following_url + ", gists_url=" + this.gists_url + ", gravatar_id=" + this.gravatar_id + ", html_url=" + this.html_url + ", id=" + this.id + ", login=" + this.login + ", node_id=" + this.node_id + ", organizations_url=" + this.organizations_url + ", received_events_url=" + this.received_events_url + ", repos_url=" + this.repos_url + ", site_admin=" + this.site_admin + ", starred_url=" + this.starred_url + ", subscriptions_url=" + this.subscriptions_url + ", type=" + this.type + ", url=" + this.url + ")";
    }
}

package com.example.androidgithubclient.model.retrofit.model.repos;

import org.jetbrains.annotations.NotNull;
import java.util.List;

import kotlin.jvm.internal.Intrinsics;

public  class RepositoryListItem {
    @NotNull
    private final String archive_url;
    private final boolean archived;
    @NotNull
    private final String assignees_url;
    @NotNull
    private final String blobs_url;
    @NotNull
    private final String branches_url;
    @NotNull
    private final String clone_url;
    @NotNull
    private final String collaborators_url;
    @NotNull
    private final String comments_url;
    @NotNull
    private final String commits_url;
    @NotNull
    private final String compare_url;
    @NotNull
    private final String contents_url;
    @NotNull
    private final String contributors_url;
    @NotNull
    private final String created_at;
    @NotNull
    private final String default_branch;
    @NotNull
    private final String deployments_url;
    @NotNull
    private final String description;
    private final boolean disabled;
    @NotNull
    private final String downloads_url;
    @NotNull
    private final String events_url;
    private final boolean fork;
    private final int forks_count;
    @NotNull
    private final String forks_url;
    @NotNull
    private final String full_name;
    @NotNull
    private final String git_commits_url;
    @NotNull
    private final String git_refs_url;
    @NotNull
    private final String git_tags_url;
    @NotNull
    private final String git_url;
    private final boolean has_downloads;
    private final boolean has_issues;
    private final boolean has_pages;
    private final boolean has_projects;
    private final boolean has_wiki;
    @NotNull
    private final String homepage;
    @NotNull
    private final String hooks_url;
    @NotNull
    private final String html_url;
    private final int id;
    private final boolean is_template;
    @NotNull
    private final String issue_comment_url;
    @NotNull
    private final String issue_events_url;
    @NotNull
    private final String issues_url;
    @NotNull
    private final String keys_url;
    @NotNull
    private final String labels_url;
    @NotNull
    private final Object language;
    @NotNull
    private final String languages_url;
    @NotNull
    private final String merges_url;
    @NotNull
    private final String milestones_url;
    @NotNull
    private final String mirror_url;
    @NotNull
    private final String name;
    @NotNull
    private final String node_id;
    @NotNull
    private final String notifications_url;
    private final int open_issues_count;
    @NotNull
    private final Owner owner;
    @NotNull
    private final Permissions permissions;
    @NotNull
    private final String pulls_url;
    @NotNull
    private final String pushed_at;
    @NotNull
    private final String releases_url;
    private final int size;
    @NotNull
    private final String ssh_url;
    private final int stargazers_count;
    @NotNull
    private final String stargazers_url;
    @NotNull
    private final String statuses_url;
    @NotNull
    private final String subscribers_url;
    @NotNull
    private final String subscription_url;
    @NotNull
    private final String svn_url;
    @NotNull
    private final String tags_url;
    @NotNull
    private final String teams_url;
    @NotNull
    private final Object template_repository;
    @NotNull
    private final List topics;
    @NotNull
    private final String trees_url;
    @NotNull
    private final String updated_at;
    @NotNull
    private final String url;
    @NotNull
    private final String visibility;
    private final int watchers_count;

    @NotNull
    public final String getArchive_url() {
        return this.archive_url;
    }

    public final boolean getArchived() {
        return this.archived;
    }

    @NotNull
    public final String getAssignees_url() {
        return this.assignees_url;
    }

    @NotNull
    public final String getBlobs_url() {
        return this.blobs_url;
    }

    @NotNull
    public final String getBranches_url() {
        return this.branches_url;
    }

    @NotNull
    public final String getClone_url() {
        return this.clone_url;
    }

    @NotNull
    public final String getCollaborators_url() {
        return this.collaborators_url;
    }

    @NotNull
    public final String getComments_url() {
        return this.comments_url;
    }

    @NotNull
    public final String getCommits_url() {
        return this.commits_url;
    }

    @NotNull
    public final String getCompare_url() {
        return this.compare_url;
    }

    @NotNull
    public final String getContents_url() {
        return this.contents_url;
    }

    @NotNull
    public final String getContributors_url() {
        return this.contributors_url;
    }

    @NotNull
    public final String getCreated_at() {
        return this.created_at;
    }

    @NotNull
    public final String getDefault_branch() {
        return this.default_branch;
    }

    @NotNull
    public final String getDeployments_url() {
        return this.deployments_url;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final boolean getDisabled() {
        return this.disabled;
    }

    @NotNull
    public final String getDownloads_url() {
        return this.downloads_url;
    }

    @NotNull
    public final String getEvents_url() {
        return this.events_url;
    }

    public final boolean getFork() {
        return this.fork;
    }

    public final int getForks_count() {
        return this.forks_count;
    }

    @NotNull
    public final String getForks_url() {
        return this.forks_url;
    }

    @NotNull
    public final String getFull_name() {
        return this.full_name;
    }

    @NotNull
    public final String getGit_commits_url() {
        return this.git_commits_url;
    }

    @NotNull
    public final String getGit_refs_url() {
        return this.git_refs_url;
    }

    @NotNull
    public final String getGit_tags_url() {
        return this.git_tags_url;
    }

    @NotNull
    public final String getGit_url() {
        return this.git_url;
    }

    public final boolean getHas_downloads() {
        return this.has_downloads;
    }

    public final boolean getHas_issues() {
        return this.has_issues;
    }

    public final boolean getHas_pages() {
        return this.has_pages;
    }

    public final boolean getHas_projects() {
        return this.has_projects;
    }

    public final boolean getHas_wiki() {
        return this.has_wiki;
    }

    @NotNull
    public final String getHomepage() {
        return this.homepage;
    }

    @NotNull
    public final String getHooks_url() {
        return this.hooks_url;
    }

    @NotNull
    public final String getHtml_url() {
        return this.html_url;
    }

    public final int getId() {
        return this.id;
    }

    public final boolean is_template() {
        return this.is_template;
    }

    @NotNull
    public final String getIssue_comment_url() {
        return this.issue_comment_url;
    }

    @NotNull
    public final String getIssue_events_url() {
        return this.issue_events_url;
    }

    @NotNull
    public final String getIssues_url() {
        return this.issues_url;
    }

    @NotNull
    public final String getKeys_url() {
        return this.keys_url;
    }

    @NotNull
    public final String getLabels_url() {
        return this.labels_url;
    }

    @NotNull
    public final Object getLanguage() {
        return this.language;
    }

    @NotNull
    public final String getLanguages_url() {
        return this.languages_url;
    }

    @NotNull
    public final String getMerges_url() {
        return this.merges_url;
    }

    @NotNull
    public final String getMilestones_url() {
        return this.milestones_url;
    }

    @NotNull
    public final String getMirror_url() {
        return this.mirror_url;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getNode_id() {
        return this.node_id;
    }

    @NotNull
    public final String getNotifications_url() {
        return this.notifications_url;
    }

    public final int getOpen_issues_count() {
        return this.open_issues_count;
    }

    @NotNull
    public final Owner getOwner() {
        return this.owner;
    }

    @NotNull
    public final Permissions getPermissions() {
        return this.permissions;
    }

    @NotNull
    public final String getPulls_url() {
        return this.pulls_url;
    }

    @NotNull
    public final String getPushed_at() {
        return this.pushed_at;
    }

    @NotNull
    public final String getReleases_url() {
        return this.releases_url;
    }

    public final int getSize() {
        return this.size;
    }

    @NotNull
    public final String getSsh_url() {
        return this.ssh_url;
    }

    public final int getStargazers_count() {
        return this.stargazers_count;
    }

    @NotNull
    public final String getStargazers_url() {
        return this.stargazers_url;
    }

    @NotNull
    public final String getStatuses_url() {
        return this.statuses_url;
    }

    @NotNull
    public final String getSubscribers_url() {
        return this.subscribers_url;
    }

    @NotNull
    public final String getSubscription_url() {
        return this.subscription_url;
    }

    @NotNull
    public final String getSvn_url() {
        return this.svn_url;
    }

    @NotNull
    public final String getTags_url() {
        return this.tags_url;
    }

    @NotNull
    public final String getTeams_url() {
        return this.teams_url;
    }

    @NotNull
    public final Object getTemplate_repository() {
        return this.template_repository;
    }

    @NotNull
    public final List getTopics() {
        return this.topics;
    }

    @NotNull
    public final String getTrees_url() {
        return this.trees_url;
    }

    @NotNull
    public final String getUpdated_at() {
        return this.updated_at;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final String getVisibility() {
        return this.visibility;
    }

    public final int getWatchers_count() {
        return this.watchers_count;
    }

    public RepositoryListItem(@NotNull String archive_url, boolean archived, @NotNull String assignees_url, @NotNull String blobs_url, @NotNull String branches_url, @NotNull String clone_url, @NotNull String collaborators_url, @NotNull String comments_url, @NotNull String commits_url, @NotNull String compare_url, @NotNull String contents_url, @NotNull String contributors_url, @NotNull String created_at, @NotNull String default_branch, @NotNull String deployments_url, @NotNull String description, boolean disabled, @NotNull String downloads_url, @NotNull String events_url, boolean fork, int forks_count, @NotNull String forks_url, @NotNull String full_name, @NotNull String git_commits_url, @NotNull String git_refs_url, @NotNull String git_tags_url, @NotNull String git_url, boolean has_downloads, boolean has_issues, boolean has_pages, boolean has_projects, boolean has_wiki, @NotNull String homepage, @NotNull String hooks_url, @NotNull String html_url, int id, boolean is_template, @NotNull String issue_comment_url, @NotNull String issue_events_url, @NotNull String issues_url, @NotNull String keys_url, @NotNull String labels_url, @NotNull Object language, @NotNull String languages_url, @NotNull String merges_url, @NotNull String milestones_url, @NotNull String mirror_url, @NotNull String name, @NotNull String node_id, @NotNull String notifications_url, int open_issues_count, @NotNull Owner owner, @NotNull Permissions permissions, boolean var54, @NotNull String pulls_url, @NotNull String pushed_at, @NotNull String releases_url, int size, @NotNull String ssh_url, int stargazers_count, @NotNull String stargazers_url, @NotNull String statuses_url, @NotNull String subscribers_url, @NotNull String subscription_url, @NotNull String svn_url, @NotNull String tags_url, @NotNull String teams_url, @NotNull Object template_repository, @NotNull List topics, @NotNull String trees_url, @NotNull String updated_at, @NotNull String url, @NotNull String visibility, int watchers_count) {
        Intrinsics.checkNotNullParameter(archive_url, "archive_url");
        Intrinsics.checkNotNullParameter(assignees_url, "assignees_url");
        Intrinsics.checkNotNullParameter(blobs_url, "blobs_url");
        Intrinsics.checkNotNullParameter(branches_url, "branches_url");
        Intrinsics.checkNotNullParameter(clone_url, "clone_url");
        Intrinsics.checkNotNullParameter(collaborators_url, "collaborators_url");
        Intrinsics.checkNotNullParameter(comments_url, "comments_url");
        Intrinsics.checkNotNullParameter(commits_url, "commits_url");
        Intrinsics.checkNotNullParameter(compare_url, "compare_url");
        Intrinsics.checkNotNullParameter(contents_url, "contents_url");
        Intrinsics.checkNotNullParameter(contributors_url, "contributors_url");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(default_branch, "default_branch");
        Intrinsics.checkNotNullParameter(deployments_url, "deployments_url");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(downloads_url, "downloads_url");
        Intrinsics.checkNotNullParameter(events_url, "events_url");
        Intrinsics.checkNotNullParameter(forks_url, "forks_url");
        Intrinsics.checkNotNullParameter(full_name, "full_name");
        Intrinsics.checkNotNullParameter(git_commits_url, "git_commits_url");
        Intrinsics.checkNotNullParameter(git_refs_url, "git_refs_url");
        Intrinsics.checkNotNullParameter(git_tags_url, "git_tags_url");
        Intrinsics.checkNotNullParameter(git_url, "git_url");
        Intrinsics.checkNotNullParameter(homepage, "homepage");
        Intrinsics.checkNotNullParameter(hooks_url, "hooks_url");
        Intrinsics.checkNotNullParameter(html_url, "html_url");
        Intrinsics.checkNotNullParameter(issue_comment_url, "issue_comment_url");
        Intrinsics.checkNotNullParameter(issue_events_url, "issue_events_url");
        Intrinsics.checkNotNullParameter(issues_url, "issues_url");
        Intrinsics.checkNotNullParameter(keys_url, "keys_url");
        Intrinsics.checkNotNullParameter(labels_url, "labels_url");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(languages_url, "languages_url");
        Intrinsics.checkNotNullParameter(merges_url, "merges_url");
        Intrinsics.checkNotNullParameter(milestones_url, "milestones_url");
        Intrinsics.checkNotNullParameter(mirror_url, "mirror_url");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(node_id, "node_id");
        Intrinsics.checkNotNullParameter(notifications_url, "notifications_url");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(pulls_url, "pulls_url");
        Intrinsics.checkNotNullParameter(pushed_at, "pushed_at");
        Intrinsics.checkNotNullParameter(releases_url, "releases_url");
        Intrinsics.checkNotNullParameter(ssh_url, "ssh_url");
        Intrinsics.checkNotNullParameter(stargazers_url, "stargazers_url");
        Intrinsics.checkNotNullParameter(statuses_url, "statuses_url");
        Intrinsics.checkNotNullParameter(subscribers_url, "subscribers_url");
        Intrinsics.checkNotNullParameter(subscription_url, "subscription_url");
        Intrinsics.checkNotNullParameter(svn_url, "svn_url");
        Intrinsics.checkNotNullParameter(tags_url, "tags_url");
        Intrinsics.checkNotNullParameter(teams_url, "teams_url");
        Intrinsics.checkNotNullParameter(template_repository, "template_repository");
        Intrinsics.checkNotNullParameter(topics, "topics");
        Intrinsics.checkNotNullParameter(trees_url, "trees_url");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        this.archive_url = archive_url;
        this.archived = archived;
        this.assignees_url = assignees_url;
        this.blobs_url = blobs_url;
        this.branches_url = branches_url;
        this.clone_url = clone_url;
        this.collaborators_url = collaborators_url;
        this.comments_url = comments_url;
        this.commits_url = commits_url;
        this.compare_url = compare_url;
        this.contents_url = contents_url;
        this.contributors_url = contributors_url;
        this.created_at = created_at;
        this.default_branch = default_branch;
        this.deployments_url = deployments_url;
        this.description = description;
        this.disabled = disabled;
        this.downloads_url = downloads_url;
        this.events_url = events_url;
        this.fork = fork;
        this.forks_count = forks_count;
        this.forks_url = forks_url;
        this.full_name = full_name;
        this.git_commits_url = git_commits_url;
        this.git_refs_url = git_refs_url;
        this.git_tags_url = git_tags_url;
        this.git_url = git_url;
        this.has_downloads = has_downloads;
        this.has_issues = has_issues;
        this.has_pages = has_pages;
        this.has_projects = has_projects;
        this.has_wiki = has_wiki;
        this.homepage = homepage;
        this.hooks_url = hooks_url;
        this.html_url = html_url;
        this.id = id;
        this.is_template = is_template;
        this.issue_comment_url = issue_comment_url;
        this.issue_events_url = issue_events_url;
        this.issues_url = issues_url;
        this.keys_url = keys_url;
        this.labels_url = labels_url;
        this.language = language;
        this.languages_url = languages_url;
        this.merges_url = merges_url;
        this.milestones_url = milestones_url;
        this.mirror_url = mirror_url;
        this.name = name;
        this.node_id = node_id;
        this.notifications_url = notifications_url;
        this.open_issues_count = open_issues_count;
        this.owner = owner;
        this.permissions = permissions;
        this.pulls_url = pulls_url;
        this.pushed_at = pushed_at;
        this.releases_url = releases_url;
        this.size = size;
        this.ssh_url = ssh_url;
        this.stargazers_count = stargazers_count;
        this.stargazers_url = stargazers_url;
        this.statuses_url = statuses_url;
        this.subscribers_url = subscribers_url;
        this.subscription_url = subscription_url;
        this.svn_url = svn_url;
        this.tags_url = tags_url;
        this.teams_url = teams_url;
        this.template_repository = template_repository;
        this.topics = topics;
        this.trees_url = trees_url;
        this.updated_at = updated_at;
        this.url = url;
        this.visibility = visibility;
        this.watchers_count = watchers_count;
    }

    @NotNull
    public final String component1() {
        return this.archive_url;
    }

    public final boolean component2() {
        return this.archived;
    }

    @NotNull
    public final String component3() {
        return this.assignees_url;
    }

    @NotNull
    public final String component4() {
        return this.blobs_url;
    }

    @NotNull
    public final String component5() {
        return this.branches_url;
    }

    @NotNull
    public final String component6() {
        return this.clone_url;
    }

    @NotNull
    public final String component7() {
        return this.collaborators_url;
    }

    @NotNull
    public final String component8() {
        return this.comments_url;
    }

    @NotNull
    public final String component9() {
        return this.commits_url;
    }

    @NotNull
    public final String component10() {
        return this.compare_url;
    }

    @NotNull
    public final String component11() {
        return this.contents_url;
    }

    @NotNull
    public final String component12() {
        return this.contributors_url;
    }

    @NotNull
    public final String component13() {
        return this.created_at;
    }

    @NotNull
    public final String component14() {
        return this.default_branch;
    }

    @NotNull
    public final String component15() {
        return this.deployments_url;
    }

    @NotNull
    public final String component16() {
        return this.description;
    }

    public final boolean component17() {
        return this.disabled;
    }

    @NotNull
    public final String component18() {
        return this.downloads_url;
    }

    @NotNull
    public final String component19() {
        return this.events_url;
    }

    public final boolean component20() {
        return this.fork;
    }

    public final int component21() {
        return this.forks_count;
    }

    @NotNull
    public final String component22() {
        return this.forks_url;
    }

    @NotNull
    public final String component23() {
        return this.full_name;
    }

    @NotNull
    public final String component24() {
        return this.git_commits_url;
    }

    @NotNull
    public final String component25() {
        return this.git_refs_url;
    }

    @NotNull
    public final String component26() {
        return this.git_tags_url;
    }

    @NotNull
    public final String component27() {
        return this.git_url;
    }

    public final boolean component28() {
        return this.has_downloads;
    }

    public final boolean component29() {
        return this.has_issues;
    }

    public final boolean component30() {
        return this.has_pages;
    }

    public final boolean component31() {
        return this.has_projects;
    }

    public final boolean component32() {
        return this.has_wiki;
    }

    @NotNull
    public final String component33() {
        return this.homepage;
    }

    @NotNull
    public final String component34() {
        return this.hooks_url;
    }

    @NotNull
    public final String component35() {
        return this.html_url;
    }

    public final int component36() {
        return this.id;
    }

    public final boolean component37() {
        return this.is_template;
    }

    @NotNull
    public final String component38() {
        return this.issue_comment_url;
    }

    @NotNull
    public final String component39() {
        return this.issue_events_url;
    }

    @NotNull
    public final String component40() {
        return this.issues_url;
    }

    @NotNull
    public final String component41() {
        return this.keys_url;
    }

    @NotNull
    public final String component42() {
        return this.labels_url;
    }

    @NotNull
    public final Object component43() {
        return this.language;
    }

    @NotNull
    public final String component44() {
        return this.languages_url;
    }

    @NotNull
    public final String component45() {
        return this.merges_url;
    }

    @NotNull
    public final String component46() {
        return this.milestones_url;
    }

    @NotNull
    public final String component47() {
        return this.mirror_url;
    }

    @NotNull
    public final String component48() {
        return this.name;
    }

    @NotNull
    public final String component49() {
        return this.node_id;
    }

    @NotNull
    public final String component50() {
        return this.notifications_url;
    }

    public final int component51() {
        return this.open_issues_count;
    }

    @NotNull
    public final Owner component52() {
        return this.owner;
    }

    @NotNull
    public final Permissions component53() {
        return this.permissions;
    }

    @NotNull
    public final String component55() {
        return this.pulls_url;
    }

    @NotNull
    public final String component56() {
        return this.pushed_at;
    }

    @NotNull
    public final String component57() {
        return this.releases_url;
    }

    public final int component58() {
        return this.size;
    }

    @NotNull
    public final String component59() {
        return this.ssh_url;
    }

    public final int component60() {
        return this.stargazers_count;
    }

    @NotNull
    public final String component61() {
        return this.stargazers_url;
    }

    @NotNull
    public final String component62() {
        return this.statuses_url;
    }

    @NotNull
    public final String component63() {
        return this.subscribers_url;
    }

    @NotNull
    public final String component64() {
        return this.subscription_url;
    }

    @NotNull
    public final String component65() {
        return this.svn_url;
    }

    @NotNull
    public final String component66() {
        return this.tags_url;
    }

    @NotNull
    public final String component67() {
        return this.teams_url;
    }

    @NotNull
    public final Object component68() {
        return this.template_repository;
    }

    @NotNull
    public final List component69() {
        return this.topics;
    }

    @NotNull
    public final String component70() {
        return this.trees_url;
    }

    @NotNull
    public final String component71() {
        return this.updated_at;
    }

    @NotNull
    public final String component72() {
        return this.url;
    }

    @NotNull
    public final String component73() {
        return this.visibility;
    }

    public final int component74() {
        return this.watchers_count;
    }

    @NotNull
    public final RepositoryListItem copy(@NotNull String archive_url, boolean archived, @NotNull String assignees_url, @NotNull String blobs_url, @NotNull String branches_url, @NotNull String clone_url, @NotNull String collaborators_url, @NotNull String comments_url, @NotNull String commits_url, @NotNull String compare_url, @NotNull String contents_url, @NotNull String contributors_url, @NotNull String created_at, @NotNull String default_branch, @NotNull String deployments_url, @NotNull String description, boolean disabled, @NotNull String downloads_url, @NotNull String events_url, boolean fork, int forks_count, @NotNull String forks_url, @NotNull String full_name, @NotNull String git_commits_url, @NotNull String git_refs_url, @NotNull String git_tags_url, @NotNull String git_url, boolean has_downloads, boolean has_issues, boolean has_pages, boolean has_projects, boolean has_wiki, @NotNull String homepage, @NotNull String hooks_url, @NotNull String html_url, int id, boolean is_template, @NotNull String issue_comment_url, @NotNull String issue_events_url, @NotNull String issues_url, @NotNull String keys_url, @NotNull String labels_url, @NotNull Object language, @NotNull String languages_url, @NotNull String merges_url, @NotNull String milestones_url, @NotNull String mirror_url, @NotNull String name, @NotNull String node_id, @NotNull String notifications_url, int open_issues_count, @NotNull Owner owner, @NotNull Permissions permissions, boolean var54, @NotNull String pulls_url, @NotNull String pushed_at, @NotNull String releases_url, int size, @NotNull String ssh_url, int stargazers_count, @NotNull String stargazers_url, @NotNull String statuses_url, @NotNull String subscribers_url, @NotNull String subscription_url, @NotNull String svn_url, @NotNull String tags_url, @NotNull String teams_url, @NotNull Object template_repository, @NotNull List topics, @NotNull String trees_url, @NotNull String updated_at, @NotNull String url, @NotNull String visibility, int watchers_count) {
        Intrinsics.checkNotNullParameter(archive_url, "archive_url");
        Intrinsics.checkNotNullParameter(assignees_url, "assignees_url");
        Intrinsics.checkNotNullParameter(blobs_url, "blobs_url");
        Intrinsics.checkNotNullParameter(branches_url, "branches_url");
        Intrinsics.checkNotNullParameter(clone_url, "clone_url");
        Intrinsics.checkNotNullParameter(collaborators_url, "collaborators_url");
        Intrinsics.checkNotNullParameter(comments_url, "comments_url");
        Intrinsics.checkNotNullParameter(commits_url, "commits_url");
        Intrinsics.checkNotNullParameter(compare_url, "compare_url");
        Intrinsics.checkNotNullParameter(contents_url, "contents_url");
        Intrinsics.checkNotNullParameter(contributors_url, "contributors_url");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(default_branch, "default_branch");
        Intrinsics.checkNotNullParameter(deployments_url, "deployments_url");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(downloads_url, "downloads_url");
        Intrinsics.checkNotNullParameter(events_url, "events_url");
        Intrinsics.checkNotNullParameter(forks_url, "forks_url");
        Intrinsics.checkNotNullParameter(full_name, "full_name");
        Intrinsics.checkNotNullParameter(git_commits_url, "git_commits_url");
        Intrinsics.checkNotNullParameter(git_refs_url, "git_refs_url");
        Intrinsics.checkNotNullParameter(git_tags_url, "git_tags_url");
        Intrinsics.checkNotNullParameter(git_url, "git_url");
        Intrinsics.checkNotNullParameter(homepage, "homepage");
        Intrinsics.checkNotNullParameter(hooks_url, "hooks_url");
        Intrinsics.checkNotNullParameter(html_url, "html_url");
        Intrinsics.checkNotNullParameter(issue_comment_url, "issue_comment_url");
        Intrinsics.checkNotNullParameter(issue_events_url, "issue_events_url");
        Intrinsics.checkNotNullParameter(issues_url, "issues_url");
        Intrinsics.checkNotNullParameter(keys_url, "keys_url");
        Intrinsics.checkNotNullParameter(labels_url, "labels_url");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(languages_url, "languages_url");
        Intrinsics.checkNotNullParameter(merges_url, "merges_url");
        Intrinsics.checkNotNullParameter(milestones_url, "milestones_url");
        Intrinsics.checkNotNullParameter(mirror_url, "mirror_url");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(node_id, "node_id");
        Intrinsics.checkNotNullParameter(notifications_url, "notifications_url");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(pulls_url, "pulls_url");
        Intrinsics.checkNotNullParameter(pushed_at, "pushed_at");
        Intrinsics.checkNotNullParameter(releases_url, "releases_url");
        Intrinsics.checkNotNullParameter(ssh_url, "ssh_url");
        Intrinsics.checkNotNullParameter(stargazers_url, "stargazers_url");
        Intrinsics.checkNotNullParameter(statuses_url, "statuses_url");
        Intrinsics.checkNotNullParameter(subscribers_url, "subscribers_url");
        Intrinsics.checkNotNullParameter(subscription_url, "subscription_url");
        Intrinsics.checkNotNullParameter(svn_url, "svn_url");
        Intrinsics.checkNotNullParameter(tags_url, "tags_url");
        Intrinsics.checkNotNullParameter(teams_url, "teams_url");
        Intrinsics.checkNotNullParameter(template_repository, "template_repository");
        Intrinsics.checkNotNullParameter(topics, "topics");
        Intrinsics.checkNotNullParameter(trees_url, "trees_url");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        return new RepositoryListItem(archive_url, archived, assignees_url, blobs_url, branches_url, clone_url, collaborators_url, comments_url, commits_url, compare_url, contents_url, contributors_url, created_at, default_branch, deployments_url, description, disabled, downloads_url, events_url, fork, forks_count, forks_url, full_name, git_commits_url, git_refs_url, git_tags_url, git_url, has_downloads, has_issues, has_pages, has_projects, has_wiki, homepage, hooks_url, html_url, id, is_template, issue_comment_url, issue_events_url, issues_url, keys_url, labels_url, language, languages_url, merges_url, milestones_url, mirror_url, name, node_id, notifications_url, open_issues_count, owner, permissions, var54, pulls_url, pushed_at, releases_url, size, ssh_url, stargazers_count, stargazers_url, statuses_url, subscribers_url, subscription_url, svn_url, tags_url, teams_url, template_repository, topics, trees_url, updated_at, url, visibility, watchers_count);
    }

    // $FF: synthetic method
    public static RepositoryListItem copy$default(RepositoryListItem var0, String var1, boolean var2, String var3, String var4, String var5, String var6, String var7, String var8, String var9, String var10, String var11, String var12, String var13, String var14, String var15, String var16, boolean var17, String var18, String var19, boolean var20, int var21, String var22, String var23, String var24, String var25, String var26, String var27, boolean var28, boolean var29, boolean var30, boolean var31, boolean var32, String var33, String var34, String var35, int var36, boolean var37, String var38, String var39, String var40, String var41, String var42, Object var43, String var44, String var45, String var46, String var47, String var48, String var49, String var50, int var51, Owner var52, Permissions var53, boolean var54, String var55, String var56, String var57, int var58, String var59, int var60, String var61, String var62, String var63, String var64, String var65, String var66, String var67, Object var68, List var69, String var70, String var71, String var72, String var73, int var74, int var75, int var76, int var77, Object var78) {
        if ((var75 & 1) != 0) {
            var1 = var0.archive_url;
        }

        if ((var75 & 2) != 0) {
            var2 = var0.archived;
        }

        if ((var75 & 4) != 0) {
            var3 = var0.assignees_url;
        }

        if ((var75 & 8) != 0) {
            var4 = var0.blobs_url;
        }

        if ((var75 & 16) != 0) {
            var5 = var0.branches_url;
        }

        if ((var75 & 32) != 0) {
            var6 = var0.clone_url;
        }

        if ((var75 & 64) != 0) {
            var7 = var0.collaborators_url;
        }

        if ((var75 & 128) != 0) {
            var8 = var0.comments_url;
        }

        if ((var75 & 256) != 0) {
            var9 = var0.commits_url;
        }

        if ((var75 & 512) != 0) {
            var10 = var0.compare_url;
        }

        if ((var75 & 1024) != 0) {
            var11 = var0.contents_url;
        }

        if ((var75 & 2048) != 0) {
            var12 = var0.contributors_url;
        }

        if ((var75 & 4096) != 0) {
            var13 = var0.created_at;
        }

        if ((var75 & 8192) != 0) {
            var14 = var0.default_branch;
        }

        if ((var75 & 16384) != 0) {
            var15 = var0.deployments_url;
        }

        if ((var75 & '耀') != 0) {
            var16 = var0.description;
        }

        if ((var75 & 65536) != 0) {
            var17 = var0.disabled;
        }

        if ((var75 & 131072) != 0) {
            var18 = var0.downloads_url;
        }

        if ((var75 & 262144) != 0) {
            var19 = var0.events_url;
        }

        if ((var75 & 524288) != 0) {
            var20 = var0.fork;
        }

        if ((var75 & 1048576) != 0) {
            var21 = var0.forks_count;
        }

        if ((var75 & 2097152) != 0) {
            var22 = var0.forks_url;
        }

        if ((var75 & 4194304) != 0) {
            var23 = var0.full_name;
        }

        if ((var75 & 8388608) != 0) {
            var24 = var0.git_commits_url;
        }

        if ((var75 & 16777216) != 0) {
            var25 = var0.git_refs_url;
        }

        if ((var75 & 33554432) != 0) {
            var26 = var0.git_tags_url;
        }

        if ((var75 & 67108864) != 0) {
            var27 = var0.git_url;
        }

        if ((var75 & 134217728) != 0) {
            var28 = var0.has_downloads;
        }

        if ((var75 & 268435456) != 0) {
            var29 = var0.has_issues;
        }

        if ((var75 & 536870912) != 0) {
            var30 = var0.has_pages;
        }

        if ((var75 & 1073741824) != 0) {
            var31 = var0.has_projects;
        }

        if ((var75 & Integer.MIN_VALUE) != 0) {
            var32 = var0.has_wiki;
        }

        if ((var76 & 1) != 0) {
            var33 = var0.homepage;
        }

        if ((var76 & 2) != 0) {
            var34 = var0.hooks_url;
        }

        if ((var76 & 4) != 0) {
            var35 = var0.html_url;
        }

        if ((var76 & 8) != 0) {
            var36 = var0.id;
        }

        if ((var76 & 16) != 0) {
            var37 = var0.is_template;
        }

        if ((var76 & 32) != 0) {
            var38 = var0.issue_comment_url;
        }

        if ((var76 & 64) != 0) {
            var39 = var0.issue_events_url;
        }

        if ((var76 & 128) != 0) {
            var40 = var0.issues_url;
        }

        if ((var76 & 256) != 0) {
            var41 = var0.keys_url;
        }

        if ((var76 & 512) != 0) {
            var42 = var0.labels_url;
        }

        if ((var76 & 1024) != 0) {
            var43 = var0.language;
        }

        if ((var76 & 2048) != 0) {
            var44 = var0.languages_url;
        }

        if ((var76 & 4096) != 0) {
            var45 = var0.merges_url;
        }

        if ((var76 & 8192) != 0) {
            var46 = var0.milestones_url;
        }

        if ((var76 & 16384) != 0) {
            var47 = var0.mirror_url;
        }

        if ((var76 & '耀') != 0) {
            var48 = var0.name;
        }

        if ((var76 & 65536) != 0) {
            var49 = var0.node_id;
        }

        if ((var76 & 131072) != 0) {
            var50 = var0.notifications_url;
        }

        if ((var76 & 262144) != 0) {
            var51 = var0.open_issues_count;
        }

        if ((var76 & 524288) != 0) {
            var52 = var0.owner;
        }

        if ((var76 & 1048576) != 0) {
            var53 = var0.permissions;
        }

        if ((var76 & 4194304) != 0) {
            var55 = var0.pulls_url;
        }

        if ((var76 & 8388608) != 0) {
            var56 = var0.pushed_at;
        }

        if ((var76 & 16777216) != 0) {
            var57 = var0.releases_url;
        }

        if ((var76 & 33554432) != 0) {
            var58 = var0.size;
        }

        if ((var76 & 67108864) != 0) {
            var59 = var0.ssh_url;
        }

        if ((var76 & 134217728) != 0) {
            var60 = var0.stargazers_count;
        }

        if ((var76 & 268435456) != 0) {
            var61 = var0.stargazers_url;
        }

        if ((var76 & 536870912) != 0) {
            var62 = var0.statuses_url;
        }

        if ((var76 & 1073741824) != 0) {
            var63 = var0.subscribers_url;
        }

        if ((var76 & Integer.MIN_VALUE) != 0) {
            var64 = var0.subscription_url;
        }

        if ((var77 & 1) != 0) {
            var65 = var0.svn_url;
        }

        if ((var77 & 2) != 0) {
            var66 = var0.tags_url;
        }

        if ((var77 & 4) != 0) {
            var67 = var0.teams_url;
        }

        if ((var77 & 8) != 0) {
            var68 = var0.template_repository;
        }

        if ((var77 & 16) != 0) {
            var69 = var0.topics;
        }

        if ((var77 & 32) != 0) {
            var70 = var0.trees_url;
        }

        if ((var77 & 64) != 0) {
            var71 = var0.updated_at;
        }

        if ((var77 & 128) != 0) {
            var72 = var0.url;
        }

        if ((var77 & 256) != 0) {
            var73 = var0.visibility;
        }

        if ((var77 & 512) != 0) {
            var74 = var0.watchers_count;
        }

        return var0.copy(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21, var22, var23, var24, var25, var26, var27, var28, var29, var30, var31, var32, var33, var34, var35, var36, var37, var38, var39, var40, var41, var42, var43, var44, var45, var46, var47, var48, var49, var50, var51, var52, var53, var54, var55, var56, var57, var58, var59, var60, var61, var62, var63, var64, var65, var66, var67, var68, var69, var70, var71, var72, var73, var74);
    }

}

package com.example.androidgithubclient.view.fragments.repos.adapter;

import androidx.recyclerview.widget.DiffUtil;

import com.example.androidgithubclient.model.retrofit.model.commit.CommitList;
import com.example.androidgithubclient.model.retrofit.model.commit.CommitListItem;

public class CommitAdapterDiffUtil extends DiffUtil.Callback {

    private final CommitList oldList;
    private final CommitList newList;

    public CommitAdapterDiffUtil(CommitList oldList, CommitList newList) {
        this.oldList = oldList;
        this.newList = newList;
    }

    @Override
    public int getOldListSize() {
        return oldList.size();
    }

    @Override
    public int getNewListSize() {
        return newList.size();
    }

    @Override
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        CommitListItem oldCommit = oldList.get(oldItemPosition);
        CommitListItem newCommit = newList.get(newItemPosition);
        return oldCommit.getSha().equals(newCommit.getSha());
    }

    @Override
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        CommitListItem oldCommit = oldList.get(oldItemPosition);
        CommitListItem newCommit = newList.get(newItemPosition);
        return oldCommit.getSha().equals(newCommit.getSha());
    }
}

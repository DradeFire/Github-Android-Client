package com.example.androidgithubclient.view.fragments.reposes.adapter;

import androidx.recyclerview.widget.DiffUtil;
import com.example.androidgithubclient.model.retrofit.model.repos.RepositoryList;
import com.example.androidgithubclient.model.retrofit.model.repos.RepositoryListItem;

public class RepositoryAdapterDiffUtil extends DiffUtil.Callback {

    private final RepositoryList oldList;
    private final RepositoryList newList;

    public RepositoryAdapterDiffUtil(RepositoryList oldList, RepositoryList newList) {
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
        RepositoryListItem oldRepository = oldList.get(oldItemPosition);
        RepositoryListItem newRepository = newList.get(newItemPosition);
        return oldRepository.getUrl().equals(newRepository.getUrl());
    }

    @Override
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        RepositoryListItem oldRepository = oldList.get(oldItemPosition);
        RepositoryListItem newRepository = newList.get(newItemPosition);
        return oldRepository.getUrl().equals(newRepository.getUrl());
    }
}

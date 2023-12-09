package com.example.androidgithubclient.view.fragments.repos.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.androidgithubclient.databinding.ExCommitItemBinding;
import com.example.androidgithubclient.model.retrofit.model.commit.CommitList;
import com.example.androidgithubclient.model.retrofit.model.commit.CommitListItem;

public class CommitAdapter extends RecyclerView.Adapter<CommitAdapter.ViewHolder> {

    private CommitList commits;

    public CommitAdapter(CommitList outCommits){
        commits = outCommits;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private final ExCommitItemBinding binding;

        public ViewHolder(@NonNull ExCommitItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(CommitListItem commit){
            binding.txAuthor.setText(commit.getCommit().getAuthor().getName());
            binding.txDate.setText(commit.getCommit().getAuthor().getDate());
            binding.txCommitMessage.setText(commit.getCommit().getMessage());
            binding.txHash.setText(commit.getSha());
        }
    }

    @NonNull
    @Override
    public CommitAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CommitAdapter.ViewHolder(ExCommitItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CommitAdapter.ViewHolder holder, int position) {
        holder.bind(commits.get(position));
    }

    @Override
    public int getItemCount() {
        return commits.size();
    }

    @SuppressLint("NotifyDataSetChanged")
    public void setNewCommits(CommitList commits){
        this.commits = commits;
        notifyDataSetChanged();
    }

}
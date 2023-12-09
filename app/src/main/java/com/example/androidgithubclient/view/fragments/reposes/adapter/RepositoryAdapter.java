package com.example.androidgithubclient.view.fragments.reposes.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.example.androidgithubclient.databinding.ExRepositoryItemBinding;
import com.example.androidgithubclient.model.retrofit.model.repos.RepositoryList;
import com.example.androidgithubclient.model.retrofit.model.repos.RepositoryListItem;
import com.example.androidgithubclient.viewmodel.GitViewModel;

public class RepositoryAdapter extends RecyclerView.Adapter<RepositoryAdapter.ViewHolder> {

    private RepositoryList reps;
    private final Context context;
    private final GitViewModel viewModel;

    public RepositoryAdapter(Context context, RepositoryList outReps, GitViewModel viewModel){
        reps = outReps;
        this.context = context;
        this.viewModel = viewModel;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private final ExRepositoryItemBinding binding;

        public ViewHolder(@NonNull ExRepositoryItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        @SuppressLint("SetTextI18n")
        public void bind(RepositoryListItem repositoryListItem, Context context, GitViewModel viewModel){
            binding.getRoot().setOnClickListener(click ->
                    viewModel.repLiveData.setValue(repositoryListItem)
            );

            binding.txName.setText(repositoryListItem.getName());
            binding.txAuthorRep.setText("Author:\n" + repositoryListItem.getOwner().getLogin());
            Glide.with(context)
                    .load(repositoryListItem.getOwner().getAvatar_url())
                    .circleCrop()
                    .into(binding.imAvatar);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ExRepositoryItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(reps.get(position), context, viewModel);
    }

    @Override
    public int getItemCount() {
        return reps.size();
    }

    @SuppressLint("NotifyDataSetChanged")
    public void setNewReps(RepositoryList reps){
        this.reps = reps;
        notifyDataSetChanged();
    }

    public RepositoryList getData(){
        return reps;
    }

}

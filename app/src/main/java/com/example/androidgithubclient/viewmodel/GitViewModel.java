package com.example.androidgithubclient.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.androidgithubclient.model.repository.Repository;
import com.example.androidgithubclient.model.retrofit.model.commit.CommitList;
import com.example.androidgithubclient.model.retrofit.model.repos.RepositoryList;
import com.example.androidgithubclient.model.retrofit.model.repos.RepositoryListItem;
import com.example.androidgithubclient.model.retrofit.model.token.AccessToken;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class GitViewModel extends ViewModel {

    private final Repository repository = new Repository();
    private final CompositeDisposable disposables = new CompositeDisposable();

    public final MutableLiveData<AccessToken> accessToken = new MutableLiveData<>();
    public final MutableLiveData<RepositoryList> repositoryList = new MutableLiveData<>();
    public final MutableLiveData<CommitList> commitList = new MutableLiveData<>();

    public final MutableLiveData<RepositoryListItem> repLiveData = new MutableLiveData<>();
    public String token;
    public boolean isBackFromSingle = false;



    public void requestAccessToken(
            String client_id,
            String secret_id,
            String code
    ){
        disposables.add(
                repository.getAccessToken(client_id, secret_id, code)
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(this.accessToken::setValue, error-> accessToken.setValue(null))
        );
    }

    public void requestRepositoryList(
            String token
    ) {
        disposables.add(
                repository.getListOfRepositories(token)
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(repositoryList::setValue, error -> repositoryList.setValue(null))
        );
    }

    public void requestListOfCommits(
            String url,
            GitViewModel viewModel
    ) {
        disposables.add(
                repository.getListOfCommits(url, viewModel.token)
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(commitList::setValue, error -> viewModel.commitList.setValue(null))
        );
    }


    // region s
    // endregion



    @Override
    protected void onCleared() {
        disposables.dispose();
        disposables.clear();
    }

}

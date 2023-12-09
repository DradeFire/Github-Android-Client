package com.example.androidgithubclient.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import android.os.Bundle;
import com.example.androidgithubclient.R;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    public NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onStart() {
        super.onStart();
        setUpNavigation();
    }

    private void setUpNavigation() {
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        navController = Objects.requireNonNull(navHostFragment).getNavController();
    }

    @Override
    public boolean onSupportNavigateUp() {
        return navController.navigateUp();
    }


}
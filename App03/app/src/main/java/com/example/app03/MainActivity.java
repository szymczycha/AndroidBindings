package com.example.app03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.app03.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    public ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = activityMainBinding.getRoot();
        setContentView(view);
//        setContentView(R.layout.activity_main);
        User user = new User("Jan", "Kowalski");
        Movie movie = new Movie("Insomnia");
        activityMainBinding.setMovie(movie);
        activityMainBinding.setUser(user);
        Boolean checked = false;
        activityMainBinding.setZaznaczony(checked);
        activityMainBinding.button.setOnClickListener(v -> {
            user.fname = "Szymon";
            user.lname = "Konieczny";
            activityMainBinding.setUser(user);
        });
        activityMainBinding.button2.setOnClickListener(v -> {
            Snackbar.make(activityMainBinding.button, movie.getTitle(), Snackbar.LENGTH_SHORT).show();
        });
    }
}
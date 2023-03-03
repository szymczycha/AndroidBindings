package com.example.app03;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class Movie extends BaseObservable {

    @Bindable
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String newTitle){
        title = newTitle;
        notifyPropertyChanged(BR.title);
    }
}

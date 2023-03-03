package com.example.app04;

import android.graphics.Color;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class Item extends BaseObservable {
    @Bindable
    private String color;
    @Bindable
    private String text;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        notifyPropertyChanged(BR.color);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        notifyPropertyChanged(BR.text);
    }
    public Item() {
        text = "czerwony";
        color = "-65536";
    }
}

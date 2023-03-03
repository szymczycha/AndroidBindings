package com.example.app04;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.app04.databinding.ListItemBinding;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {
    private ArrayList<Item> items;



    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ListItemBinding listItemBinding;
        LayoutInflater layoutInflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        listItemBinding = ListItemBinding.inflate(layoutInflater, parent, false);
        View view = listItemBinding.getRoot();
        listItemBinding.setItem(items.get(position));
        return view;
    }
}

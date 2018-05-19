package com.example.azb.simplehabit.activities.activities.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.azb.simplehabit.R;
import com.example.azb.simplehabit.activities.activities.viewholders.AllTopicViewHolder;

public class AllTopicAdapter extends RecyclerView.Adapter {

    private LayoutInflater mLayoutInflater;

    public AllTopicAdapter(Context context) {
        mLayoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View newsItemView = mLayoutInflater.inflate(R.layout.view_item_cards, parent, false);
        return new AllTopicViewHolder(newsItemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}

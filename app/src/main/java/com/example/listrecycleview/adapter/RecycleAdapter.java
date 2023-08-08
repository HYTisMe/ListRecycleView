package com.example.listrecycleview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.listrecycleview.R;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.RecycleViewHolder> {

    private Context mContext;
    private LayoutInflater mLayoutInflater;

    public RecycleAdapter(Context context) {
        this.mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public RecycleAdapter.RecycleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new RecycleViewHolder(mLayoutInflater.inflate(R.layout.layout_recycle_item,parent,false));
    }

    @Override
    public void onBindViewHolder(RecycleAdapter.RecycleViewHolder holder, int position) {
        holder.textView.setText("Hello World!");
    }

    @Override
    public int getItemCount() {
        return 30;
    }

    class RecycleViewHolder extends RecyclerView.ViewHolder {

        private TextView textView;

        public RecycleViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv1);
        }
    }
}

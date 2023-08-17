package com.example.listrecycleview.adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
        return new RecycleViewHolder(mLayoutInflater.inflate(R.layout.layout_recycle_item, parent, false));
    }

    @Override
    public void onBindViewHolder(RecycleAdapter.RecycleViewHolder holder, int position) {
        holder.textView.setText("你好，安卓!");
        holder.textView2.setText("子线程创建 message 对象，但通过 handle 的 sendMessage（）方法，把它发送到了主线程");
        holder.imageView.setImageResource(R.drawable.android);
    }

    @Override
    public int getItemCount() {
        return 30;
    }

    class RecycleViewHolder extends RecyclerView.ViewHolder {

        private TextView textView;

        private TextView textView2;

        private ImageView imageView;


        public RecycleViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv1);
            textView2 = itemView.findViewById(R.id.tv2);
            imageView = itemView.findViewById(R.id.img_1);
        }
    }
}

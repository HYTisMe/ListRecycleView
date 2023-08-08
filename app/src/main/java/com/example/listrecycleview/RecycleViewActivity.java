package com.example.listrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.listrecycleview.adapter.RecycleAdapter;

public class RecycleViewActivity extends AppCompatActivity implements View.OnClickListener {

    private RecyclerView recyclerView;

    private static String TAG;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);
        button = findViewById(R.id.recycle_back);
        button.setOnClickListener(this);
        recyclerView = findViewById(R.id.rv_1);
        //设置线性布局管理器
        recyclerView.setLayoutManager(new LinearLayoutManager(RecycleViewActivity.this));
        //设置Adapter
        recyclerView.setAdapter(new RecycleAdapter(RecycleViewActivity.this));
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.recycle_back:
                intentToMainPage();
                break;
            default:
                break;
        }
    }

    private void intentToMainPage() {
        Intent intent = new Intent();
        intent.setClass(RecycleViewActivity.this, MainActivity.class);
        startActivity(intent);
        Log.d(TAG, "点击跳转");
    }
}
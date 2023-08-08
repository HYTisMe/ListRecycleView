package com.example.listrecycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public Button button1;
    public Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    private void initView() {
        button1 = findViewById(R.id.bu_1);
        button2 = findViewById(R.id.bu_2);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bu_1:
                intentToListView();
                break;
            case R.id.bu_2:
                intentToRecycleView();
                break;
            default:
                break;
        }
    }

    private void intentToListView() {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, ListViewActivity.class);
        startActivity(intent);
    }

    private void intentToRecycleView() {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, RecycleViewActivity.class);
        startActivity(intent);
    }

}
package com.example.listrecycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Switch;

public class ListViewActivity extends AppCompatActivity implements View.OnClickListener {

    private static String TAG;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        button = findViewById(R.id.list_back);
        button.setOnClickListener(this);
        String[] str = {"沃达飞","节奏比特","Android","米来","特斯科","Model 3P","滑板","节奏比特","Android","精武门","唐山大兄",
        "猛龙过江","沃达飞","米来","特斯科","节奏比特","Android","Model 3P","滑板","精武门","唐山大兄", "猛龙过江"};
        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,str);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.list_back:
                intentToMainPage();
                break;
            default:
                break;
        }
    }

    private void intentToMainPage() {
        Intent intent = new Intent();
        intent.setClass(ListViewActivity.this, MainActivity.class);
        startActivity(intent);
        Log.d(TAG, "点击跳转");
    }
}
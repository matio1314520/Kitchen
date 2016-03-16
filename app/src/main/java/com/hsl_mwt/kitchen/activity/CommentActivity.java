package com.hsl_mwt.kitchen.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hsl_mwt.kitchen.R;

import org.xutils.view.annotation.ContentView;

@ContentView(R.layout.activity_comment)
public class CommentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initView();
        loadData();
    }

    private void loadData() {
        
    }

    private void initView() {

    }
}

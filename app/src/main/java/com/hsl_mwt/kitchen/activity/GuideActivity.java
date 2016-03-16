package com.hsl_mwt.kitchen.activity;

import android.content.Intent;
import android.os.Bundle;

import com.hsl_mwt.kitchen.R;
import com.hsl_mwt.kitchen.base.KitchenActivity;

import org.xutils.view.annotation.ContentView;

@ContentView(R.layout.expandable_layout)
public class GuideActivity extends KitchenActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);

    }
}
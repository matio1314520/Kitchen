package com.hsl_mwt.kitchen.activity;

import android.os.Bundle;
import android.view.View;

import com.hsl_mwt.kitchen.R;
import com.hsl_mwt.kitchen.base.KitchenActivity;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;

/**
 * Created by Angel on 2016/2/22.
 */
@ContentView(R.layout.vegbasket_activity)
public class VegbasketActivity extends KitchenActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /**
     * 点击事件.
     *
     * @param v
     */
    @Event(value = {R.id.back_vegbasket_activity, R.id.clear_vegbasket_activity}, type = View.OnClickListener.class)
    private void onClick(View v) {
        int id = v.getId();

        if (id == R.id.back_vegbasket_activity) {
            finish();
        }

        if (id == R.id.clear_vegbasket_activity) {
            //清空
        }
    }
}

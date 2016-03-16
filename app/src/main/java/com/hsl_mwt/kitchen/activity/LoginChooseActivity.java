package com.hsl_mwt.kitchen.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.hsl_mwt.kitchen.R;
import com.hsl_mwt.kitchen.base.KitchenActivity;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;

/**
 * Created by Angel on 2016/2/20.
 */
@ContentView(R.layout.loginchoose_activity)
public class LoginChooseActivity extends KitchenActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /**
     * 点击事件
     *
     * @param view
     */
    @Event(value = {R.id.cancel_loginchoose_activity, R.id.login_loginchoose_activity,
            R.id.register_loginchoose_activity}, type = View.OnClickListener.class)
    private void onClick(View view) {
        int id = view.getId();
        Intent intent = null;
        if (id == R.id.cancel_loginchoose_activity) {
            finish();
        }
        if (id == R.id.login_loginchoose_activity) {
            intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        }
        if (id == R.id.register_loginchoose_activity) {
            intent = new Intent(this, RegisterActivity.class);
            startActivity(intent);
        }
    }
}

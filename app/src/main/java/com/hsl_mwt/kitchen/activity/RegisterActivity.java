package com.hsl_mwt.kitchen.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.hsl_mwt.kitchen.R;
import com.hsl_mwt.kitchen.base.KitchenActivity;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;

/**
 * Created by Angel on 2016/2/21.
 */
@ContentView(R.layout.register_activity)
public class RegisterActivity extends KitchenActivity {

    @ViewInject(R.id.tel_register_activity)
    private EditText mTelEdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /**
     * 点击事件
     * @param view
     */
    @Event(value = {R.id.verification_code_register_activity, R.id.back_register_activity}, type = View.OnClickListener.class)
    private void onClick(View view) {
        int id = view.getId();

        if (id == R.id.back_register_activity) {
            finish();
        }

        if (id == R.id.verification_code_register_activity) {

        }

    }
}

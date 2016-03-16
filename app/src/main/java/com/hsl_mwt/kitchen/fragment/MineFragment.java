package com.hsl_mwt.kitchen.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.hsl_mwt.kitchen.R;
import com.hsl_mwt.kitchen.activity.LoginChooseActivity;
import com.hsl_mwt.kitchen.base.KitchenAppFragment;
import com.hsl_mwt.kitchen.utils.SharedPreferenceUtils;

import org.xutils.view.annotation.ContentView;

/**
 * Created by Angel on 2016/2/19.
 */
@ContentView(R.layout.fragment_mine)
public class MineFragment extends KitchenAppFragment {

    public static MineFragment newInstance() {
        MineFragment fragment = new MineFragment();
        return fragment;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        if (SharedPreferenceUtils.get(getActivity())) {
            //已登陆
        } else {
            //未登录，跳转登录页面
            Intent intent = new Intent(getActivity(), LoginChooseActivity.class);
            startActivity(intent);
        }
    }
}

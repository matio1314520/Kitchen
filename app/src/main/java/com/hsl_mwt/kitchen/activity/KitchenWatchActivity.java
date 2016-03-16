package com.hsl_mwt.kitchen.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;


import com.hsl_mwt.kitchen.R;
import com.hsl_mwt.kitchen.adapter.KitchenFragmentAdapter;
import com.hsl_mwt.kitchen.base.KitchenActivity;
import com.hsl_mwt.kitchen.common.kitchen.KitchenWatchConstant;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Angel on 2016/2/22.
 */
@ContentView(R.layout.kitchenwatch_activity)
public class KitchenWatchActivity extends KitchenActivity {

    @ViewInject(R.id.tab_kitchenwatch_activity)
    private TabLayout mTab;

    @ViewInject(R.id.viewpager_kitchenwatch_activity)
    private ViewPager mVip;

    private List<Fragment> fragmentList = new ArrayList<>();  //viewpager数据源

    private String[] id_url = {KitchenWatchConstant.STREAM_ID_URL_GET, KitchenWatchConstant.LATEST_ID_URL_GET, KitchenWatchConstant.POP_ID_URL_GET};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //设置tablayout数据
        setTabData();

        //初始化viewlist
        //  initViewList();

        //设置viewpager适配器
        //      setViewPagerAdapter();

        //设置联动
        //   mTab.setupWithViewPager(mVip);
    }

    /**
     * 初始化viewlist
     */
    private void initViewList() {
        for (int i = 0; i < 3; i++) {
            // fragmentList.add(KitchenListFragment.newInstance(id_url[i]));
        }
    }

    /**
     * 设置viewpager适配器
     */
    private void setViewPagerAdapter() {
        mVip.setAdapter(new KitchenFragmentAdapter(getSupportFragmentManager(), fragmentList));
    }

    /**
     * 设置tablayout数据
     */
    private void setTabData() {
        mTab.addTab(mTab.newTab().setText("本周流行"));
        mTab.addTab(mTab.newTab().setText("最新创建"));
        mTab.addTab(mTab.newTab().setText("最后欢迎"));
    }


    @Event(value = {R.id.back_kitchenwatch_activity, R.id.basket_kitchenwatch_activity}, type = View.OnClickListener.class)
    private void onClick(View v) {
        int id = v.getId();
        if (id == R.id.back_kitchenwatch_activity) {
            finish();
        }
        if (id == R.id.basket_kitchenwatch_activity) {
            //页面跳转
            startActivity(new Intent(this, VegbasketActivity.class));
        }
    }
}

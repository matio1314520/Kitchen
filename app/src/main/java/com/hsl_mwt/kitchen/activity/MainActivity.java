package com.hsl_mwt.kitchen.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.widget.RadioGroup;

import com.hsl_mwt.kitchen.R;
import com.hsl_mwt.kitchen.base.KitchenActivity;
import com.hsl_mwt.kitchen.fragment.CommunityFragment;
import com.hsl_mwt.kitchen.fragment.KitchenFragment;
import com.hsl_mwt.kitchen.fragment.MarketFragment;
import com.hsl_mwt.kitchen.fragment.MineFragment;
import com.hsl_mwt.kitchen.utils.FragmentUtils;


import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;

import java.util.ArrayList;

/**
 * Created by Angel on 2016/2/19.
 */
@ContentView(R.layout.home_layout)
public class MainActivity extends KitchenActivity {

    @ViewInject(R.id.radiogroup_home)
    private RadioGroup whichRag;

    private ArrayList<Fragment> fragmentList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //初始化Llist集合
        initList();
    }

    /**
     * 初始化Llist集合
     */
    private void initList() {
        fragmentList.add(KitchenFragment.newInstance());
        fragmentList.add(MarketFragment.newInstance());
        fragmentList.add(CommunityFragment.newInstance());
        fragmentList.add(MineFragment.newInstance());
        new FragmentUtils(getSupportFragmentManager(), fragmentList, R.id.fragment_container_home, whichRag);
    }
}
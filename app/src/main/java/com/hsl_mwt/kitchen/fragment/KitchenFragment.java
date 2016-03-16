package com.hsl_mwt.kitchen.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ExpandableListView;

import com.alibaba.fastjson.JSONObject;
import com.hsl_mwt.kitchen.App;
import com.hsl_mwt.kitchen.R;
import com.hsl_mwt.kitchen.activity.KitchenSearchActivity;
import com.hsl_mwt.kitchen.activity.LoginChooseActivity;
import com.hsl_mwt.kitchen.activity.VegbasketActivity;
import com.hsl_mwt.kitchen.adapter.KitchenExpandAdapter;
import com.hsl_mwt.kitchen.base.KitchenAppFragment;
import com.hsl_mwt.kitchen.bean.kitchen.KitchenList;
import com.hsl_mwt.kitchen.bean.kitchen.KitchenListIssues;
import com.hsl_mwt.kitchen.bean.kitchen.KitchenListItems;
import com.hsl_mwt.kitchen.common.KitchenConstant;
import com.hsl_mwt.kitchen.utils.HttpUtils;
import com.hsl_mwt.kitchen.utils.JsonStrCallback;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Angel on 2016/2/19.
 */
@ContentView(R.layout.fragment_kitchen)
public class KitchenFragment extends KitchenAppFragment{

    private List<String> mNameList = new ArrayList<>();

    private List<List<KitchenListItems>> mIssuesList = new ArrayList<>();

    @ViewInject(R.id.expandablelistview_kitchen_fragment)
    private ExpandableListView mExpandableLv;

    private KitchenExpandAdapter mAdapter;

    public static KitchenFragment newInstance() {
        KitchenFragment fragment = new KitchenFragment();
        return fragment;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //请求网络数据
        requestNetData();

        //设置适配器
        setListViewAdapter();

        //listview添加头部
        addListViewHeader();
    }

    /**
     * listview添加头部
     */
    private void addListViewHeader() {
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_header_kitchen, null);
        if (mExpandableLv != null) {
            mExpandableLv.addHeaderView(view);
        }
    }

    /**
     * 设置适配器
     */
    private void setListViewAdapter() {

        mAdapter = new KitchenExpandAdapter(mNameList, mIssuesList, getActivity());

        mExpandableLv.setAdapter(mAdapter);

        //设置默认展开
        for (int i = 0,groupCount = mExpandableLv.getCount(); i < groupCount; i++) {
            mExpandableLv.expandGroup(i);
        }
    }

    /**
     * 请求网络数据
     */
    private void requestNetData() {
        HttpUtils.getString(KitchenConstant.LIST_URL_GET, new JsonStrCallback() {
            @Override
            public void get(String result) {
                KitchenList kitchen = JSONObject.parseObject(result, KitchenList.class);
                if (kitchen != null) {
                    List<KitchenListIssues> issuesList = kitchen.getContent().getIssues();
                    if (issuesList != null && issuesList.size() > 0) {
                        for (int i = 0; i < issuesList.size(); i++) {
                            mNameList.add(issuesList.get(i).getTitle());
                            mIssuesList.add(issuesList.get(i).getItems());
                        }
                        mAdapter.notifyDataSetChanged();
                    }
                }
            }
        });
    }

    /**
     * 点击事件.
     *
     * @param v
     */
    @Event(value = {R.id.add_kitchen_fragment, R.id.vegetablebasket_kitchen_fragment,
            R.id.search_kitchen_fragment}, type = View.OnClickListener.class)
    private void onClick(View v) {
        Intent intent = null;

        int id = v.getId();

        if (id == R.id.add_kitchen_fragment) {

            intent = new Intent(App.getInstance(), LoginChooseActivity.class);
        }

        if (id == R.id.vegetablebasket_kitchen_fragment) {
            //菜篮子界面
            intent = new Intent(App.getInstance(), VegbasketActivity.class);
        }

        if (id == R.id.search_kitchen_fragment) {
            //搜索界面
            intent = new Intent(App.getInstance(), KitchenSearchActivity.class);
        }

        startActivity(intent);
    }
}
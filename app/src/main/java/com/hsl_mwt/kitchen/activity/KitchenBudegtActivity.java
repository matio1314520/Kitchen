package com.hsl_mwt.kitchen.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.alibaba.fastjson.JSONObject;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.hsl_mwt.kitchen.R;
import com.hsl_mwt.kitchen.adapter.KitchenBuyAdapter;
import com.hsl_mwt.kitchen.base.KitchenActivity;
import com.hsl_mwt.kitchen.bean.kitchen.KitchenBudegt;
import com.hsl_mwt.kitchen.common.kitchen.KitchenBuyConstant;
import com.hsl_mwt.kitchen.utils.HttpUtils;
import com.hsl_mwt.kitchen.utils.JsonStrCallback;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Angel on 2016/2/22.
 */
@ContentView(R.layout.kitchenbudegt_activity)
public class KitchenBudegtActivity extends KitchenActivity {

    @ViewInject(R.id.ptrlistview_kitchenbudegt_activity)
    private PullToRefreshListView mKitchenLv;

    private KitchenBuyAdapter mAdapter;

    private List<KitchenBudegt.ContentEntity.ReviewsEntity> mReviewsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //请求网络数据
        requestNetData();

        //设置适配器
        setListViewAdapter();

        //lisview监听事件
        setListViewListener();
    }

    /**
     * lisview监听事件
     */
    private void setListViewListener() {
        mKitchenLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(KitchenBudegtActivity.this, KitchenListActivity.class);
                startActivity(intent);
            }
        });
    }

    /**
     * 设置适配器
     */
    private void setListViewAdapter() {
        mAdapter = new KitchenBuyAdapter(KitchenBudegtActivity.this, mReviewsList);
        mKitchenLv.setMode(PullToRefreshBase.Mode.BOTH);
        mKitchenLv.setAdapter(mAdapter);
        mKitchenLv.setRefreshing();
    }

    /**
     * 请求网络数据
     */
    private void requestNetData() {
        HttpUtils.getString(KitchenBuyConstant.LIST_URL_GET, new JsonStrCallback() {
            @Override
            public void get(String result) {
                KitchenBudegt buy = JSONObject.parseObject(result, KitchenBudegt.class);
                if (buy != null) {
                    mReviewsList.addAll(buy.getContent().getReviews());
                    mAdapter.notifyDataSetChanged();
                    mKitchenLv.onRefreshComplete();
                }
            }
        });
    }

    @Event(value = R.id.back_kitchenbut_activity, type = View.OnClickListener.class)
    private void onClick(View v) {
        int id = v.getId();
        if (id == R.id.back_kitchenbut_activity) {
            finish();
        }
    }
}

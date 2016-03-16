package com.hsl_mwt.kitchen.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.GridView;

import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshGridView;
import com.hsl_mwt.kitchen.R;
import com.hsl_mwt.kitchen.adapter.MarketAdapter;
import com.hsl_mwt.kitchen.base.KitchenAppFragment;
import com.hsl_mwt.kitchen.bean.market.ItemType;
import com.hsl_mwt.kitchen.common.MarketConstant;
import com.hsl_mwt.kitchen.utils.HttpUtils;
import com.hsl_mwt.kitchen.utils.JsonParse;
import com.hsl_mwt.kitchen.utils.JsonStrCallback;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Angel on 2016/2/19.
 */
@ContentView(R.layout.fragment_market)
public class MarketFragment extends KitchenAppFragment implements
        PullToRefreshBase.OnRefreshListener2<GridView> {

    @ViewInject(R.id.fragment_market_ptfgridview)
    private PullToRefreshGridView mPtrGiv;

    private List<ItemType> mGoodsList = new ArrayList<>();

    private MarketAdapter mMarketAdapter;

    private int mPage;

    private final int NUMBER = 10;

    public static MarketFragment newInstance() {
        MarketFragment fragment = new MarketFragment();
        return fragment;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //初始化
        initView();

        //获取网络数据
        loadData();
    }

    /**
     * 获取网络数据
     */
    private void loadData() {
        HttpUtils.getString(MarketConstant.getMarketOnsaleUrl(mPage), new JsonStrCallback() {
            @Override
            public void get(String result) {
                mGoodsList.addAll(JsonParse.jsonParse(result));

                mMarketAdapter.notifyDataSetChanged();
                // 通知控件刷完成
                mPtrGiv.onRefreshComplete();
            }
        });
    }

    /**
     * 初始化
     */
    private void initView() {
        mMarketAdapter = new MarketAdapter(getActivity(), mGoodsList);
        mPtrGiv.setAdapter(mMarketAdapter);
        mPtrGiv.setMode(PullToRefreshBase.Mode.PULL_FROM_END);
        mPtrGiv.setOnRefreshListener(this);
    }

    /**
     * 下拉刷新  禁用掉
     * @param refreshView
     */
    @Override
    public void onPullDownToRefresh(PullToRefreshBase refreshView) {
    }

    /**
     * 上拉加载
     * @param refreshView
     */
    @Override
    public void onPullUpToRefresh(PullToRefreshBase refreshView) {
        mPage += NUMBER;

        loadData();
    }
}
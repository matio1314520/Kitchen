package com.hsl_mwt.kitchen.fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.alibaba.fastjson.JSONObject;
import com.hsl_mwt.kitchen.R;
import com.hsl_mwt.kitchen.adapter.MarketCommendAdapter;
import com.hsl_mwt.kitchen.base.KitchenAppFragment;
import com.hsl_mwt.kitchen.bean.market.MarketRecommend;
import com.hsl_mwt.kitchen.bean.market.MarketTheme;
import com.hsl_mwt.kitchen.common.MarketConstant;
import com.hsl_mwt.kitchen.utils.HttpUtils;
import com.hsl_mwt.kitchen.utils.JsonStrCallback;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Angel on 2016/2/24.
 */
@ContentView(R.layout.fragment_header_market)
public class MarketHeaderFragment extends KitchenAppFragment {

    @ViewInject(R.id.recyclerview1_market_header_fragment)
    private RecyclerView mFRecyclerView;


    @ViewInject(R.id.recyclerview2_market_header_fragment)
    private RecyclerView mSRecyclerView;

    private List<MarketRecommend.ContentEntity> mContentList = new ArrayList<>();  //热门推荐数据源

    private List<MarketTheme.HotOutletsEntity> mHotList = new ArrayList<>();

    private MarketCommendAdapter mCommendAdapter;

    public static MarketHeaderFragment newInstance() {
        MarketHeaderFragment fragment = new MarketHeaderFragment();
        return fragment;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //请求网络数据
        requestNetData();

        //设置适配器
        setRecyclerViewViewAdapter();
    }

    private LinearLayoutManager getLinearLayoutManager(){
        return new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
    }

    /**
     * 设置适配器
     */
    private void setRecyclerViewViewAdapter() {
        mCommendAdapter = new MarketCommendAdapter(mContentList);
        mFRecyclerView.setLayoutManager(getLinearLayoutManager());
        mFRecyclerView.setAdapter(mCommendAdapter);
    }

    /**
     * 请求网络数据
     */
    private void requestNetData() {
        HttpUtils.getString(MarketConstant.RECYCLERVIEW_URL_GET, new JsonStrCallback() {
            @Override
            public void get(String result) {
                MarketRecommend marketRecommend = JSONObject.parseObject(result, MarketRecommend.class);
                if (marketRecommend != null) {
                    mContentList.addAll(marketRecommend.getContent());
                    mCommendAdapter.notifyDataSetChanged();
                }
            }
        });

        /**
         * 热门主题
         */
        HttpUtils.getString(MarketConstant.THEME_URL_GET, new JsonStrCallback() {
            @Override
            public void get(String result) {
                MarketTheme marketTheme = JSONObject.parseObject(result, MarketTheme.class);
                if ( marketTheme != null){
                    mHotList.addAll(marketTheme.getHot_outlets());
                    mSRecyclerView.notifyAll();
                }
            }
        });
    }
}
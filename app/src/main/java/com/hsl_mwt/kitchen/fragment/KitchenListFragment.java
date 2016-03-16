package com.hsl_mwt.kitchen.fragment;

import android.os.Bundle;
import android.view.View;

import com.alibaba.fastjson.JSONObject;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.hsl_mwt.kitchen.R;
import com.hsl_mwt.kitchen.adapter.KitchenListAdapter;
import com.hsl_mwt.kitchen.base.KitchenAppFragment;

import com.hsl_mwt.kitchen.bean.kitchen.KitchenListItems;
import com.hsl_mwt.kitchen.bean.kitchen.KitchenWelcomeId;
import com.hsl_mwt.kitchen.bean.kitchen.KitchenWelcomeList;
import com.hsl_mwt.kitchen.utils.HttpUtils;
import com.hsl_mwt.kitchen.utils.JsonStrCallback;

import org.xutils.http.RequestParams;
import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Angel on 2016/2/22.
 */
@ContentView(R.layout.kitchenlist_activity)
public class KitchenListFragment extends KitchenAppFragment {

    @ViewInject(R.id.listview_kitchenlist_activity)
    private PullToRefreshListView mKitchenLv;

    private KitchenListAdapter mAdapter;

    private List<KitchenListItems> mIssuesList = new ArrayList<>();

    private String mId = "";

    private List<KitchenWelcomeList.KitchenItemContent.KitchenItemRecipes> mRecipeList = new ArrayList<>();

    public static KitchenListFragment newInstance(String url) {

        Bundle args = new Bundle();
        //url--->id
        args.putString("url", url);
        KitchenListFragment fragment = new KitchenListFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //获取传值
     //  getDataFromIntent();

        //设置适配器
     //  setListViewAdapter();
    }

    /**
     * 获取传值
     */
    private void getDataFromIntent() {
        if (getArguments() != null) {
            String url = getArguments().getString("url");
            if (url != null) {
                requestNetData(url);
            }
        }
    }

    /**
     * 请求网络数据
     */
    private void requestNetData(String url) {
        HttpUtils.getString(url, new JsonStrCallback() {
            @Override
            public void get(String result) {
                KitchenWelcomeId kitchenWelcome = JSONObject.parseObject(result, KitchenWelcomeId.class);
                if (kitchenWelcome != null) {
                    List<KitchenWelcomeId.ContentEntity.RecipesEntity> recipes = kitchenWelcome.getContent().getRecipes();
                    if (recipes != null) {
                        for (int i = 0, size = recipes.size(); i < size; i++) {
                            String recipe_id = recipes.get(i).getRecipe_id();
                            if (i != size - 1) {
                                mId += recipe_id + ",";
                            } else {
                                mId += recipe_id;
                            }
                        }
                        //请求listview数据
                        requestListData(mId);
                    }
                }
            }
        });
    }

    /**
     * 请求listview数据
     */
    private void requestListData(String mId) {
        HttpUtils.postString(getParams(mId), new JsonStrCallback() {
            @Override
            public void get(String result) {
                KitchenWelcomeList listItem = JSONObject.parseObject(result, KitchenWelcomeList.class);
                if (listItem != null) {
                  mRecipeList.addAll(listItem.getContent().getRecipes());
                    mAdapter.notifyDataSetChanged();
                    mKitchenLv.onRefreshComplete();
                }
            }
        });
    }

    /**
     * 获取requestparams
     */
    private RequestParams getParams(String id) {
        RequestParams params = new RequestParams("http://api.xiachufang.com/v2/recipes/lookup.json");
        params.addBodyParameter("origin", "android");
        params.addBodyParameter("id", id);
        params.addBodyParameter("api_sign", "fe59ef1dd147a41f993536a40abb1221");
        params.addBodyParameter("api_key", "07e72bef932537c71f9cafbe4c94df1c");
        params.addBodyParameter("version", "142");
        params.addBodyParameter("mode", "full");
        return params;
    }

    /**
     * 设置适配器
     */
    private void setListViewAdapter() {
        mAdapter = new KitchenListAdapter(getActivity(), mIssuesList);
        mKitchenLv.setMode(PullToRefreshBase.Mode.BOTH);
        mKitchenLv.setAdapter(mAdapter);
        mKitchenLv.setRefreshing();
    }
}
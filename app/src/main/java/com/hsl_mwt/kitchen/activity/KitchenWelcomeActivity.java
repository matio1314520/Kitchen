package com.hsl_mwt.kitchen.activity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import com.alibaba.fastjson.JSONObject;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.hsl_mwt.kitchen.R;
import com.hsl_mwt.kitchen.adapter.kitchenWelAdapter;
import com.hsl_mwt.kitchen.base.KitchenActivity;
import com.hsl_mwt.kitchen.bean.kitchen.KitchenWelcomeId;
import com.hsl_mwt.kitchen.bean.kitchen.KitchenWelcomeList;
import com.hsl_mwt.kitchen.common.KitchenWelcomeConstant;
import com.hsl_mwt.kitchen.utils.HttpUtils;
import com.hsl_mwt.kitchen.utils.JsonStrCallback;

import org.xutils.http.RequestParams;
import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Angel on 2016/2/22.
 */
@ContentView(R.layout.kitchenwelcome_activity)
public class KitchenWelcomeActivity extends KitchenActivity implements PullToRefreshBase.OnRefreshListener2<ListView> {

    @ViewInject(R.id.listview_kitchenwelcome_activity)
    private PullToRefreshListView mKitchenLv;

    private kitchenWelAdapter mAdapter;

    private List<KitchenWelcomeList.KitchenItemContent.KitchenItemRecipes> mRecipeList = new ArrayList<>();

    private String mId = "";

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
                Intent intent = new Intent(KitchenWelcomeActivity.this, KitchenListActivity.class);
                startActivity(intent);
            }
        });
    }

    /**
     * 设置适配器
     */
    private void setListViewAdapter() {
        mAdapter = new kitchenWelAdapter(this, mRecipeList);
        mKitchenLv.setMode(PullToRefreshBase.Mode.BOTH);
        mKitchenLv.setAdapter(mAdapter);
        mKitchenLv.setRefreshing();
    }

    /**
     * 请求网络数据
     */
    private void requestNetData() {

        HttpUtils.getString(KitchenWelcomeConstant.ID_URL_GET, new JsonStrCallback() {
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
        RequestParams params = new RequestParams(KitchenWelcomeConstant.LIST_URL_POST);

        params.addBodyParameter("origin", "android");
        params.addBodyParameter("id", id);
        params.addBodyParameter("api_sign", "87fae751019420622c1a6f59e9a472ee");
        params.addBodyParameter("api_key", "07e72bef932537c71f9cafbe4c94df1c");
        params.addBodyParameter("version", "142");
        params.addBodyParameter("mode", "full");
        return params;
    }

    /**
     * 点击事件
     *
     * @param view
     */
    @Event(value = {R.id.back_kitchenwelcome_activity, R.id.vegetablebasket_kitchenwelcome_activity}, type = View.OnClickListener.class)
    private void onClick(View view) {
        int id = view.getId();
        if (id == R.id.back_kitchenwelcome_activity) {
            finish();
        } else if (id == R.id.vegetablebasket_kitchenwelcome_activity) {
            //页面跳转
            startActivity(new Intent(KitchenWelcomeActivity.this, VegbasketActivity.class));
        }
    }

    @Override
    public void onPullDownToRefresh(PullToRefreshBase<ListView> refreshView) {

    }

    @Override
    public void onPullUpToRefresh(PullToRefreshBase<ListView> refreshView) {

    }
}
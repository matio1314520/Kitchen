package com.hsl_mwt.kitchen.activity;

import android.os.Bundle;

import com.alibaba.fastjson.JSONObject;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.hsl_mwt.kitchen.R;
import com.hsl_mwt.kitchen.adapter.KitChildSearchAdapter;
import com.hsl_mwt.kitchen.base.KitchenActivity;
import com.hsl_mwt.kitchen.bean.kitchen.KitchenChildSearch;
import com.hsl_mwt.kitchen.common.KitchenSearchConstant;
import com.hsl_mwt.kitchen.utils.HttpUtils;
import com.hsl_mwt.kitchen.utils.JsonStrCallback;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Angel on 2016/2/25.
 */
@ContentView(R.layout.kitchildsearch_activity)
public class KitChildSearchActivity extends KitchenActivity {

    @ViewInject(R.id.ptrlistview_kitchildsearch_activity)
    private PullToRefreshListView mSearchLv;

    private KitChildSearchAdapter mAdapter;

    private List<KitchenChildSearch.SearchContent.Content> mContentList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //请求网络数据
        requestNetData();

        //设置适配器
        setListViewAdapter();
    }

    /**
     * 设置适配器
     */
    private void setListViewAdapter() {
        mAdapter = new KitChildSearchAdapter(this, mContentList);
        mSearchLv.setMode(PullToRefreshBase.Mode.BOTH);
        mSearchLv.setAdapter(mAdapter);
    }

    /**
     * 请求网络数据
     */
    private void requestNetData() {
        HttpUtils.getString(KitchenSearchConstant.TANGYUAN, new JsonStrCallback() {
            @Override
            public void get(String result) {
                KitchenChildSearch search = JSONObject.parseObject(result, KitchenChildSearch.class);
                if (search != null) {
                    mContentList.addAll(search.getContent().getContent());
                    mAdapter.notifyDataSetChanged();
                    mSearchLv.onRefreshComplete();
                }
            }
        });
    }
}

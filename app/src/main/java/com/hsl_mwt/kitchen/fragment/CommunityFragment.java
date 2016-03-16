package com.hsl_mwt.kitchen.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.alibaba.fastjson.JSONObject;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.hsl_mwt.kitchen.R;
import com.hsl_mwt.kitchen.activity.CommentActivity;
import com.hsl_mwt.kitchen.adapter.CommunityAdapter;
import com.hsl_mwt.kitchen.base.KitchenAppFragment;
import com.hsl_mwt.kitchen.bean.community.CommnuityEntity;
import com.hsl_mwt.kitchen.bean.community.ItemBean;
import com.hsl_mwt.kitchen.common.CommunityConstant;
import com.hsl_mwt.kitchen.utils.HttpUtils;
import com.hsl_mwt.kitchen.utils.JsonStrCallback;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Angel on 2016/2/19.
 */
@ContentView(R.layout.fragment_community)
public class CommunityFragment extends KitchenAppFragment implements PullToRefreshBase.OnRefreshListener2 {

    @ViewInject(R.id.lv_community)
    private PullToRefreshListView ptlv;

    private List<ItemBean> list = new ArrayList<>();

    private CommunityAdapter communityAdapter;

    public static CommunityFragment newInstance() {
        CommunityFragment fragment = new CommunityFragment();
        return fragment;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initView();
        loadData();
        listtener();
    }

    private void listtener() {

        ptlv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //页面跳转
                Intent commentIntent = new Intent(getActivity(),CommentActivity.class);
                startActivity(commentIntent);
            }
        });
    }

    private void loadData() {

        HttpUtils.getString(CommunityConstant.COMMUNITY_GET_URL, new JsonStrCallback() {
            @Override
            public void get(String result) {

                //进行JSON解析
                CommnuityEntity item = JSONObject.parseObject(result, CommnuityEntity.class);
                //就一条数据
                list.add(item.getContent().getForums().get(0));
                list.add(item.getContent().getShouts());
                communityAdapter.notifyDataSetChanged();
                ptlv.onRefreshComplete();

            }
        });
    }

    private void initView() {

        communityAdapter = new CommunityAdapter(getActivity(), list);
        ptlv.setAdapter(communityAdapter);
        ptlv.setMode(PullToRefreshBase.Mode.BOTH);
        ptlv.setOnRefreshListener(this);
    }

    @Override
    public void onPullDownToRefresh(PullToRefreshBase refreshView) {

        if (list != null){
            list.clear();
        }
        loadData();

    }

    @Override
    public void onPullUpToRefresh(PullToRefreshBase refreshView) {

    }
}

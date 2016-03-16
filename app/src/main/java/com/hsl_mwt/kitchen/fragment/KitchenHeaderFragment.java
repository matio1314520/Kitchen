package com.hsl_mwt.kitchen.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.alibaba.fastjson.JSONObject;
import com.hsl_mwt.kitchen.R;

import com.hsl_mwt.kitchen.activity.KitchenBudegtActivity;
import com.hsl_mwt.kitchen.activity.KitchenCategoryActivity;
import com.hsl_mwt.kitchen.activity.KitchenRankListActivity;
import com.hsl_mwt.kitchen.activity.KitchenWatchActivity;
import com.hsl_mwt.kitchen.activity.KitchenWelcomeActivity;
import com.hsl_mwt.kitchen.activity.LoginChooseActivity;
import com.hsl_mwt.kitchen.base.KitchenAppFragment;
import com.hsl_mwt.kitchen.bean.kitchen.KitchenFour;
import com.hsl_mwt.kitchen.bean.kitchen.KitchenRed;
import com.hsl_mwt.kitchen.common.KitchenConstant;
import com.hsl_mwt.kitchen.utils.HttpUtils;
import com.hsl_mwt.kitchen.utils.JsonStrCallback;
import com.hsl_mwt.kitchen.utils.ViewPagerUtils;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Angel on 2016/2/20.0
 */
@ContentView(R.layout.header_fragment_kitchen)
public class KitchenHeaderFragment extends KitchenAppFragment {

    @ViewInject(R.id.red_header_listview_fragment)
    private ImageView mRedImg;

    @ViewInject(R.id.iconname_header_listview_fragment)
    private LinearLayout mIconLin;

    @ViewInject(R.id.title1_header_listview_fragment)
    private ImageView mLeftImg;

    @ViewInject(R.id.title2_header_listview_fragment)
    private ImageView mRightImg;

    @ViewInject(R.id.viewpager_header_listview_fragment)
    private ViewPager mVip;

    private List<View> mViewList = new ArrayList<>();  //viewpager数据源

    public static KitchenHeaderFragment newInstance() {
        KitchenHeaderFragment fragment = new KitchenHeaderFragment();
        return fragment;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //请求网络数据
        requestNetData();
    }

    /**
     * 请求网络数据
     */
    private void requestNetData() {
        /**
         * 两张图片
         * 排行榜
         */
        HttpUtils.getString(KitchenConstant.FOUR_URL_GET, new JsonStrCallback() {
            @Override
            public void get(String result) {
                //设置对应的数据
                setData(result);
            }
        });

        /**
         * 红包
         */
        HttpUtils.getString(KitchenConstant.RED_URL_GET, new JsonStrCallback() {
            @Override
            public void get(String result) {
                KitchenRed red = JSONObject.parseObject(result, KitchenRed.class);
                if (red != null) {
                    ViewGroup.LayoutParams params = mRedImg.getLayoutParams();
                    params.height = red.getContent().getAd_info().getImage().getHeight();
                    mRedImg.setLayoutParams(params);
                    x.image().bind(mRedImg, red.getContent().getAd_info().getPic_url());
                }
            }
        });
    }

    /**
     * 设置对应的数据
     *
     * @param result
     */
    private void setData(String result) {
        if (result != null) {
            KitchenFour kitchenFour = JSONObject.parseObject(result, KitchenFour.class);
            List<KitchenFour.ContentEntity.NavsEntity> navsList = kitchenFour.getContent().getNavs();
            if (navsList != null && navsList.size() > 0) {
                for (int i = 0, size = navsList.size(); i < size; i++) {
                    LinearLayout childLin = (LinearLayout) mIconLin.getChildAt(i);
                    x.image().bind((ImageView) childLin.getChildAt(0), navsList.get(i).getPicurl());
                    ((TextView) childLin.getChildAt(1)).setText(navsList.get(i).getName());
                }
            }
            x.image().bind(mLeftImg, kitchenFour.getContent().getPop_recipe_picurl());
            x.image().bind(mRightImg, kitchenFour.getContent().getPop_recipe_picurl());

            //viewpager
            KitchenFour.ContentEntity.PopEventsEntity pop_events = kitchenFour.getContent().getPop_events();
            if (pop_events != null) {
                List<KitchenFour.ContentEntity.PopEventsEntity.EventsEntity> events = pop_events.getEvents();
                int count = pop_events.getCount();
                for (int i = 0; i < count; i++) {
                    View view = LayoutInflater.from(getActivity()).inflate(R.layout.kitchenviewpager, null);

                    String n_dishes = events.get(i).getN_dishes() + "作品";
                    String name = events.get(i).getName().split("•")[0];
                    String url = events.get(i).getDishes().getDishes().get(0).getThumbnail_280().split("\\?")[0];
                    x.image().bind((ImageView) view.findViewById(R.id.righticon_kitchenviewpager), url);
                    x.image().bind((ImageView) view.findViewById(R.id.lefticon_kitchenviewpager), url);
                    ((TextView) view.findViewById(R.id.name_kitchenviewpager)).setText("——" + name + "——");
                    ((TextView) view.findViewById(R.id.dishes_kitchenviewpager)).setText(n_dishes);
                    mViewList.add(view);
                }
                //设置viewpager适配器
                ViewPagerUtils.setAdapter(mVip, mViewList);
            }
        }
    }

    /**
     * 点击事件
     *
     * @param v
     */
    @Event(value = {R.id.title1_header_listview_fragment, R.id.title2_header_listview_fragment,
            R.id.rankinglist_header_listview_fragment, R.id.watchtv_header_listview_fragment,
            R.id.buy_header_listview_fragment, R.id.category_header_listview_fragment,
            R.id.red_header_listview_fragment},
            type = View.OnClickListener.class)
    private void onClick(View v) {
        Intent intent = null;
        int id = v.getId();
        if (id == R.id.watchtv_header_listview_fragment) {
            //本周流行菜谱-->看视频界面
            intent = new Intent(getActivity(), KitchenWatchActivity.class);
        }

        if (id == R.id.title1_header_listview_fragment) {
            intent = new Intent(getActivity(), KitchenWelcomeActivity.class);
        }

        if (id == R.id.title2_header_listview_fragment || id == R.id.red_header_listview_fragment) {
            //选择登录界面
            intent = new Intent(getActivity(), LoginChooseActivity.class);
        }

        if (id == R.id.rankinglist_header_listview_fragment) {
            //排行榜界面
            intent = new Intent(getActivity(), KitchenRankListActivity.class);
        }

        if (id == R.id.buy_header_listview_fragment) {
            //买买买界面
            intent = new Intent(getActivity(), KitchenBudegtActivity.class);
        }

        if (id == R.id.category_header_listview_fragment) {
            //菜谱分类界面
            intent = new Intent(getActivity(), KitchenCategoryActivity.class);
        }
        startActivity(intent);
    }
}
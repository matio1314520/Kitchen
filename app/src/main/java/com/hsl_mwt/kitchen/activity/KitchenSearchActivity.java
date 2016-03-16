package com.hsl_mwt.kitchen.activity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.GridLayout;
import android.widget.TextView;

import com.alibaba.fastjson.JSONObject;
import com.hsl_mwt.kitchen.R;
import com.hsl_mwt.kitchen.base.KitchenActivity;
import com.hsl_mwt.kitchen.bean.kitchen.KitchenSearch;
import com.hsl_mwt.kitchen.common.KitchenSearchConstant;
import com.hsl_mwt.kitchen.utils.HttpUtils;
import com.hsl_mwt.kitchen.utils.JsonStrCallback;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;

import java.util.List;

/**
 * Created by Angel on 2016/2/22.
 */

@ContentView(R.layout.kitchensearch_activity)
public class KitchenSearchActivity extends KitchenActivity {

    @ViewInject(R.id.popsearch_kitchensearch_activity)
    private GridLayout mPopGri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //请求网络数据
        requestNetData();
    }

    /**
     * 请求网络数据
     */
    private void requestNetData() {
        /**
         * 流行搜索
         */
        HttpUtils.getString(KitchenSearchConstant.POP_URL_GET, new JsonStrCallback() {
            @Override
            public void get(String result) {
                KitchenSearch kitchenSearch = JSONObject.parseObject(result, KitchenSearch.class);
                if (kitchenSearch != null) {
                    List<String> keywords = kitchenSearch.getContent().getKeywords();
                    for (int i = 0, count = mPopGri.getChildCount(); i < count; i++) {
                        ((TextView) mPopGri.getChildAt(i)).setText(keywords.get(i));
                    }
                }
            }
        });
    }

    /**
     * 点击事件
     *
     * @param view
     */
    @Event(value = {R.id.back_kitchensearch_activity, R.id.search_kitchensearch_activity,R.id.tangyuan_kitchensearch_activity}, type = View.OnClickListener.class)
    private void onClick(View view) {
        int id = view.getId();
        if (id == R.id.back_kitchensearch_activity) {
            //返回
            finish();
        }
        if (id == R.id.search_kitchensearch_activity) {
            // 搜索菜谱、食材
            search();
        }
        if (id == R.id.tangyuan_kitchensearch_activity){
            startActivity(new Intent(this,KitChildSearchActivity.class));
        }
    }

    /**
     * 搜索菜谱、食材
     */
    private void search() {


    }
}

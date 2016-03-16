package com.hsl_mwt.kitchen.activity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.alibaba.fastjson.JSONObject;
import com.hsl_mwt.kitchen.R;
import com.hsl_mwt.kitchen.base.KitchenActivity;
import com.hsl_mwt.kitchen.utils.HttpUtils;
import com.hsl_mwt.kitchen.utils.JsonStrCallback;

import org.xutils.http.RequestParams;
import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;

/**
 * Created by Angel on 2016/2/22.
 */
@ContentView(R.layout.kitchenlist_activity)
public class KitchenListActivity extends KitchenActivity {

    @ViewInject(R.id.listview_kitchenlist_activity)
    private ListView mKitchenListLv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //请求网络数据
      //  requestNetData();
    }

    /**
     * 请求网络数据
     */
//    private void requestNetData() {
//
//        String ID_URL = "http://api.xiachufang.com/v2/recipe_lists/4615/recipes_v2.json?origin=android&limit=20&api_sign=1ac58ffac89e3c61eff1847e1eb4ca70&offset=0&api_key=07e72bef932537c71f9cafbe4c94df1c&version=142&";
//
//        RequestParams params = new RequestParams("http://api.xiachufang.com/v2/recipes/lookup.json");
//        params.addBodyParameter("origin", "android");
//        params.addBodyParameter("id", "90183,201608,168972,135374,1000568,90734,1001472,92094,77625,20404,89602,89809,1002892,20392,38526,23331,20396,77533,1000312,37674");
//        params.addBodyParameter("api_sign", "76a2f531558674301b0632bc72e574d3");
//        params.addBodyParameter("api_key", "07e72bef932537c71f9cafbe4c94df1c");
//        params.addBodyParameter("version", "142");
//        params.addBodyParameter("mode", "full");
// //       HttpUtils.postString("http://api.xiachufang.com/v2/recipes/lookup.json", params, new JsonStrCallback() {
//            @Override
////            public void get(String result) {
////                KitchenListItem kitchenListItem = JSONObject.parseObject(result, KitchenListItem.class);
////                if (kitchenListItem != null) {
////                    Log.i("matio", "get: " + kitchenListItem);
////                }
//            }
//        });
//    }

}
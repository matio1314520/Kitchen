package com.hsl_mwt.kitchen.activity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

import com.hsl_mwt.kitchen.R;
import com.hsl_mwt.kitchen.base.KitchenActivity;
import com.hsl_mwt.kitchen.common.kitchen.KitchenCategoryConstant;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;

/**
 * Created by Angel on 2016/2/22.
 */
@ContentView(R.layout.kitchencategory_activity)
public class KitchenRankListActivity extends KitchenActivity {

    @ViewInject(R.id.webview_kitchencateogry_activity)
    private WebView mWeb;

    @ViewInject(R.id.name_kitchencategory_activity)
    private TextView mNameTxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //初始化webview
        initWebView();

        mNameTxt.setText("排行榜");
    }

    /**
     * 初始化webview
     */
    private void initWebView() {
        mWeb.loadUrl(KitchenCategoryConstant.RANKING_WEBVIEW_URL);
    }

    /**
     * 点击事件
     *
     * @param view
     */
    @Event(value = R.id.back_kitchencategory_activity, type = View.OnClickListener.class)
    private void onClik(View view) {
        finish();
    }
}

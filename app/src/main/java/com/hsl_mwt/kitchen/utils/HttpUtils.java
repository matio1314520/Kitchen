package com.hsl_mwt.kitchen.utils;

import android.widget.ImageView;

import com.hsl_mwt.kitchen.R;

import org.xutils.common.Callback;
import org.xutils.common.util.DensityUtil;
import org.xutils.common.util.LogUtil;
import org.xutils.http.RequestParams;
import org.xutils.image.ImageOptions;
import org.xutils.x;

/**
 * Created by Angel on 2016/2/19.
 */
public class HttpUtils {

    /**
     * get获取网络数据
     *
     * @param url      url地址
     * @param callback 回调
     */
    public static void getString(String url, final JsonStrCallback callback) {
        x.http().get(new RequestParams(url), new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                if (result != null) {
                    callback.get(result);
                } else {
                    LogUtil.d("result=" + result);
                }
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                LogUtil.d("onError");
            }

            @Override
            public void onCancelled(CancelledException cex) {
                LogUtil.d("onCancelled");
            }

            @Override
            public void onFinished() {
                LogUtil.d("onFinished");
            }
        });
    }

    /**
     * post获取网络数据
     * @param params
     * @param callback
     */
    public static void postString(RequestParams params, final JsonStrCallback callback) {
        x.http().post(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                if (result != null) {
                    callback.get(result);
                } else {
                    LogUtil.d("result=" + result);
                }
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                LogUtil.d("onError");
            }

            @Override
            public void onCancelled(CancelledException cex) {
                LogUtil.d("onCancelled");
            }

            @Override
            public void onFinished() {
                LogUtil.d("onFinished");
            }
        });
    }

    /**
     * 设置ImageView圆角图片
     *
     * @param imageView 控件
     * @param url       图片url地址
     */
    public static void getImage(ImageView imageView, String url) {
        ImageOptions options = new ImageOptions.Builder()
                .setFailureDrawableId(R.mipmap.ic_launcher)
                .setRadius(DensityUtil.dip2px(20))  //圆角半径
                .setCrop(true)  // 如果ImageView的大小不是定义为wrap_content, 不要crop.
                .setImageScaleType(ImageView.ScaleType.CENTER_CROP)
                .build();
        x.image().bind(imageView, url, options);
    }
}

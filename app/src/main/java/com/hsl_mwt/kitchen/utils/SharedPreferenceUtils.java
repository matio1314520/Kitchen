package com.hsl_mwt.kitchen.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Angel on 2016/2/20.
 */
public class SharedPreferenceUtils {

    /**
     * 获取登录还是未登录的状态
     *
     * @param context
     * @return
     */
    public static boolean get(Context context) {
        SharedPreferences preferences = context.getSharedPreferences("login", Context.MODE_PRIVATE);
        return preferences.getBoolean("login", false);
    }

    /**
     * 写入登录还是未登录的状态
     *
     * @param context
     * @param isLogin
     */
    public static void write(Context context, boolean isLogin) {
        SharedPreferences.Editor editor = context.getSharedPreferences("login", Context.MODE_PRIVATE).edit();
        if (editor != null) {
            editor.putBoolean("login", isLogin);
            editor.commit();
        }
    }
}

package com.hsl_mwt.kitchen;

import android.app.Application;

import org.xutils.x;

/**
 * Created by Angel on 2016/2/19.
 */
public class App extends Application {

    private static App mApp;

    @Override
    public void onCreate() {
        super.onCreate();
        mApp =this;
        x.Ext.init(this);
        x.Ext.setDebug(true);
    }

    public static App getInstance() {
        return mApp;
    }
}

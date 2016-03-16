package com.hsl_mwt.kitchen.utils;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Angel on 2016/2/23.
 */
public class ViewPagerUtils {

    public static void setAdapter(ViewPager viewPager, final List<View> list) {
        viewPager.setAdapter(new PagerAdapter() {
            @Override
            public int getCount() {
                return list != null ? list.size() : 0;
            }

            @Override
            public boolean isViewFromObject(View view, Object object) {
                return view == (View) object;
            }

            @Override
            public Object instantiateItem(ViewGroup container, int position) {
                View view = list.get(position);
                container.addView(view);
                return view;
            }

            @Override
            public void destroyItem(ViewGroup container, int position, Object object) {
                container.removeView(list.get(position));
            }
        });
    }
}

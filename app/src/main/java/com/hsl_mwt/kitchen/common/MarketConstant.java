package com.hsl_mwt.kitchen.common;

/**
 * Created by Angel on 2016/2/20.
 */
public class MarketConstant {

    /**
     * 不变信息
     */
    public static final String HEADER_GRIDVIEW_URL_GET = "http://www.xiachufang.com/page/ec-tab/" +
            "ajax/shelf-items/?limit=20&offset=";

    /**
     * 市集页面接口
     */
    public static String getMarketOnsaleUrl(int offset) {
        return HEADER_GRIDVIEW_URL_GET + offset;
    }

    /**
     * 好店推荐
     */
    public static final String RECYCLERVIEW_URL_GET = "http://www.xiachufang.com/page/ec-tab/ajax/promo-goods/";

    /**
     * 热门主题
     */
    public static final String THEME_URL_GET = "GET http://www.xiachufang.com/page/ec-tab/ajax/outlets/";
}

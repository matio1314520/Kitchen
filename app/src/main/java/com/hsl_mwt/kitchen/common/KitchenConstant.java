package com.hsl_mwt.kitchen.common;

/**
 * Created by Angel on 2016/2/20.
 */
public class KitchenConstant {

    /**
     * listview
     */
    public static final String LIST_URL_GET = "http://api.xiachufang.com/v2/issues/list.json?origin=android&api_sign=46202af256d717856dfca0008a634013&timezone=Asia%2FShanghai&api_key=07e72bef932537c71f9cafbe4c94df1c&version=142&size=1&";
    /**
     * 排行榜   看视频 买买买  菜谱分类
     *
     * viewpager
     */

    public static final String FOUR_URL_GET = "http://api.xiachufang.com/v2/init_page_v5.json?origin=android&api_sign=99d2767aaa4bd288b69135e55a558f5c&timezone=Asia%2FShanghai&api_key=07e72bef932537c71f9cafbe4c94df1c&version=142&";
    /**
     * 新用户可领取20元红包
     */

    public static final String RED_URL_GET = "http://api.xiachufang.com/v2/ad/show.json?height" +
            "=1280&api_key=07e72bef932537c71f9cafbe4c94df1c&width=720&origin=android&api_sign=" +
            "4edf0b5265b6e33ff19be7a2093a3a5a&supported_types=1&version=142&slot_name=homepage_" +
            "banner_ad1&";


    /**
     * 本周最受欢迎  获取id的url
     *
     * origin android
     * id  101709826,100045857,100624223,100457302,100454048,101708780,100381230,100457805,1101962,100595216,101712263,101708729,1082136,101708831,100101270,100605613,100456757,101696625,1004020,100393489
     * api_sign 6e23911f2d9739d6c6e6180b4d04cf5e
     * api_key 07e72bef932537c71f9cafbe4c94df1c
     * version 142
     *  mode full
     *
     */
    public static final String ID_URL_GET="http://api.xiachufang.com/v2/recipes/popular_v2.json?origin=android&limit=20&api_sign=1ac58ffac89e3c61eff1847e1eb4ca70&offset=0&api_key=07e72bef932537c71f9cafbe4c94df1c&version=142&";
                                    //       http://api.xiachufang.com/v2/recipe_lists/4615/recipes_v2.json?origin=android&limit=20&api_sign=1ac58ffac89e3c61eff1847e1eb4ca70&offset=0&api_key=07e72bef932537c71f9cafbe4c94df1c&version=142&
}



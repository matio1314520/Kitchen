package com.hsl_mwt.kitchen.utils;

import com.alibaba.fastjson.JSONObject;
import com.hsl_mwt.kitchen.bean.market.ChooseType;
import com.hsl_mwt.kitchen.bean.market.ItemType;
import com.hsl_mwt.kitchen.bean.market.OnSaleEntity;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by clearlove on 2016/2/23.
 */
public class JsonParse {

    /**
     * 解析
     * @param str
     * @return
     */
    public static List<ItemType> jsonParse(String str) {

        List<ItemType> list = new ArrayList<>();

        try {
            JSONArray jsonArray = new JSONArray(str);
            for (int i = 0, len = jsonArray.length(); i < len; i++) {
                String s = jsonArray.getString(i);

                //item_type = goods是商品解析，=card是菜单解析
                org.json.JSONObject jsonObject = new org.json.JSONObject(s);
                String item_type = jsonObject.getString("item_type");

                if (item_type != null&&item_type.equals("card")) {
                    ItemType chooseType = JSONObject.parseObject(s, ChooseType.class);
                    list.add(chooseType);
                } else {
                    ItemType onSaleEntity = JSONObject.parseObject(s, OnSaleEntity.class);
                    list.add(onSaleEntity);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return list;
    }
}

package com.hsl_mwt.kitchen.bean.market;

import java.io.Serializable;

/**
 * Created by clearlove on 2016/2/23.
 */
public class ItemType implements Serializable {

    public String item_type;

    public ItemType(String item_type) {
        this.item_type = item_type;
    }

    public ItemType() {

    }

    public String getItem_type() {
        return item_type;
    }

    public void setItem_type(String item_type) {
        this.item_type = item_type;
    }
}

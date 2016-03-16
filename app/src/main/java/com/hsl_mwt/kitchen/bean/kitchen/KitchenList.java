package com.hsl_mwt.kitchen.bean.kitchen;


import java.io.Serializable;

/**
 * Created by Angel on 2016/2/20.
 */
public class KitchenList implements Serializable {

    private String status;

    private KitchenListContent content;

    public void setStatus(String status) {
        this.status = status;
    }

    public void setContent(KitchenListContent content) {
        this.content = content;
    }

    public String getStatus() {
        return status;
    }

    public KitchenListContent getContent() {
        return content;
    }
}

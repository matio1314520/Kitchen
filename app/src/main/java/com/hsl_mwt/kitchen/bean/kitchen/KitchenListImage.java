package com.hsl_mwt.kitchen.bean.kitchen;

import java.io.Serializable;

/**
 * Created by Angel on 2016/2/20.
 */
public class KitchenListImage implements Serializable {

    private String url;
    private String width;
    private String height;

    public void setUrl(String url) {
        this.url = url;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getUrl() {
        return url;
    }

    public String getWidth() {
        return width;
    }

    public String getHeight() {
        return height;
    }

}

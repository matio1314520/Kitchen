package com.hsl_mwt.kitchen.bean.kitchen;

import java.io.Serializable;

/**
 * Created by Angel on 2016/2/20.
 */
public class KitchenListItems implements Serializable {

    private String publish_time;
    private String url;
    private int template;
    private int id;
    private KitchenListContents contents;
    private String column_name;

    public void setPublish_time(String publish_time) {
        this.publish_time = publish_time;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setTemplate(int template) {
        this.template = template;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setContents(KitchenListContents contents) {
        this.contents = contents;
    }

    public void setColumn_name(String column_name) {
        this.column_name = column_name;
    }

    public String getPublish_time() {
        return publish_time;
    }

    public String getUrl() {
        return url;
    }

    public int getTemplate() {
        return template;
    }

    public int getId() {
        return id;
    }

    public KitchenListContents getContents() {
        return contents;
    }

    public String getColumn_name() {
        return column_name;
    }


}

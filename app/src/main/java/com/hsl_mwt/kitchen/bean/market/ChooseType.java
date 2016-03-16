package com.hsl_mwt.kitchen.bean.market;

import java.io.Serializable;
import java.util.List;

/**
 * Created by clearlove on 2016/2/23.
 */
public class ChooseType extends ItemType implements Serializable {


    private String item_type;
    private String title;



    private List<PartsEntity> parts;

    public ChooseType(){
        super();
    }

    public ChooseType(String item_type) {
        super(item_type);
    }

    public void setItem_type(String item_type) {
        this.item_type = item_type;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setParts(List<PartsEntity> parts) {
        this.parts = parts;
    }

    public String getItem_type() {
        return item_type;
    }

    public String getTitle() {
        return title;
    }

    public List<PartsEntity> getParts() {
        return parts;
    }

    public static class PartsEntity {
        private String url;
        private String name;

        public void setUrl(String url) {
            this.url = url;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public String getName() {
            return name;
        }
    }
}

package com.hsl_mwt.kitchen.bean.community;

import java.io.Serializable;
import java.util.List;

/**
 * Created by clearlove on 2016/2/24.
 */
public class ItemBean implements Serializable {

    private String name;
    private String desc;
    private List<LatestAuthorsEntity> latest_authors;

    public ItemBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<LatestAuthorsEntity> getLatestAuthores() {
        return latest_authors;
    }

    public void setLatestAuthores(List<LatestAuthorsEntity> latestAuthores) {
        this.latest_authors = latestAuthores;
    }
}

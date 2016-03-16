package com.hsl_mwt.kitchen.bean.community;

import java.io.Serializable;
import java.util.List;

/**
 * Created by clearlove on 2016/2/24.
 */
public class ShoutsEntity extends ItemBean implements Serializable{

    private String name;
    private String desc;

    private List<LatestAuthorsEntity> latest_authors;

    public List<LatestAuthorsEntity> getLatestAuthores() {
        return latest_authors;
    }

    public void setLatest_authors(List<LatestAuthorsEntity> latest_authors) {
        this.latest_authors = latest_authors;
    }

    public ShoutsEntity() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }



    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }


}

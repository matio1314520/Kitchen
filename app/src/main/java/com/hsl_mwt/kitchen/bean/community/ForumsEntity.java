package com.hsl_mwt.kitchen.bean.community;

import java.io.Serializable;
import java.util.List;

/**
 * Created by clearlove on 2016/2/24.
 */
public class ForumsEntity extends ItemBean implements Serializable{

    private String desc;
    private String id;
    private String name;
    private List<LatestAuthorsEntity> latest_authors;

    public ForumsEntity() {
    }

    public List<LatestAuthorsEntity> getLatestAuthores() {
        return latest_authors;
    }

    public void setLatest_authors(List<LatestAuthorsEntity> latest_authors) {
        this.latest_authors = latest_authors;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

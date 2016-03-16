package com.hsl_mwt.kitchen.bean.community;

import java.io.Serializable;
import java.util.List;

/**
 * Created by clearlove on 2016/2/24.
 */
public class ContentEntity implements Serializable{

    private ShoutsEntity shouts;

    private List<ForumsEntity> forums;

    public ContentEntity() {
    }

    public void setShouts(ShoutsEntity shouts) {
        this.shouts = shouts;
    }

    public void setForums(List<ForumsEntity> forums) {
        this.forums = forums;
    }

    public ShoutsEntity getShouts() {
        return shouts;
    }

    public List<ForumsEntity> getForums() {
        return forums;
    }
}

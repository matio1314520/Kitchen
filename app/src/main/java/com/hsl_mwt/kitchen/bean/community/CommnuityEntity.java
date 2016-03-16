package com.hsl_mwt.kitchen.bean.community;

import java.io.Serializable;
import java.util.List;

/**
 * Created by clearlove on 2016/2/24.
 */
public class CommnuityEntity implements Serializable {


    private String status;
    private ContentEntity content;

    public CommnuityEntity() {
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setContent(ContentEntity content) {
        this.content = content;
    }

    public String getStatus() {
        return status;
    }

    public ContentEntity getContent() {
        return content;
    }



}

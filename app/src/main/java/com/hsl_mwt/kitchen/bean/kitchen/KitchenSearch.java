package com.hsl_mwt.kitchen.bean.kitchen;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Angel on 2016/2/23.
 */
public class KitchenSearch implements Serializable {

    private String status;

    private ContentEntity content;

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

    public static class ContentEntity {

        private int total;
        private List<String> keywords;

        public void setTotal(int total) {
            this.total = total;
        }

        public void setKeywords(List<String> keywords) {
            this.keywords = keywords;
        }

        public int getTotal() {
            return total;
        }

        public List<String> getKeywords() {
            return keywords;
        }
    }
}

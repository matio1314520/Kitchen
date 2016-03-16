package com.hsl_mwt.kitchen.bean.market;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Angel on 2016/2/25.
 */
public class MarketTheme implements Serializable {

    private List<Freshoutlet>  fresh_outlet;

    private List<HotOutletsEntity> hot_outlets;

    private List<OutletsEntity> outlets;

    public List<Freshoutlet> getFresh_outlet() {
        return fresh_outlet;
    }

    public void setFresh_outlet(List<Freshoutlet> fresh_outlet) {
        this.fresh_outlet = fresh_outlet;
    }

    public void setHot_outlets(List<HotOutletsEntity> hot_outlets) {
        this.hot_outlets = hot_outlets;
    }

    public void setOutlets(List<OutletsEntity> outlets) {
        this.outlets = outlets;
    }

    public List<HotOutletsEntity> getHot_outlets() {
        return hot_outlets;
    }

    public List<OutletsEntity> getOutlets() {
        return outlets;
    }

    public static class Freshoutlet{

    }

    public static class HotOutletsEntity {
        private String url;
        private String image;
        private String title;

        public void setUrl(String url) {
            this.url = url;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUrl() {
            return url;
        }

        public String getImage() {
            return image;
        }

        public String getTitle() {
            return title;
        }
    }

    public static class OutletsEntity {
        private String subtitle;
        private String title;
        private String url;
        private String start_time;
        private int id;
        private String end_time;
        private String image;

        public void setSubtitle(String subtitle) {
            this.subtitle = subtitle;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public void setStart_time(String start_time) {
            this.start_time = start_time;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setEnd_time(String end_time) {
            this.end_time = end_time;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getSubtitle() {
            return subtitle;
        }

        public String getTitle() {
            return title;
        }

        public String getUrl() {
            return url;
        }

        public String getStart_time() {
            return start_time;
        }

        public int getId() {
            return id;
        }

        public String getEnd_time() {
            return end_time;
        }

        public String getImage() {
            return image;
        }
    }
}

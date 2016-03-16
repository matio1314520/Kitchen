package com.hsl_mwt.kitchen.bean.market;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Angel on 2016/2/24.
 */
public class MarketRecommend  implements Serializable{


    private String status;


    private List<ContentEntity> content;

    public void setStatus(String status) {
        this.status = status;
    }

    public void setContent(List<ContentEntity> content) {
        this.content = content;
    }

    public String getStatus() {
        return status;
    }

    public List<ContentEntity> getContent() {
        return content;
    }

    public static class ContentEntity {
        private String original_price;
        private double average_rate;
        private String name;
        private String shop_url;
        private String item_type;
        private String url;
        private String price;
        private int group_index;
        private int recent_30days_sales_volume;
        private int n_reviews;
        private boolean is_sale;
        private int total_stock;
        private int shop_id;
        private int total_sales_volume;
        private String picurl;
        private int freight;
        private boolean is_new_arrival;
        private int type;
        private int id;
        private String promo_text;

        public void setOriginal_price(String original_price) {
            this.original_price = original_price;
        }

        public void setAverage_rate(double average_rate) {
            this.average_rate = average_rate;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setShop_url(String shop_url) {
            this.shop_url = shop_url;
        }

        public void setItem_type(String item_type) {
            this.item_type = item_type;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public void setGroup_index(int group_index) {
            this.group_index = group_index;
        }

        public void setRecent_30days_sales_volume(int recent_30days_sales_volume) {
            this.recent_30days_sales_volume = recent_30days_sales_volume;
        }

        public void setN_reviews(int n_reviews) {
            this.n_reviews = n_reviews;
        }

        public void setIs_sale(boolean is_sale) {
            this.is_sale = is_sale;
        }

        public void setTotal_stock(int total_stock) {
            this.total_stock = total_stock;
        }

        public void setShop_id(int shop_id) {
            this.shop_id = shop_id;
        }

        public void setTotal_sales_volume(int total_sales_volume) {
            this.total_sales_volume = total_sales_volume;
        }

        public void setPicurl(String picurl) {
            this.picurl = picurl;
        }

        public void setFreight(int freight) {
            this.freight = freight;
        }

        public void setIs_new_arrival(boolean is_new_arrival) {
            this.is_new_arrival = is_new_arrival;
        }

        public void setType(int type) {
            this.type = type;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setPromo_text(String promo_text) {
            this.promo_text = promo_text;
        }

        public String getOriginal_price() {
            return original_price;
        }

        public double getAverage_rate() {
            return average_rate;
        }

        public String getName() {
            return name;
        }

        public String getShop_url() {
            return shop_url;
        }

        public String getItem_type() {
            return item_type;
        }

        public String getUrl() {
            return url;
        }

        public String getPrice() {
            return price;
        }

        public int getGroup_index() {
            return group_index;
        }

        public int getRecent_30days_sales_volume() {
            return recent_30days_sales_volume;
        }

        public int getN_reviews() {
            return n_reviews;
        }

        public boolean isIs_sale() {
            return is_sale;
        }

        public int getTotal_stock() {
            return total_stock;
        }

        public int getShop_id() {
            return shop_id;
        }

        public int getTotal_sales_volume() {
            return total_sales_volume;
        }

        public String getPicurl() {
            return picurl;
        }

        public int getFreight() {
            return freight;
        }

        public boolean isIs_new_arrival() {
            return is_new_arrival;
        }

        public int getType() {
            return type;
        }

        public int getId() {
            return id;
        }

        public String getPromo_text() {
            return promo_text;
        }
    }
}

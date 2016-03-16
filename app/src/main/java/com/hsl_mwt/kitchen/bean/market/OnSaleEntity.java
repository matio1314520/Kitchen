package com.hsl_mwt.kitchen.bean.market;

import java.io.Serializable;

/**
 * Created by clearlove on 2016/2/23.
 */
public class OnSaleEntity extends ItemType implements Serializable{


    private String original_price;
    private double average_rate;
    private String name;
    private String item_type;
    private String url;
    private String price;
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

    public OnSaleEntity(){
        super();
    }

    public OnSaleEntity(String item_type) {
        super(item_type);
    }

    public void setOriginal_price(String original_price) {
        this.original_price = original_price;
    }

    public void setAverage_rate(double average_rate) {
        this.average_rate = average_rate;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getOriginal_price() {
        return original_price;
    }

    public double getAverage_rate() {
        return average_rate;
    }

    public String getName() {
        return name;
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
}

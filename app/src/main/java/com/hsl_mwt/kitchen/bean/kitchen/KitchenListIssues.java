package com.hsl_mwt.kitchen.bean.kitchen;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Angel on 2016/2/20.
 */
public class KitchenListIssues implements Serializable {
    private int items_count;
    private String title;
    private int issue_id;
    private String publish_date;
    private List<KitchenListItems> items;
    private List<?> today_events;

    public void setItems_count(int items_count) {
        this.items_count = items_count;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIssue_id(int issue_id) {
        this.issue_id = issue_id;
    }

    public void setPublish_date(String publish_date) {
        this.publish_date = publish_date;
    }

    public void setItems(List<KitchenListItems> items) {
        this.items = items;
    }

    public void setToday_events(List<?> today_events) {
        this.today_events = today_events;
    }

    public int getItems_count() {
        return items_count;
    }

    public String getTitle() {
        return title;
    }

    public int getIssue_id() {
        return issue_id;
    }

    public String getPublish_date() {
        return publish_date;
    }

    public List<KitchenListItems> getItems() {
        return items;
    }

    public List<?> getToday_events() {
        return today_events;
    }


}

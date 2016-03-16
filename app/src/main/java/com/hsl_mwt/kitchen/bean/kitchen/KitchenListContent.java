package com.hsl_mwt.kitchen.bean.kitchen;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Angel on 2016/2/20.
 */
public class KitchenListContent  implements Serializable{
    private KitchenListCursor cursor;

    private int count;

    private List<KitchenListIssues> issues;

    public void setCursor(KitchenListCursor cursor) {
        this.cursor = cursor;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setIssues(List<KitchenListIssues> issues) {
        this.issues = issues;
    }

    public KitchenListCursor getCursor() {
        return cursor;
    }

    public int getCount() {
        return count;
    }

    public List<KitchenListIssues> getIssues() {
        return issues;
    }

}

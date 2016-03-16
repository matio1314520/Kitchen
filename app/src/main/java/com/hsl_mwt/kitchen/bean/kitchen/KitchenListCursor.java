package com.hsl_mwt.kitchen.bean.kitchen;

import java.io.Serializable;

/**
 * Created by Angel on 2016/2/20.
 */
public class KitchenListCursor implements Serializable {

    private boolean has_next;
    private boolean has_prev;
    private String prev;
    private String next;

    public void setHas_next(boolean has_next) {
        this.has_next = has_next;
    }

    public void setHas_prev(boolean has_prev) {
        this.has_prev = has_prev;
    }

    public void setPrev(String prev) {
        this.prev = prev;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public boolean isHas_next() {
        return has_next;
    }

    public boolean isHas_prev() {
        return has_prev;
    }

    public String getPrev() {
        return prev;
    }

    public String getNext() {
        return next;
    }
}

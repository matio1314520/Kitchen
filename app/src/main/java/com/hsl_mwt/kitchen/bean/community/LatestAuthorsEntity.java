package com.hsl_mwt.kitchen.bean.community;

import java.io.Serializable;

/**
 * Created by clearlove on 2016/2/24.
 */
public class LatestAuthorsEntity implements Serializable {

    private String photo60;
    private String photo160;
    private String name;
    private String photo;
    private boolean is_expert;
    private String mail;
    private String id;

    public LatestAuthorsEntity() {
    }

    public void setPhoto60(String photo60) {
        this.photo60 = photo60;
    }

    public void setPhoto160(String photo160) {
        this.photo160 = photo160;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setIs_expert(boolean is_expert) {
        this.is_expert = is_expert;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoto60() {
        return photo60;
    }

    public String getPhoto160() {
        return photo160;
    }

    public String getName() {
        return name;
    }

    public String getPhoto() {
        return photo;
    }

    public boolean isIs_expert() {
        return is_expert;
    }

    public String getMail() {
        return mail;
    }

    public String getId() {
        return id;
    }
}

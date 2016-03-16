package com.hsl_mwt.kitchen.bean.kitchen;

import com.hsl_mwt.kitchen.bean.*;

import java.io.Serializable;

/**
 * Created by Angel on 2016/2/20.
 */
public class KitchenListContents implements Serializable {
    private String video_url;
    private KitchenListAuthor author;
    private KitchenListImage image;
    private String title_2nd;
    private String title_1st;
    private String title;
    private String n_cooked;
    private String n_dishes;
    private String score;
    private String recipe_id;
    private String desc;

    public String getVideo_url() {
        return video_url;
    }

    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }

    public KitchenListAuthor getAuthor() {
        return author;
    }

    public void setAuthor( KitchenListAuthor author) {
        this.author = author;
    }

    public KitchenListImage getImage() {
        return image;
    }

    public void setImage(KitchenListImage image) {
        this.image = image;
    }

    public String getTitle_2nd() {
        return title_2nd;
    }

    public void setTitle_2nd(String title_2nd) {
        this.title_2nd = title_2nd;
    }

    public String getTitle_1st() {
        return title_1st;
    }

    public void setTitle_1st(String title_1st) {
        this.title_1st = title_1st;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getN_cooked() {
        return n_cooked;
    }

    public void setN_cooked(String n_cooked) {
        this.n_cooked = n_cooked;
    }

    public String getN_dishes() {
        return n_dishes;
    }

    public void setN_dishes(String n_dishes) {
        this.n_dishes = n_dishes;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getRecipe_id() {
        return recipe_id;
    }

    public void setRecipe_id(String recipe_id) {
        this.recipe_id = recipe_id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


}

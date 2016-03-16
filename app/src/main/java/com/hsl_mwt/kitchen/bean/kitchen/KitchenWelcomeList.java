package com.hsl_mwt.kitchen.bean.kitchen;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Angel on 2016/2/22.
 */
public class KitchenWelcomeList implements Serializable {
    private String status;

    private KitchenItemContent content;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public KitchenItemContent getContent() {
        return content;
    }

    public void setContent(KitchenItemContent content) {
        this.content = content;
    }

    public static class KitchenItemContent {
        private int total;

        private List<KitchenItemRecipes> recipes;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<KitchenItemRecipes> getRecipes() {
            return recipes;
        }

        public void setRecipes(List<KitchenItemRecipes> recipes) {
            this.recipes = recipes;
        }

        public static class KitchenItemRecipes {

            private KitchenItemAuthor author;

            private String create_time;

            private String desc;

            private String dish_author;

            private String friendly_create_time;

            private String id;

            private String ident;

            private List<KitchenItemIngredient> ingredient;
            private List<KitchenItemInstruction> instruction;

            private String is_exclusive;

            private String name;

            private String photo;

            private String photo140;

            private String photo280;

            private String photo340;

            private String photo526;

            private String photo580;

            private String photo640;

            private String photo80;

            private String photo90;

            private String purchase_url;

            private String score;

            private KitchenItemStats stats;

            private String summary;

            private String thumb;

            private String tips;

            private String url;

            private String video_page_url;

            private String video_url;

            public KitchenItemAuthor getAuthor() {
                return author;
            }

            public void setAuthor(KitchenItemAuthor author) {
                this.author = author;
            }

            public String getCreate_time() {
                return create_time;
            }

            public void setCreate_time(String create_time) {
                this.create_time = create_time;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getDish_author() {
                return dish_author;
            }

            public void setDish_author(String dish_author) {
                this.dish_author = dish_author;
            }

            public String getFriendly_create_time() {
                return friendly_create_time;
            }

            public void setFriendly_create_time(String friendly_create_time) {
                this.friendly_create_time = friendly_create_time;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getIdent() {
                return ident;
            }

            public void setIdent(String ident) {
                this.ident = ident;
            }

            public List<KitchenItemIngredient> getIngredient() {
                return ingredient;
            }

            public void setIngredient(List<KitchenItemIngredient> ingredient) {
                this.ingredient = ingredient;
            }

            public List<KitchenItemInstruction> getInstruction() {
                return instruction;
            }

            public void setInstruction(List<KitchenItemInstruction> instruction) {
                this.instruction = instruction;
            }

            public String getIs_exclusive() {
                return is_exclusive;
            }

            public void setIs_exclusive(String is_exclusive) {
                this.is_exclusive = is_exclusive;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPhoto() {
                return photo;
            }

            public void setPhoto(String photo) {
                this.photo = photo;
            }

            public String getPhoto140() {
                return photo140;
            }

            public void setPhoto140(String photo140) {
                this.photo140 = photo140;
            }

            public String getPhoto280() {
                return photo280;
            }

            public void setPhoto280(String photo280) {
                this.photo280 = photo280;
            }

            public String getPhoto340() {
                return photo340;
            }

            public void setPhoto340(String photo340) {
                this.photo340 = photo340;
            }

            public String getPhoto526() {
                return photo526;
            }

            public void setPhoto526(String photo526) {
                this.photo526 = photo526;
            }

            public String getPhoto580() {
                return photo580;
            }

            public void setPhoto580(String photo580) {
                this.photo580 = photo580;
            }

            public String getPhoto640() {
                return photo640;
            }

            public void setPhoto640(String photo640) {
                this.photo640 = photo640;
            }

            public String getPhoto80() {
                return photo80;
            }

            public void setPhoto80(String photo80) {
                this.photo80 = photo80;
            }

            public String getPhoto90() {
                return photo90;
            }

            public void setPhoto90(String photo90) {
                this.photo90 = photo90;
            }

            public String getPurchase_url() {
                return purchase_url;
            }

            public void setPurchase_url(String purchase_url) {
                this.purchase_url = purchase_url;
            }

            public String getScore() {
                return score;
            }

            public void setScore(String score) {
                this.score = score;
            }

            public KitchenItemStats getStats() {
                return stats;
            }

            public void setStats(KitchenItemStats stats) {
                this.stats = stats;
            }

            public String getSummary() {
                return summary;
            }

            public void setSummary(String summary) {
                this.summary = summary;
            }

            public String getThumb() {
                return thumb;
            }

            public void setThumb(String thumb) {
                this.thumb = thumb;
            }

            public String getTips() {
                return tips;
            }

            public void setTips(String tips) {
                this.tips = tips;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getVideo_page_url() {
                return video_page_url;
            }

            public void setVideo_page_url(String video_page_url) {
                this.video_page_url = video_page_url;
            }

            public String getVideo_url() {
                return video_url;
            }

            public void setVideo_url(String video_url) {
                this.video_url = video_url;
            }

            public static class KitchenItemAuthor {
                private String id;
                private String is_expert;
                private String mail;
                private String name;
                private String photo;
                private String photo160;
                private String photo60;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getIs_expert() {
                    return is_expert;
                }

                public void setIs_expert(String is_expert) {
                    this.is_expert = is_expert;
                }

                public String getMail() {
                    return mail;
                }

                public void setMail(String mail) {
                    this.mail = mail;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getPhoto() {
                    return photo;
                }

                public void setPhoto(String photo) {
                    this.photo = photo;
                }

                public String getPhoto160() {
                    return photo160;
                }

                public void setPhoto160(String photo160) {
                    this.photo160 = photo160;
                }

                public String getPhoto60() {
                    return photo60;
                }

                public void setPhoto60(String photo60) {
                    this.photo60 = photo60;
                }
            }

            public static class KitchenItemIngredient {
                private String amount;
                private String cat;
                private String name;

                public String getAmount() {
                    return amount;
                }

                public void setAmount(String amount) {
                    this.amount = amount;
                }

                public String getCat() {
                    return cat;
                }

                public void setCat(String cat) {
                    this.cat = cat;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class KitchenItemInstruction {
                private String ident;

                private String step;

                private String text;

                private String url;

                public String getIdent() {
                    return ident;
                }

                public void setIdent(String ident) {
                    this.ident = ident;
                }

                public String getStep() {
                    return step;
                }

                public void setStep(String step) {
                    this.step = step;
                }

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }

            public static class KitchenItemStats {
                private String cooked_by_me;

                private String n_collects;

                private String n_comments;

                private String n_cooked;

                private String n_cooked_last_week;

                private String n_dishes;

                private String n_pv;

                public String getCooked_by_me() {
                    return cooked_by_me;
                }

                public void setCooked_by_me(String cooked_by_me) {
                    this.cooked_by_me = cooked_by_me;
                }

                public String getN_collects() {
                    return n_collects;
                }

                public void setN_collects(String n_collects) {
                    this.n_collects = n_collects;
                }

                public String getN_comments() {
                    return n_comments;
                }

                public void setN_comments(String n_comments) {
                    this.n_comments = n_comments;
                }

                public String getN_cooked() {
                    return n_cooked;
                }

                public void setN_cooked(String n_cooked) {
                    this.n_cooked = n_cooked;
                }

                public String getN_cooked_last_week() {
                    return n_cooked_last_week;
                }

                public void setN_cooked_last_week(String n_cooked_last_week) {
                    this.n_cooked_last_week = n_cooked_last_week;
                }

                public String getN_dishes() {
                    return n_dishes;
                }

                public void setN_dishes(String n_dishes) {
                    this.n_dishes = n_dishes;
                }

                public String getN_pv() {
                    return n_pv;
                }

                public void setN_pv(String n_pv) {
                    this.n_pv = n_pv;
                }
            }

        }
    }
}

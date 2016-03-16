package com.hsl_mwt.kitchen.bean.kitchen;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Angel on 2016/2/25.
 */
public class KitchenChildSearch implements Serializable {

    private String status;

    private SearchContent content;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SearchContent getContent() {
        return content;
    }

    public void setContent(SearchContent content) {
        this.content = content;
    }

    public static class SearchContent {

        private String count;

        private List<Content> content;

        private String total;

        private String type;

        public String getCount() {
            return count;
        }

        public void setCount(String count) {
            this.count = count;
        }

        public List<Content> getContent() {
            return content;
        }

        public void setContent(List<Content> content) {
            this.content = content;
        }

        public String getTotal() {
            return total;
        }

        public void setTotal(String total) {
            this.total = total;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public static class Content {

            private IntContent content;
            private String type;

            public IntContent getContent() {
                return content;
            }

            public void setContent(IntContent content) {
                this.content = content;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public static class IntContent {

                private String kind;

                private String id;

                private ContentObject object;

                public String getKind() {
                    return kind;
                }

                public void setKind(String kind) {
                    this.kind = kind;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public ContentObject getObject() {
                    return object;
                }

                public void setObject(ContentObject object) {
                    this.object = object;
                }

                public static class ContentObject {

                    private List<Instruction> instruction;

                    private String video_url;

                    private String photo;

                    private String friendly_create_time;

                    private String create_time;

                    private String is_exclusive;

                    private String photo140;

                    private String photo580;

                    private String id;

                    private String video_page_url;

                    private String photo90;

                    private Stats stats;

                    private String thumb;

                    private Author author;

                    private String score;

                    private String tips;

                    private String photo526;

                    private String photo640;

                    private List<Ingredient> ingredient;

                    private List<DishAuthor> dish_author;

                    private String purchase_url;

                    private String ident;

                    private String photo280;

                    private String desc;

                    private String photo80;

                    private String name;

                    private String url;

                    private String photo340;

                    private String summary;

                    public List<Instruction> getInstruction() {
                        return instruction;
                    }

                    public void setInstruction(List<Instruction> instruction) {
                        this.instruction = instruction;
                    }

                    public String getVideo_url() {
                        return video_url;
                    }

                    public void setVideo_url(String video_url) {
                        this.video_url = video_url;
                    }

                    public String getPhoto() {
                        return photo;
                    }

                    public void setPhoto(String photo) {
                        this.photo = photo;
                    }

                    public String getFriendly_create_time() {
                        return friendly_create_time;
                    }

                    public void setFriendly_create_time(String friendly_create_time) {
                        this.friendly_create_time = friendly_create_time;
                    }

                    public String getCreate_time() {
                        return create_time;
                    }

                    public void setCreate_time(String create_time) {
                        this.create_time = create_time;
                    }

                    public String getIs_exclusive() {
                        return is_exclusive;
                    }

                    public void setIs_exclusive(String is_exclusive) {
                        this.is_exclusive = is_exclusive;
                    }

                    public String getPhoto140() {
                        return photo140;
                    }

                    public void setPhoto140(String photo140) {
                        this.photo140 = photo140;
                    }

                    public String getPhoto580() {
                        return photo580;
                    }

                    public void setPhoto580(String photo580) {
                        this.photo580 = photo580;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }

                    public String getVideo_page_url() {
                        return video_page_url;
                    }

                    public void setVideo_page_url(String video_page_url) {
                        this.video_page_url = video_page_url;
                    }

                    public String getPhoto90() {
                        return photo90;
                    }

                    public void setPhoto90(String photo90) {
                        this.photo90 = photo90;
                    }

                    public Stats getStats() {
                        return stats;
                    }

                    public void setStats(Stats stats) {
                        this.stats = stats;
                    }

                    public String getThumb() {
                        return thumb;
                    }

                    public void setThumb(String thumb) {
                        this.thumb = thumb;
                    }

                    public Author getAuthor() {
                        return author;
                    }

                    public void setAuthor(Author author) {
                        this.author = author;
                    }

                    public String getScore() {
                        return score;
                    }

                    public void setScore(String score) {
                        this.score = score;
                    }

                    public String getTips() {
                        return tips;
                    }

                    public void setTips(String tips) {
                        this.tips = tips;
                    }

                    public String getPhoto526() {
                        return photo526;
                    }

                    public void setPhoto526(String photo526) {
                        this.photo526 = photo526;
                    }

                    public String getPhoto640() {
                        return photo640;
                    }

                    public void setPhoto640(String photo640) {
                        this.photo640 = photo640;
                    }

                    public List<Ingredient> getIngredient() {
                        return ingredient;
                    }

                    public void setIngredient(List<Ingredient> ingredient) {
                        this.ingredient = ingredient;
                    }

                    public List<DishAuthor> getDish_author() {
                        return dish_author;
                    }

                    public void setDish_author(List<DishAuthor> dish_author) {
                        this.dish_author = dish_author;
                    }

                    public String getPurchase_url() {
                        return purchase_url;
                    }

                    public void setPurchase_url(String purchase_url) {
                        this.purchase_url = purchase_url;
                    }

                    public String getIdent() {
                        return ident;
                    }

                    public void setIdent(String ident) {
                        this.ident = ident;
                    }

                    public String getPhoto280() {
                        return photo280;
                    }

                    public void setPhoto280(String photo280) {
                        this.photo280 = photo280;
                    }

                    public String getDesc() {
                        return desc;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }

                    public String getPhoto80() {
                        return photo80;
                    }

                    public void setPhoto80(String photo80) {
                        this.photo80 = photo80;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public String getPhoto340() {
                        return photo340;
                    }

                    public void setPhoto340(String photo340) {
                        this.photo340 = photo340;
                    }

                    public String getSummary() {
                        return summary;
                    }

                    public void setSummary(String summary) {
                        this.summary = summary;
                    }

                    public static class Instruction {
                        private String url;

                        private String text;

                        private String step;

                        private String ident;

                        public String getUrl() {
                            return url;
                        }

                        public void setUrl(String url) {
                            this.url = url;
                        }

                        public String getText() {
                            return text;
                        }

                        public void setText(String text) {
                            this.text = text;
                        }

                        public String getStep() {
                            return step;
                        }

                        public void setStep(String step) {
                            this.step = step;
                        }

                        public String getIdent() {
                            return ident;
                        }

                        public void setIdent(String ident) {
                            this.ident = ident;
                        }
                    }

                    public static class Stats {

                        private String n_collects;

                        private String n_comments;

                        private String n_cooked;

                        private String n_dishes;

                        private String cooked_by_me;

                        private String n_cooked_last_week;

                        private String n_pv;

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

                        public String getN_dishes() {
                            return n_dishes;
                        }

                        public void setN_dishes(String n_dishes) {
                            this.n_dishes = n_dishes;
                        }

                        public String getCooked_by_me() {
                            return cooked_by_me;
                        }

                        public void setCooked_by_me(String cooked_by_me) {
                            this.cooked_by_me = cooked_by_me;
                        }

                        public String getN_cooked_last_week() {
                            return n_cooked_last_week;
                        }

                        public void setN_cooked_last_week(String n_cooked_last_week) {
                            this.n_cooked_last_week = n_cooked_last_week;
                        }

                        public String getN_pv() {
                            return n_pv;
                        }

                        public void setN_pv(String n_pv) {
                            this.n_pv = n_pv;
                        }
                    }

                    public static class Author {

                        private String photo60;

                        private String photo160;

                        private String name;

                        private String photo;

                        private String is_expert;

                        private String mail;

                        private String id;

                        public String getPhoto60() {
                            return photo60;
                        }

                        public void setPhoto60(String photo60) {
                            this.photo60 = photo60;
                        }

                        public String getPhoto160() {
                            return photo160;
                        }

                        public void setPhoto160(String photo160) {
                            this.photo160 = photo160;
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

                        public String getId() {
                            return id;
                        }

                        public void setId(String id) {
                            this.id = id;
                        }
                    }

                    public static class Ingredient {

                        private String amount;

                        private String name;

                        private String cat;

                        public String getAmount() {
                            return amount;
                        }

                        public void setAmount(String amount) {
                            this.amount = amount;
                        }

                        public String getName() {
                            return name;
                        }

                        public void setName(String name) {
                            this.name = name;
                        }

                        public String getCat() {
                            return cat;
                        }

                        public void setCat(String cat) {
                            this.cat = cat;
                        }
                    }

                    public static class DishAuthor {
                    }
                }
            }
        }

    }
}

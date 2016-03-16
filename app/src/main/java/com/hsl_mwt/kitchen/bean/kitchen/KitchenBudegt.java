package com.hsl_mwt.kitchen.bean.kitchen;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Angel on 2016/2/23.
 */
public class KitchenBudegt implements Serializable {

    private String status;

    private ContentEntity content;

    public void setStatus(String status) {
        this.status = status;
    }

    public void setContent(ContentEntity content) {
        this.content = content;
    }

    public String getStatus() {
        return status;
    }

    public ContentEntity getContent() {
        return content;
    }

    public static class ContentEntity {

        private CursorEntity cursor;
        private int count;
        private String title;

        private List<ReviewsEntity> reviews;

        public void setCursor(CursorEntity cursor) {
            this.cursor = cursor;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setReviews(List<ReviewsEntity> reviews) {
            this.reviews = reviews;
        }

        public CursorEntity getCursor() {
            return cursor;
        }

        public int getCount() {
            return count;
        }

        public String getTitle() {
            return title;
        }

        public List<ReviewsEntity> getReviews() {
            return reviews;
        }

        public static class CursorEntity {
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

        public static class ReviewsEntity {
            private String additional_review;
            private String friendly_create_time;
            private int rate;
            private String create_time;
            private int ncomments;
            private int goods_id;
            private AuthorEntity author;
            private String review;
            private int id;
            private boolean is_published;
            private List<AdditionalReview> additional_review_photos;
            private int type;
            private DiggUsersEntity digg_users;
            private List<PhotosEntity> photos;
            private int ndiggs;
            private List<?> latest_comments;
            private CommodityEntity commodity;
            private String url;
            private boolean digged_by_me;
            private String additional_review_create_time;
            private String shop_reply;
            private boolean is_essential;

            public String getAdditional_review() {
                return additional_review;
            }

            public void setAdditional_review(String additional_review) {
                this.additional_review = additional_review;
            }

            public String getFriendly_create_time() {
                return friendly_create_time;
            }

            public void setFriendly_create_time(String friendly_create_time) {
                this.friendly_create_time = friendly_create_time;
            }

            public int getRate() {
                return rate;
            }

            public void setRate(int rate) {
                this.rate = rate;
            }

            public String getCreate_time() {
                return create_time;
            }

            public void setCreate_time(String create_time) {
                this.create_time = create_time;
            }

            public int getNcomments() {
                return ncomments;
            }

            public void setNcomments(int ncomments) {
                this.ncomments = ncomments;
            }

            public int getGoods_id() {
                return goods_id;
            }

            public void setGoods_id(int goods_id) {
                this.goods_id = goods_id;
            }

            public AuthorEntity getAuthor() {
                return author;
            }

            public void setAuthor(AuthorEntity author) {
                this.author = author;
            }

            public String getReview() {
                return review;
            }

            public void setReview(String review) {
                this.review = review;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public boolean is_published() {
                return is_published;
            }

            public void setIs_published(boolean is_published) {
                this.is_published = is_published;
            }

            public List<AdditionalReview> getAdditional_review_photos() {
                return additional_review_photos;
            }

            public void setAdditional_review_photos(List<AdditionalReview> additional_review_photos) {
                this.additional_review_photos = additional_review_photos;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public DiggUsersEntity getDigg_users() {
                return digg_users;
            }

            public void setDigg_users(DiggUsersEntity digg_users) {
                this.digg_users = digg_users;
            }

            public List<PhotosEntity> getPhotos() {
                return photos;
            }

            public void setPhotos(List<PhotosEntity> photos) {
                this.photos = photos;
            }

            public int getNdiggs() {
                return ndiggs;
            }

            public void setNdiggs(int ndiggs) {
                this.ndiggs = ndiggs;
            }

            public List<?> getLatest_comments() {
                return latest_comments;
            }

            public void setLatest_comments(List<?> latest_comments) {
                this.latest_comments = latest_comments;
            }

            public CommodityEntity getCommodity() {
                return commodity;
            }

            public void setCommodity(CommodityEntity commodity) {
                this.commodity = commodity;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public boolean isDigged_by_me() {
                return digged_by_me;
            }

            public void setDigged_by_me(boolean digged_by_me) {
                this.digged_by_me = digged_by_me;
            }

            public String getAdditional_review_create_time() {
                return additional_review_create_time;
            }

            public void setAdditional_review_create_time(String additional_review_create_time) {
                this.additional_review_create_time = additional_review_create_time;
            }

            public String getShop_reply() {
                return shop_reply;
            }

            public void setShop_reply(String shop_reply) {
                this.shop_reply = shop_reply;
            }

            public boolean is_essential() {
                return is_essential;
            }

            public void setIs_essential(boolean is_essential) {
                this.is_essential = is_essential;
            }

            public static class AdditionalReview{
                private String url;

                private String ident;

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getIdent() {
                    return ident;
                }

                public void setIdent(String ident) {
                    this.ident = ident;
                }
            }
            public static class AuthorEntity {
                private String photo60;
                private String photo160;
                private String name;
                private String photo;
                private boolean is_expert;
                private String mail;
                private String id;

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

            public static class DiggUsersEntity {
                private int count;
                private int total;
                /**
                 * photo60 : http://s2.cdn.xiachufang.com/22c6e168d9e611e58cc1b951938722b1.jpg?imageView2/1/w/60/h/60/interlace/1/q/90/format/jpg/.jpg
                 * photo160 : http://s2.cdn.xiachufang.com/22c6e168d9e611e58cc1b951938722b1.jpg?imageView2/1/w/160/h/160/interlace/1/q/90/format/jpg/.jpg
                 * name : 手机用户7563_sclz
                 * photo : http://s2.cdn.xiachufang.com/22c6e168d9e611e58cc1b951938722b1.jpg?imageView2/1/w/30/h/30/interlace/1/q/90/format/jpg/.jpg
                 * is_expert : false
                 * mail :
                 * id : 109539916
                 */

                private List<UsersEntity> users;

                public void setCount(int count) {
                    this.count = count;
                }

                public void setTotal(int total) {
                    this.total = total;
                }

                public void setUsers(List<UsersEntity> users) {
                    this.users = users;
                }

                public int getCount() {
                    return count;
                }

                public int getTotal() {
                    return total;
                }

                public List<UsersEntity> getUsers() {
                    return users;
                }

                public static class UsersEntity {
                    private String photo60;
                    private String photo160;
                    private String name;
                    private String photo;
                    private boolean is_expert;
                    private String mail;
                    private String id;

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
            }

            public static class CommodityEntity {
                /**
                 * id : 11551
                 * name : FlowerPlus | 单品鲜花包月4束（品种随机）
                 */

                private GoodsEntity goods;
                private String kind_name;
                private int number;

                public void setGoods(GoodsEntity goods) {
                    this.goods = goods;
                }

                public void setKind_name(String kind_name) {
                    this.kind_name = kind_name;
                }

                public void setNumber(int number) {
                    this.number = number;
                }

                public GoodsEntity getGoods() {
                    return goods;
                }

                public String getKind_name() {
                    return kind_name;
                }

                public int getNumber() {
                    return number;
                }

                public static class GoodsEntity {
                    private int id;
                    private String name;

                    public void setId(int id) {
                        this.id = id;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public int getId() {
                        return id;
                    }

                    public String getName() {
                        return name;
                    }
                }
            }

            public static class PhotosEntity {
                private String url;
                private String ident;

                public void setUrl(String url) {
                    this.url = url;
                }

                public void setIdent(String ident) {
                    this.ident = ident;
                }

                public String getUrl() {
                    return url;
                }

                public String getIdent() {
                    return ident;
                }
            }
        }
    }
}
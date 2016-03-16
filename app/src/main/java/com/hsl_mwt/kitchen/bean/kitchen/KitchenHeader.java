package com.hsl_mwt.kitchen.bean.kitchen;

import java.util.List;

/**
 * Created by Angel on 2016/2/20.
 */
public class KitchenHeader {

    private String status;


    private KitchenHheaderContent  content;

    public void setStatus(String status) {
        this.status = status;
    }

    public void setContent(KitchenHheaderContent content) {
        this.content = content;
    }

    public String getStatus() {
        return status;
    }

    public KitchenHheaderContent getContent() {
        return content;
    }

    public static class KitchenHheaderContent {

        private KitchenHeaderPopEvents  pop_events;

        private String pop_recipe_picurl;

        private List<KitchenHeaderNavs> navs;

        public void setPop_events(KitchenHeaderPopEvents pop_events) {
            this.pop_events = pop_events;
        }

        public void setPop_recipe_picurl(String pop_recipe_picurl) {
            this.pop_recipe_picurl = pop_recipe_picurl;
        }

        public void setNavs(List<KitchenHeaderNavs> navs) {
            this.navs = navs;
        }

        public KitchenHeaderPopEvents getPop_events() {
            return pop_events;
        }

        public String getPop_recipe_picurl() {
            return pop_recipe_picurl;
        }

        public List<KitchenHeaderNavs> getNavs() {
            return navs;
        }

        public static class KitchenHeaderPopEvents {
            private int count;

            private List<KitchenHeaderEvents> events;

            public void setCount(int count) {
                this.count = count;
            }

            public void setEvents(List<KitchenHeaderEvents> events) {
                this.events = events;
            }

            public int getCount() {
                return count;
            }

            public List<KitchenHeaderEvents> getEvents() {
                return events;
            }

            public static class KitchenHeaderEvents {
                private int n_dishes;
                private String id;
                private KitchenHeaderCust customization;
                private KitchenHeaderDishes  dishes;
                private String name;

                public void setN_dishes(int n_dishes) {
                    this.n_dishes = n_dishes;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public void setDishes(KitchenHeaderDishes dishes) {
                    this.dishes = dishes;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public int getN_dishes() {
                    return n_dishes;
                }

                public String getId() {
                    return id;
                }

                public KitchenHeaderDishes getDishes() {
                    return dishes;
                }

                public String getName() {
                    return name;
                }

                public static class KitchenHeaderCust{

                }
                public static class KitchenHeaderDishes {

                    private List<DishesEntity> dishes;

                    public void setDishes(List<DishesEntity> dishes) {
                        this.dishes = dishes;
                    }

                    public List<DishesEntity> getDishes() {
                        return dishes;
                    }

                    public static class DishesEntity {
                        private String thumbnail_280;

                        public void setThumbnail_280(String thumbnail_280) {
                            this.thumbnail_280 = thumbnail_280;
                        }

                        public String getThumbnail_280() {
                            return thumbnail_280;
                        }
                    }
                }
            }
        }

        public static class KitchenHeaderNavs {
            private String url;
            private String name;
            private String picurl;

            public void setUrl(String url) {
                this.url = url;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setPicurl(String picurl) {
                this.picurl = picurl;
            }

            public String getUrl() {
                return url;
            }

            public String getName() {
                return name;
            }

            public String getPicurl() {
                return picurl;
            }
        }
    }
}

package com.hsl_mwt.kitchen.bean.kitchen;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Angel on 2016/2/22.
 */
public class KitchenFour implements Serializable {

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

        private PopEventsEntity pop_events;
        private String pop_recipe_picurl;
        private List<NavsEntity> navs;

        public void setPop_events(PopEventsEntity pop_events) {
            this.pop_events = pop_events;
        }

        public void setPop_recipe_picurl(String pop_recipe_picurl) {
            this.pop_recipe_picurl = pop_recipe_picurl;
        }

        public void setNavs(List<NavsEntity> navs) {
            this.navs = navs;
        }

        public PopEventsEntity getPop_events() {
            return pop_events;
        }

        public String getPop_recipe_picurl() {
            return pop_recipe_picurl;
        }

        public List<NavsEntity> getNavs() {
            return navs;
        }

        public static class PopEventsEntity {
            private int count;

            private List<EventsEntity> events;

            public void setCount(int count) {
                this.count = count;
            }

            public void setEvents(List<EventsEntity> events) {
                this.events = events;
            }

            public int getCount() {
                return count;
            }

            public List<EventsEntity> getEvents() {
                return events;
            }

            public static class EventsEntity {
                private int n_dishes;
                private Customization   customization;
                private String id;
                private DishesEntity dishes;
                private String name;

                public Customization getCustomization() {
                    return customization;
                }

                public void setCustomization(Customization customization) {
                    this.customization = customization;
                }

                public void setN_dishes(int n_dishes) {
                    this.n_dishes = n_dishes;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public void setDishes(DishesEntity dishes) {
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

                public DishesEntity getDishes() {
                    return dishes;
                }

                public String getName() {
                    return name;
                }

                public static class Customization{

                }

                public static class DishesEntity {


                    private List<SecondDishesEntity> dishes;

                    public void setDishes(List<SecondDishesEntity> dishes) {
                        this.dishes = dishes;
                    }

                    public List<SecondDishesEntity> getDishes() {
                        return dishes;
                    }

                    public static class SecondDishesEntity {
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

        public static class NavsEntity {
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

package com.hsl_mwt.kitchen.bean.kitchen;

import java.io.Serializable;

/**
 * Created by Angel on 2016/2/22.
 */
public class KitchenRed implements Serializable {

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
        private String start_time;
        private int ad_type;
        private String expose_tracking_url;
        private String end_time;
        private String click_tracking_url;

        private AdInfoEntity ad_info;

        public void setStart_time(String start_time) {
            this.start_time = start_time;
        }

        public void setAd_type(int ad_type) {
            this.ad_type = ad_type;
        }

        public void setExpose_tracking_url(String expose_tracking_url) {
            this.expose_tracking_url = expose_tracking_url;
        }

        public void setEnd_time(String end_time) {
            this.end_time = end_time;
        }

        public void setClick_tracking_url(String click_tracking_url) {
            this.click_tracking_url = click_tracking_url;
        }

        public void setAd_info(AdInfoEntity ad_info) {
            this.ad_info = ad_info;
        }

        public String getStart_time() {
            return start_time;
        }

        public int getAd_type() {
            return ad_type;
        }

        public String getExpose_tracking_url() {
            return expose_tracking_url;
        }

        public String getEnd_time() {
            return end_time;
        }

        public String getClick_tracking_url() {
            return click_tracking_url;
        }

        public AdInfoEntity getAd_info() {
            return ad_info;
        }

        public static class AdInfoEntity {
            private String url;
            private ImageEntity image;
            private String pic_url;

            public void setUrl(String url) {
                this.url = url;
            }

            public void setImage(ImageEntity image) {
                this.image = image;
            }

            public void setPic_url(String pic_url) {
                this.pic_url = pic_url;
            }

            public String getUrl() {
                return url;
            }

            public ImageEntity getImage() {
                return image;
            }

            public String getPic_url() {
                return pic_url;
            }

            public static class ImageEntity {
                private String url;
                private int width;
                private int height;

                public void setUrl(String url) {
                    this.url = url;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUrl() {
                    return url;
                }

                public int getWidth() {
                    return width;
                }

                public int getHeight() {
                    return height;
                }
            }
        }
    }
}

package com.hsl_mwt.kitchen.bean.kitchen;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Angel on 2016/2/23.
 */
public class KitchenWelcomeId implements Serializable {

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

        private int count;

        private int total;

        private List<RecipesEntity> recipes;

        public void setCount(int count) {
            this.count = count;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public void setRecipes(List<RecipesEntity> recipes) {
            this.recipes = recipes;
        }

        public int getCount() {
            return count;
        }

        public int getTotal() {
            return total;
        }

        public List<RecipesEntity> getRecipes() {
            return recipes;
        }

        public static class RecipesEntity {

            private String reason;

            private String recipe_id;

            public void setReason(String reason) {
                this.reason = reason;
            }

            public void setRecipe_id(String recipe_id) {
                this.recipe_id = recipe_id;
            }

            public String getReason() {
                return reason;
            }

            public String getRecipe_id() {
                return recipe_id;
            }
        }
    }
}

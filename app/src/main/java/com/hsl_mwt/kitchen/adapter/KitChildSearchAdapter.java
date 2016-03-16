package com.hsl_mwt.kitchen.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.hsl_mwt.kitchen.R;
import com.hsl_mwt.kitchen.base.KitchenBaseAdapter;
import com.hsl_mwt.kitchen.bean.kitchen.KitchenChildSearch;

import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.List;

/**
 * Created by Angel on 2016/2/25.
 */
public class KitChildSearchAdapter extends KitchenBaseAdapter {

    private List<KitchenChildSearch.SearchContent.Content> mContentList;

    public KitChildSearchAdapter(Context context, List<KitchenChildSearch.SearchContent.Content> list) {
        super(context, list);
        this.mContentList = list;
    }

    @Override
    public View getItemView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_listview_search, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        KitchenChildSearch.SearchContent.Content.IntContent.ContentObject contentObject = mContentList.get(position).getContent().getObject();
        if (contentObject != null) {
            x.image().bind(viewHolder.mPhotoImg, contentObject.getPhoto().split("\\?")[0]);
            viewHolder.mNameTxt.setText(contentObject.getName());
            List<KitchenChildSearch.SearchContent.Content.IntContent.ContentObject.Ingredient> ingredientList = contentObject.getIngredient();
            if (ingredientList != null && ingredientList.size() > 0) {
                String ingredient = null;
                for (int i = 0, size = ingredientList.size(); i < size; i++) {
                    ingredient += ingredientList.get(i).getName() + " ";
                }
                viewHolder.mIngredientTxt.setText(ingredient);
            }
            viewHolder.mAuthorNameTxt.setText(contentObject.getAuthor().getName());
            viewHolder.mScoretTxt.setText(contentObject.getScore()+"分");
            viewHolder.mDishesTxt.setText(contentObject.getStats().getN_dishes()+"人做过");
        }
        return convertView;
    }

    /**
     *
     */
    private class ViewHolder {

        @ViewInject(R.id.photo_item_listview_serch)
        public ImageView mPhotoImg;

        @ViewInject(R.id.name_item_listview_serch)
        public TextView mNameTxt;

        @ViewInject(R.id.ingredient_item_listview_serch)
        public TextView mIngredientTxt;

        @ViewInject(R.id.authorname_item_listview_serch)
        public TextView mAuthorNameTxt;

        @ViewInject(R.id.score_item_listview_serch)
        public TextView mScoretTxt;

        @ViewInject(R.id.dishes_item_listview_serch)
        public TextView mDishesTxt;

        public ViewHolder(View view) {
            x.view().inject(this, view);
        }
    }
}

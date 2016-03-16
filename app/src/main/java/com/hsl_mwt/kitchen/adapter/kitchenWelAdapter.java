package com.hsl_mwt.kitchen.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.hsl_mwt.kitchen.R;
import com.hsl_mwt.kitchen.base.KitchenBaseAdapter;
import com.hsl_mwt.kitchen.bean.kitchen.KitchenWelcomeList;

import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.List;

/**
 * Created by Angel on 2016/2/23.
 */
public class kitchenWelAdapter extends KitchenBaseAdapter {

    private List<KitchenWelcomeList.KitchenItemContent.KitchenItemRecipes> recipesList;

    public kitchenWelAdapter(Context context, List<KitchenWelcomeList.KitchenItemContent.KitchenItemRecipes> list) {
        super(context, list);
        this.recipesList = list;
    }

    @Override
    public View getItemView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_listview_kitchenwel, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        KitchenWelcomeList.KitchenItemContent.KitchenItemRecipes recipes = recipesList.get(position);

        if (recipes != null) {
            x.image().bind(viewHolder.mIconImg, recipes.getPhoto());
            x.image().bind(viewHolder.mAuthorImg, recipes.getAuthor().getPhoto());
            viewHolder.mAuthorNameTxt.setText(recipes.getAuthor().getName());
            //设置大标题
            viewHolder.mTitleTxt.setText(recipes.getName());
            String score = recipes.getScore();

            if (TextUtils.isEmpty(score)) {
                viewHolder.mDescTxt.setText(recipes.getStats().getN_cooked() + "人做过");
            } else {
                viewHolder.mDescTxt.setText(score + "分" + "." + recipes.getStats().getN_cooked() + "人做过");
            }
        }
        return convertView;
    }

    private class ViewHolder {

        @ViewInject(R.id.image_item_listview_kitchenwel)
        public ImageView mIconImg;

        @ViewInject(R.id.photo_item_listview_kitchenwel)
        public ImageView mAuthorImg;

        @ViewInject(R.id.name_item_listview_kitchenwel)
        public TextView mAuthorNameTxt;

        @ViewInject(R.id.title_item_listview_kitchenwel)
        public TextView mTitleTxt;

        @ViewInject(R.id.desc_item_listview_kitchenwel)
        public TextView mDescTxt;

        public ViewHolder(View view) {
            x.view().inject(this, view);
        }
    }
}

package com.hsl_mwt.kitchen.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.hsl_mwt.kitchen.R;
import com.hsl_mwt.kitchen.bean.kitchen.KitchenListAuthor;
import com.hsl_mwt.kitchen.bean.kitchen.KitchenListContents;
import com.hsl_mwt.kitchen.bean.kitchen.KitchenListImage;
import com.hsl_mwt.kitchen.bean.kitchen.KitchenListItems;
import com.hsl_mwt.kitchen.utils.HttpUtils;

import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.List;

/**
 * Created by Angel on 2016/2/25.
 */
public class KitchenExpandAdapter extends BaseExpandableListAdapter {


    private List<String> mNameList;

    private List<List<KitchenListItems>> mItemsList;

    private Context mContext;

    public KitchenExpandAdapter(List<String> mNameList, List<List<KitchenListItems>> mItemsList, Context mContext) {
        this.mItemsList = mItemsList;
        this.mNameList = mNameList;
        this.mContext = mContext;
    }

    @Override
    public int getGroupCount() {
        return mNameList != null ? mNameList.size() : 0;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return mItemsList != null ? mItemsList.get(groupPosition).size() : 0;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return mNameList.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return mItemsList.get(groupPosition).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        ViewHolderParent viewHolder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.parent_kitchen_listview, parent, false);
            viewHolder = new ViewHolderParent(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolderParent) convertView.getTag();
        }
        viewHolder.mSecondTitleTxt.setText(mNameList.get(groupPosition));
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_listview_kitchen, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        KitchenListItems kitchenListItems = mItemsList.get(groupPosition).get(childPosition);

        if (kitchenListItems != null) {
            KitchenListContents contents = kitchenListItems.getContents();
            if (contents != null) {
                //设置大图片
                KitchenListImage image = contents.getImage();
                if (image != null) {
                    ImageView iconImg = viewHolder.mIconImg;
                    ViewGroup.LayoutParams layoutParams = iconImg.getLayoutParams();
                    layoutParams.height = Integer.parseInt(image.getHeight());
                    iconImg.setLayoutParams(layoutParams);

                    x.image().bind(iconImg, (contents.getImage().getUrl().split("\\?"))[0]);
                }
            }
            //标题1  标题2
            String title_1st = contents.getTitle_1st();
            String title_2nd = contents.getTitle_2nd();
            if (!TextUtils.isEmpty(title_1st) && !TextUtils.isEmpty(title_2nd)) {
                viewHolder.mFirstTitleTxt.setVisibility(View.VISIBLE);
                viewHolder.mSecondTitleTxt.setVisibility(View.VISIBLE);
                viewHolder.mFirstTitleTxt.setText(title_1st);
                viewHolder.mSecondTitleTxt.setText(title_2nd);
            } else {
                viewHolder.mFirstTitleTxt.setVisibility(View.GONE);
                viewHolder.mSecondTitleTxt.setVisibility(View.GONE);
            }

            //作者
            KitchenListAuthor author = contents.getAuthor();

            if (author != null) {
                viewHolder.mAuthorImg.setVisibility(View.VISIBLE);
                viewHolder.mAuthorNameTxt.setVisibility(View.VISIBLE);
                HttpUtils.getImage(viewHolder.mAuthorImg, (author.getPhoto().split("\\?"))[0]);
                viewHolder.mAuthorNameTxt.setText(author.getName());
            } else {
                viewHolder.mAuthorImg.setVisibility(View.GONE);
                viewHolder.mAuthorNameTxt.setVisibility(View.GONE);
            }

            //图片下文字
            String title = contents.getTitle();
            String score = contents.getScore();
            String n_cooked = contents.getN_cooked();
            if (TextUtils.isEmpty(title)) {
                viewHolder.mTitleTxt.setVisibility(View.GONE);
                viewHolder.mDescTxt.setVisibility(View.GONE);
            } else if (TextUtils.isEmpty(score) || TextUtils.isEmpty(n_cooked)) {
                viewHolder.mTitleTxt.setVisibility(View.VISIBLE);
                viewHolder.mDescTxt.setVisibility(View.VISIBLE);
                viewHolder.mTitleTxt.setText(contents.getTitle());
                viewHolder.mDescTxt.setText(contents.getDesc());
            }
            if (!TextUtils.isEmpty(score) || !TextUtils.isEmpty(n_cooked)) {
                viewHolder.mScoreCookTxt.setVisibility(View.VISIBLE);
                viewHolder.mScoreCookTxt.setText(score + " " + n_cooked + "人做过");
            } else {
                viewHolder.mScoreCookTxt.setVisibility(View.GONE);
            }
        }
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }

    private static class ViewHolder {

        @ViewInject(R.id.image_item_listview_kitchen)
        public ImageView mIconImg;

        @ViewInject(R.id.title_1st_item_listview_kitchen)
        public TextView mFirstTitleTxt;

        @ViewInject(R.id.title_2nd_item_listview_kitchen)
        public TextView mSecondTitleTxt;

        @ViewInject(R.id.photo_item_listview_kitchen)
        public ImageView mAuthorImg;

        @ViewInject(R.id.name_item_listview_kitchen)
        public TextView mAuthorNameTxt;

        @ViewInject(R.id.title_item_listview_kitchen)
        public TextView mTitleTxt;

        @ViewInject(R.id.desc_item_listview_kitchen)
        public TextView mDescTxt;

        @ViewInject(R.id.scorecooked_item_listview_kitchen)
        public TextView mScoreCookTxt;

        public ViewHolder(View view) {
            x.view().inject(this, view);
        }
    }

    private class ViewHolderParent{
        @ViewInject(R.id.title_parent_kitchen_listview)
        public TextView mSecondTitleTxt;

        public ViewHolderParent(View view){
            x.view().inject(this, view);
        }
    }
}

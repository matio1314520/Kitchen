package com.hsl_mwt.kitchen.adapter;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.hsl_mwt.kitchen.R;
import com.hsl_mwt.kitchen.base.KitchenBaseAdapter;
import com.hsl_mwt.kitchen.bean.kitchen.KitchenBudegt;
import com.hsl_mwt.kitchen.utils.HttpUtils;
import com.hsl_mwt.kitchen.utils.ViewPagerUtils;

import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Angel on 2016/2/23.
 */
public class KitchenBuyAdapter extends KitchenBaseAdapter {

    private static final String IMAGE_URL_SPLIT = "\\?";

    private List<KitchenBudegt.ContentEntity.ReviewsEntity> mReviewList;

    private Context mContext;

    private List<View> mViewList = new ArrayList<>();

    public KitchenBuyAdapter(Context context, List<KitchenBudegt.ContentEntity.ReviewsEntity> list) {
        super(context, list);
        this.mReviewList = list;
        this.mContext = context;
    }

    @Override
    public View getItemView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_listview_kitchenbuy, null);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        KitchenBudegt.ContentEntity.ReviewsEntity reviews = mReviewList.get(position);

        if (reviews != null) {
            int size = reviews.getAdditional_review_photos().size();
            if (size == 0) {
                List<KitchenBudegt.ContentEntity.ReviewsEntity.PhotosEntity> photos = reviews.getPhotos();
                if (photos != null && photos.size() > 0) {
                    for (int i = 0; i < photos.size(); i++) {
                        ImageView imageView = new ImageView(mContext);
                        x.image().bind(imageView, (photos.get(i).getUrl().split(IMAGE_URL_SPLIT))[0]);
                        mViewList.add(imageView);
                    }
                }
            } else {
                for (int i = 0; i < size; i++) {
                    ImageView imageView = new ImageView(mContext);
                    x.image().bind(imageView, reviews.getAdditional_review_photos().get(i).getUrl().split(IMAGE_URL_SPLIT)[0]);
                    mViewList.add(imageView);
                }
            }
            ViewPagerUtils.setAdapter(viewHolder.mIconVp, mViewList);

            HttpUtils.getImage(viewHolder.mIconImg, (reviews.getAuthor().getPhoto().split(IMAGE_URL_SPLIT))[0]);

            viewHolder.mAuthorNameTxt.setText(reviews.getAuthor().getName());

            viewHolder.mScoreRat.setRating(Float.parseFloat("" + reviews.getRate()));
            //设置大标题
            viewHolder.mGoodsNameTxt.setText(reviews.getCommodity().getGoods().getName());

            viewHolder.mReviewTxt.setText(reviews.getReview());
            List<KitchenBudegt.ContentEntity.ReviewsEntity.DiggUsersEntity.UsersEntity> users = reviews.getDigg_users().getUsers();
            if (users != null) {
                viewHolder.mSupportTxt.setText(reviews.getDigg_users().getCount() + "人赞");
            }
        }
        return convertView;
    }

    private class ViewHolder {

        @ViewInject(R.id.viewpager_item_listview_kitchenbuy)
        public ViewPager mIconVp;

        @ViewInject(R.id.icon_item_listview_kitchenbuy)
        public ImageView mIconImg;

        @ViewInject(R.id.name_item_listview_kitchenbuy)
        public TextView mAuthorNameTxt;

        @ViewInject(R.id.score_item_listview_kitchenbuy)
        public RatingBar mScoreRat;

        @ViewInject(R.id.goodsname_item_listview_kitchenbuy)
        public TextView mGoodsNameTxt;

        @ViewInject(R.id.review_item_listview_kitchenbuy)
        public TextView mReviewTxt;

        @ViewInject(R.id.support_item_listview_kitchenbuy)
        public TextView mSupportTxt;

        public ViewHolder(View view) {
            x.view().inject(this, view);
        }
    }
}

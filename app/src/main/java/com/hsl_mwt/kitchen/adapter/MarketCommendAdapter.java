package com.hsl_mwt.kitchen.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.hsl_mwt.kitchen.R;
import com.hsl_mwt.kitchen.bean.market.MarketRecommend;

import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.List;

/**
 * Created by Angel on 2016/2/25.
 */
public class MarketCommendAdapter extends RecyclerView.Adapter<MarketCommendAdapter.ViewHolder> {

    private List<MarketRecommend.ContentEntity> mContentList;

    public MarketCommendAdapter(List<MarketRecommend.ContentEntity> mContentList) {
        this.mContentList = mContentList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recyclerview_marketrecomend, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        MarketRecommend.ContentEntity content = mContentList.get(position);
        if (content != null) {
            x.image().bind(holder.mPicurlImg, content.getPicurl().split("\\?")[0]);
            holder.mNameTxt.setText(content.getName());
            holder.mPriceTxt.setText(content.getPrice());
            holder.mPromoTxt.setText(content.getPromo_text());
        }
    }

    @Override
    public int getItemCount() {
        return mContentList != null ? mContentList.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @ViewInject(R.id.picurl_item_recyclerview_recommend)
        public ImageView mPicurlImg;

        @ViewInject(R.id.name_item_recyclerview_recommend)
        public TextView mNameTxt;

        @ViewInject(R.id.price_item_recyclerview_recommend)
        public TextView mPriceTxt;

        @ViewInject(R.id.promotext_item_recyclerview_recommend)
        public TextView mPromoTxt;

        public ViewHolder(View itemView) {
            super(itemView);
            x.view().inject(this, itemView);
        }
    }
}

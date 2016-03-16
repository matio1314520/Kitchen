package com.hsl_mwt.kitchen.adapter;

import android.content.Context;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.hsl_mwt.kitchen.R;
import com.hsl_mwt.kitchen.base.KitchenBaseAdapter;
import com.hsl_mwt.kitchen.bean.community.ItemBean;
import com.hsl_mwt.kitchen.bean.community.LatestAuthorsEntity;

import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.List;

/**
 * Created by clearlove on 2016/2/24.
 */
public class CommunityAdapter extends KitchenBaseAdapter {

    List<ItemBean> list;
    public CommunityAdapter(Context context, List list) {
        super(context, list);
        this.list = list;
    }

    @Override
    public View getItemView(int position, View convertView, ViewGroup parent) {

        ContentViewHolder viewHolder = null;
        if (convertView == null){

            convertView = inflater.inflate(R.layout.fragment_community_adapter,parent,false);
            viewHolder = new ContentViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ContentViewHolder) convertView.getTag();
        }

        ItemBean itemBean = list.get(position);
        viewHolder.tv_name.setText(itemBean.getName());
        viewHolder.tv_desc.setText(itemBean.getDesc());
        List<LatestAuthorsEntity> latestAuthores = itemBean.getLatestAuthores();
        x.image().bind(viewHolder.iv_photo1, latestAuthores.get(0).getPhoto60());
        x.image().bind(viewHolder.iv_photo2,latestAuthores.get(1).getPhoto60());
        x.image().bind(viewHolder.iv_photo3,latestAuthores.get(2).getPhoto60());
        x.image().bind(viewHolder.iv_photo4,latestAuthores.get(3).getPhoto60());

        return convertView;
    }

    private static class ContentViewHolder{

        @ViewInject(R.id.tv_fragment_community_title)
        TextView tv_name;
        @ViewInject(R.id.tv_fragment_community_content)
        TextView tv_desc;
        @ViewInject(R.id.fragment_community_image1)
        ImageView iv_photo1;
        @ViewInject(R.id.fragment_community_image2)
        ImageView iv_photo2;
        @ViewInject(R.id.fragment_community_image3)
        ImageView iv_photo3;
        @ViewInject(R.id.fragment_community_image4)
        ImageView iv_photo4;
        public ContentViewHolder(View view){

            x.view().inject(this,view);
        }
    }

}

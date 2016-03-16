package com.hsl_mwt.kitchen.adapter;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import com.hsl_mwt.kitchen.R;
import com.hsl_mwt.kitchen.base.KitchenBaseAdapter;
import com.hsl_mwt.kitchen.bean.market.ChooseType;
import com.hsl_mwt.kitchen.bean.market.ItemType;
import com.hsl_mwt.kitchen.bean.market.OnSaleEntity;

import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.List;

/**
 * Created by clearlove on 2016/2/22.
 */
public class MarketAdapter extends KitchenBaseAdapter<ItemType> {

    private List<ItemType> goodsList;
    private ItemType itemType = null;
    //item类型的总数
    private static final int TYPE_COUNT = 2;
    //选项类型
    private static final int TYPE_CHOOSE = 0;
    //详情类型
    private static final int TYPE_CONTENT = 1;
    //当前item类型
    private int currentType;

    public MarketAdapter(Context context, List<ItemType> list) {
        super(context, list);
        goodsList = list;
    }

    @Override
    public View getItemView(int position, View convertView, ViewGroup parent) {

        DetilsViewHolder viewHolder = null;
        ChooseViewHolder chooseHolder = null;
        itemType = goodsList.get(position);

        if (convertView == null) {
            switch (getItemViewType(position)) {
                case TYPE_CHOOSE:
                    convertView = inflater.inflate(R.layout.fragment_market_adapter2, parent, false);
                    chooseHolder = new ChooseViewHolder(convertView);
                    convertView.setTag(chooseHolder);
                    break;
                case TYPE_CONTENT:
                    convertView = inflater.inflate(R.layout.fragment_market_adapter, parent, false);
                    viewHolder = new DetilsViewHolder(convertView);
                    convertView.setTag(viewHolder);
                    break;
            }

        } else {
            switch (getItemViewType(position)) {
                case TYPE_CHOOSE:
                    chooseHolder = (ChooseViewHolder) convertView.getTag();
                    break;
                case TYPE_CONTENT:
                    viewHolder = (DetilsViewHolder) convertView.getTag();
                    break;
            }
        }
        switch (getItemViewType(position)) {
            case TYPE_CHOOSE:
                //获取ChooseType对象
                ChooseType chooseType = (ChooseType) itemType;
                List<ChooseType.PartsEntity> parts = chooseType.getParts();
                chooseHolder.bt_card_title.setText(chooseType.getTitle());
                chooseHolder.bt_card_content1.setText(parts.get(0).getName());
                chooseHolder.bt_card_content2.setText(parts.get(1).getName());
                chooseHolder.bt_card_content3.setText(parts.get(2).getName());
                chooseHolder.bt_card_content4.setText(parts.get(3).getName());
                chooseHolder.bt_card_content5.setText(parts.get(4).getName());
                chooseHolder.bt_card_content6.setText(parts.get(5).getName());
                chooseHolder.bt_card_content7.setText(parts.get(6).getName());
                chooseHolder.bt_card_content8.setText(parts.get(7).getName());
                break;
            case TYPE_CONTENT:

                //获取OnSaleEntity对象
                OnSaleEntity saleEntity = (OnSaleEntity) itemType;
                //设置名字
                viewHolder.tv_name.setText(saleEntity.getName());
                //设置出售数量
                viewHolder.tv_total_sales.setText(saleEntity.getTotal_sales_volume() + "");
                //设置是否包邮
                if (saleEntity.getFreight() == 0) {
                    viewHolder.tv_freight.setText("包邮");
                }
                //设置现价
                viewHolder.tv_display_price.setText("¥" + saleEntity.getPrice());
                //设置图片
                x.image().bind(viewHolder.iv_title, saleEntity.getPicurl());
                break;
        }

        return convertView;
    }

    /**
     * 商品详情
     */
    private static class DetilsViewHolder {

        @ViewInject(R.id.iv_fragment_market_image)
        public ImageView iv_title;
        @ViewInject(R.id.tv_fragment_market_name)
        public TextView tv_name;
        @ViewInject(R.id.tv_fragment_market_total_sales)
        public TextView tv_total_sales;
        @ViewInject(R.id.tv_fragment_market_display_freight)
        public TextView tv_freight;
        @ViewInject(R.id.tv_fragment_market_display_price)
        public TextView tv_display_price;


        public DetilsViewHolder(View view) {

            x.view().inject(this, view);
        }

    }

    /**
     * 选择项
     */
    private static class ChooseViewHolder {

        @ViewInject(R.id.market_bt_card_title)
        public Button bt_card_title;
        @ViewInject(R.id.market_bt_card_content1)
        public Button bt_card_content1;
        @ViewInject(R.id.market_bt_card_content2)
        public Button bt_card_content2;
        @ViewInject(R.id.market_bt_card_content3)
        public Button bt_card_content3;
        @ViewInject(R.id.market_bt_card_content4)
        public Button bt_card_content4;
        @ViewInject(R.id.market_bt_card_content5)
        public Button bt_card_content5;
        @ViewInject(R.id.market_bt_card_content6)
        public Button bt_card_content6;
        @ViewInject(R.id.market_bt_card_content7)
        public Button bt_card_content7;
        @ViewInject(R.id.market_bt_card_content8)
        public Button bt_card_content8;


        public ChooseViewHolder(View view) {

            x.view().inject(this, view);
        }

    }

    /**
     * 获取item的布局类型
     * @param position
     * @return
     */
    @Override
    public int getItemViewType(int position) {


        if ("card".equals(goodsList.get(position).getItem_type())) {
            //选项类型
            return TYPE_CHOOSE;
        } else if ("goods".equals(goodsList.get(position).getItem_type())) {
            //详情类型
            return TYPE_CONTENT;
        } else {
            return 0;
        }
    }


    @Override
    public int getViewTypeCount() {
        return TYPE_COUNT;
    }
}

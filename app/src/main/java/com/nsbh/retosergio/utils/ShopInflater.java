package com.nsbh.retosergio.utils;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.nsbh.retosergio.R;
import com.nsbh.retosergio.models.ShopItem;

public class ShopInflater {
    public static View inflateItem(LayoutInflater inflater, ViewGroup root, ShopItem item) {
        View shopItem = inflater.inflate(R.layout.item_producto, root, false);

        TextView itemName = shopItem.findViewById(R.id.text_title);
        itemName.setText(item.getItemName());

        TextView itemPrice = shopItem.findViewById(R.id.text_price);
        itemPrice.setText(String.valueOf(item.getItemPrice()));

        ImageView itemPreview = shopItem.findViewById(R.id.cover_image);
        itemPreview.setImageResource(item.getImageResourceId());

        return shopItem;
    }
}

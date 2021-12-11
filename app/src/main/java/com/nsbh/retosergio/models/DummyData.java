package com.nsbh.retosergio.models;

import com.nsbh.retosergio.R;

import java.util.ArrayList;
import java.util.List;

public class DummyData {
    public static List<ShopItem> getDummyShopItems() {
        List<ShopItem> shopItemList = new ArrayList<>();
        shopItemList.add(new ShopItem("Medias Nike", 7000.00F, R.drawable.ic_medias));
        shopItemList.add(new ShopItem("Esfero Bic", 500.00F, R.drawable.ic_pen));
        return shopItemList;
    }
}

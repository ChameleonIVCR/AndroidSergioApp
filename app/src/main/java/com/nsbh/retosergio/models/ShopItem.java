package com.nsbh.retosergio.models;

public class ShopItem {
    private String itemName;
    private float itemPrice;
    private int imageResourceId;

    public ShopItem(String itemName, float itemPrice, int imageResourceId) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.imageResourceId = imageResourceId;
    }

    public ShopItem() {
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public float getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(float itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }
}

package server.models;

import java.util.ArrayList;

/**
 * Created by Felix on 17-10-2017
 */

public class Item {
    private int itemId;
    private String itemName;
    private String itemDescription;
    private int itemPrice;
    private int itemType;

    public Item() {
    }

    public Item(int itemId, String itemName, String itemDescription, int itemPrice, int itemType) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
        this.itemType = itemType;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemType(){ return itemType;}

    public void setItemType(int itemType){ this.itemType = itemType;}
}
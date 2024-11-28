package com.neoteric.java.restuarentdetails;

public class Menu {

    private String itemName;
    private double price;

    @Override
    public String toString() {
        return "Menu{" +
                "itemName='" + itemName + '\'' +
                ", price=" + price +
                '}';
    }

    public Menu(String itemName, double price){
        this.itemName = itemName;
        this.price = price;

    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }
}

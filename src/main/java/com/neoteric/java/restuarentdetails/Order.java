package com.neoteric.java.restuarentdetails;

import java.time.LocalDate;

public class Order {

    private LocalDate date;
    private Menu menuItem;
    private int quantity;

    public Order(LocalDate date, Menu menuItem, int quantity) {
        this.date = date;
        this.menuItem = menuItem;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "date=" + date +
                ", menuItem=" + menuItem +
                ", quantity=" + quantity +
                '}';
    }

    public LocalDate getDate() {
        return date;
    }

    public Menu getMenuItem() {
        return menuItem;
    }

    public int getQuantity() {
        return quantity;
    }
}

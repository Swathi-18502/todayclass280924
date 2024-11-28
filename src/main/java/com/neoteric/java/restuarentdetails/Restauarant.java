package com.neoteric.java.restuarentdetails;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Restauarant {


    private String name;
    private List<Menu> menuItems;
    private List<Order> orders;

    public  Restauarant(String name) {
        this.name = name;
        this.menuItems = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public void addMenuItem(String itemName, double price) {
        menuItems.add(new Menu(itemName, price));
    }

    public void addOrder(LocalDate date, String itemName, int quantity) {
        Menu menuItem = menuItems.stream()
                .filter(item -> item.getItemName().equalsIgnoreCase(itemName))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Menu item not found: " + itemName));

        orders.add(new Order(date, menuItem, quantity));
    }

    public void printMenu() {
        System.out.println("Menu:");
        menuItems.forEach(System.out::println);
    }

    public String getTopSellingItem() {
        return orders.stream()
                .collect(Collectors.groupingBy(order -> order.getMenuItem().getItemName(),
                        Collectors.summingInt(Order::getQuantity)))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("No orders yet");
    }

    public DayOfWeek getDayWithMostOrders() {
        return orders.stream()
                .collect(Collectors.groupingBy(order -> order.getDate().getDayOfWeek(),
                        Collectors.summingInt(Order::getQuantity)))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }

    public void printOrders() {
        System.out.println("Orders:");
        orders.forEach(System.out::println);
    }
}



package com.neoteric.java.restuarentdetails;

import java.time.LocalDate;

public class RestaurantOrderTest {

    public static void main(String[] args) {
        Restauarant restaurant = new Restauarant("pista");

        restaurant.addMenuItem("chicken biryani", 150);
        restaurant.addMenuItem("mutton biryani", 300);
        restaurant.addMenuItem("fish biryani", 250);
        restaurant.addMenuItem("france biryani",450);

        restaurant.printMenu();

        restaurant.addOrder(LocalDate.of(2024, 11, 27), "chicken biryani", 5);
        restaurant.addOrder(LocalDate.of(2024, 11, 27), "mutton biryani", 3);
        restaurant.addOrder(LocalDate.of(2024, 11, 26), "chicken biryani", 7);
        restaurant.addOrder(LocalDate.of(2024, 11, 26), "fish biryani", 4);
        restaurant.addOrder(LocalDate.of(2024, 11, 28), "france biryani", 6);

        restaurant.printOrders();

        System.out.println("Top-Selling Item: " + restaurant.getTopSellingItem());
        System.out.println("Getting More Orders In A Day : " + restaurant.getDayWithMostOrders());
    }
}

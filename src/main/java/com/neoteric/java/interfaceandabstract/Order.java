package com.neoteric.java.interfaceandabstract;

public interface Order {

    void placeOrder(String itemName,int quantity,Double amt);
    void updatedOrder(String productId,Long price,int quantity);
}

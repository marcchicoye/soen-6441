package org.example.model;

import org.example.orders.Order;

import java.util.List;

public class Player {
    List<Country> ownContries;
    String name;
    List<Order> orders;


    public void issue_orders() {
        //TODO
    }

    public Order next_order() {
        if (orders.isEmpty()) {
            return null;
        }
        Order order = orders.get(0);
        orders.remove(order);
        return order;
    }

}

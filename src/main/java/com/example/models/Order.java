package com.example.models;

import java.time.LocalDate;
import java.util.Map;

public class Order {
    private LocalDate orderDate;
    private User user;
    private Map<Tour, Integer> orderDetails;

    public Order() {
    }

    public Order(final LocalDate orderDate, final User user, final Map<Tour, Integer> orderDetails) {
        this.orderDate = orderDate;
        this.user = user;
        this.orderDetails = orderDetails;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(final LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(final User user) {
        this.user = user;
    }

    public Map<Tour, Integer> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(final Map<Tour, Integer> orderDetails) {
        this.orderDetails = orderDetails;
    }
}

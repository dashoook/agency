package com.example.models;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Order {
    private Long id;
    private LocalDate orderDate;
    private User user;
    private boolean wasPaid = false;
    private Map<Tour, Integer> orderDetails = new HashMap<>();

    public Order() {
    }

    public Order(final Long id, final LocalDate orderDate, final User user, final boolean wasPaid, final Map<Tour,
            Integer> orderDetails) {
        this.id = id;
        this.orderDate = orderDate;
        this.user = user;
        this.wasPaid = wasPaid;
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

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public boolean isWasPaid() {
        return wasPaid;
    }

    public void setWasPaid(final boolean wasPaid) {
        this.wasPaid = wasPaid;
    }
}

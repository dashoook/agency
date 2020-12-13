package com.example.models;

import java.time.LocalDate;
import java.util.List;

public class User {
    private Long id;
    private String firstname;
    private String lastname;
    private LocalDate birth;

    private List<Order> orders;

    public User() {
    }

    public User(final Long id,final String firstname, final String lastname, final LocalDate birth, final List<Order> orders) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birth = birth;
        this.orders = orders;
    }
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(final String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(final String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(final LocalDate birth) {
        this.birth = birth;
    }
    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(final List<Order> orders) {
        this.orders = orders;
    }

}

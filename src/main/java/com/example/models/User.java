package com.example.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User {
    private Long id;
    private String username;
    private String firstname;
    private String lastname;
    private LocalDate birth;
    private String password;

    private Set<Role> roles = new HashSet<>();

    private List<Order> orders  = new ArrayList<>();

    public User() {
    }

    public User(final Long id,final String username, final String firstname, final String lastname, final LocalDate birth,
                final List<Order> orders,final String password) {
        this.id = id;
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birth = birth;
        this.orders = orders;
        this.password = password;
    }
    public User(final Long id,final String username, final String firstname, final String lastname, final LocalDate birth,
                final List<Order> orders,final String password, final Set<Role> roles) {
        this.id = id;
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birth = birth;
        this.orders = orders;
        this.password = password;
        this.roles = roles;
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

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(final Set<Role> roles) {
        this.roles = roles;
    }
}

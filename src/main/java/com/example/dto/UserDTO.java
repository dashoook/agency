package com.example.dto;

import com.example.models.ERole;
import com.example.models.Order;
import com.example.models.Role;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserDTO {
    private Long id;
    private String username;
    private String firstname;
    private String lastname;
    private LocalDate birth;
    private String password;

    private Set<Role> role = new HashSet<>();

    private List<Order> orders;
//tour add
    public UserDTO() {
    }
    public UserDTO(final Long id,final String username, final String firstname, final String lastname, final LocalDate birth,
                   final String password) {
        this.id = id;
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birth = birth;
        this.password = password;
    }
    public UserDTO(final Long id,final String username, final String firstname, final String lastname, final LocalDate birth,
                   final List<Order> orders,final String password) {
        this.id = id;
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birth = birth;
        this.orders = orders;
        this.password = password;
    }

    public UserDTO(final Long id, final String username, final String firstname, final String lastname,
                   final LocalDate birth, final String password, final Set<Role> role) {
        this.id = id;
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birth = birth;
        this.password = password;
        this.role = role;
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

    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return role;
    }

    public void setRoles(Set<Role> roles) {
        this.role = roles;
    }

}

package com.example.request;

import com.example.models.Order;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public class SignupRequest {
    private String username;
    private Long id;
    private String firstname;
    private String lastname;
    private LocalDate birth;
    private Set<String> role;

    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<String> getRole() {
        return this.role;
    }

    public void setRole(Set<String> role) {
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }
}

package com.example.models;

import java.time.LocalDate;

public class User {
    private String firstname;
    private String lastname;
    private LocalDate birth;

    public User() {
    }

    public User(final String firstname, final String lastname, final LocalDate birth) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birth = birth;
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

}

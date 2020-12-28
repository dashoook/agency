package com.example.models;


public class Role {
    private Long id;

    private ERole name;

    public Role() {
    }

    public Role(final ERole name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public ERole getName() {
        return name;
    }

    public void setName(final ERole name) {
        this.name = name;
    }

}

package com.example.models;


public class Role {
    private Long id;

 //   @Enumerated(EnumType.STRING)
    private ERole name;

    public Role() {

    }

    public Role(ERole name) {

        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ERole getName() {
        return name;
    }

    public void setName(ERole name) {
        this.name = name;
    }
}
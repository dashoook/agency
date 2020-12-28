package com.example.dto;


public class RoleDTO {
    private Long id;

    private ERoleDTO name;

    public RoleDTO() {
    }

    public RoleDTO(final ERoleDTO name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public ERoleDTO getName() {
        return name;
    }

    public void setName(final ERoleDTO name) {
        this.name = name;
    }

}

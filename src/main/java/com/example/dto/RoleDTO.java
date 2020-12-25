package com.example.dto;

import com.example.models.ERole;

public class RoleDTO {
    private Long id;

//    @Enumerated(EnumType.STRING)
    private ERoleDTO name;

    public RoleDTO() {
    }

    public RoleDTO(ERoleDTO name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ERoleDTO getName() {
        return name;
    }

    public void setName(ERoleDTO name) {
        this.name = name;
    }

}

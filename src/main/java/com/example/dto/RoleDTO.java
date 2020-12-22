package com.example.dto;

import com.example.models.ERole;

public class RoleDTO {
    private Long id;

    //   @Enumerated(EnumType.STRING)
    private ERole name;

    public RoleDTO() {
    }

    public RoleDTO(ERole name) {
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

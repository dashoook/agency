package com.example.mapper;

import com.example.dto.RoleDTO;
import com.example.models.Role;
import org.springframework.stereotype.Component;


@Component
public class RoleToRoleDTOMapper {
    public Role toEntity(final RoleDTO roleDTO){
        final Role role = new Role();

        role.setId(roleDTO.getId());
       // role.setName(roleDTO.getName());


        return role;
    }

    public RoleDTO toDto(final Role role){
        final RoleDTO roleDTO = new RoleDTO();

        roleDTO.setId(role.getId());
       // roleDTO.setName(role.getName());

        return roleDTO;
    }
}

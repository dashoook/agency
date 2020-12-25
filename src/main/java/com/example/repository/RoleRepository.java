package com.example.repository;

import com.example.dto.ERoleDTO;
import com.example.exception.ServiceException;
import com.example.models.ERole;
import com.example.models.Role;
import com.example.models.Tour;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class RoleRepository  {
    @PostConstruct
    public void init(){
        savedRoles = new ArrayList<>();
    }

    private static Long lastId = 1L;
    private List<ERole> savedRoles;
    public Role findByName(ERole name){
        ++lastId;
        Role role = new Role(name);
        role.setId(lastId);
        return role;
    }

}
package com.example.repository;

import com.example.models.ERole;
import com.example.models.Role;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class RoleRepository  {
    @PostConstruct
    public void init(){
        savedRoles = new ArrayList<>();
    }

    private static Long lastId = 1L;
    private List<ERole> savedRoles;
    public Role findByName(final ERole name){
        ++lastId;
        final Role role = new Role(name);
        role.setId(lastId);
        return role;
    }

}
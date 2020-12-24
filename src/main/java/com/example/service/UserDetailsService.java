package com.example.service;

import com.example.dto.UserDTO;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserDetailsService {
    UserDetails loadUserByUsername(String username);
}

package com.example.service.impl;

import com.example.dto.UserDTO;
import com.example.mapper.UserToUserDTOMapper;
import com.example.models.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    UserRepository userRepository;


    @Autowired
    private UserToUserDTOMapper userMapper;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return (UserDetails) userMapper.toDto(userRepository.findByUsername(username));
    }
}

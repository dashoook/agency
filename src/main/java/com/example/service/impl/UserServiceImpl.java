package com.example.service.impl;

import com.example.dto.UserDTO;
import com.example.mapper.UserToUserDTOMapper;
import com.example.models.User;
import com.example.repository.UserRepository;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserToUserDTOMapper userMapper;


    @Override
    public UserDTO getUserById(final Long id) {
        return userMapper.toDto(userRepository.getUserById(id));
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return null;
    }

    @Override
    public UserDTO createUser(final UserDTO userDTO) {
        return null;
    }

    @Override
    public UserDTO updateUser(final UserDTO userDTO) {
        return null;
    }

    @Override
    public void deleteUserById(final Long id) {

    }
}

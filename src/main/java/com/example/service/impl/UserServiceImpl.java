package com.example.service.impl;

import com.example.dto.UserDTO;
import com.example.exception.ServiceException;
import com.example.mapper.UserToUserDTOMapper;
import com.example.models.User;
import com.example.repository.UserRepository;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserToUserDTOMapper userMapper;

    //private Collection<? extends GrantedAuthority> authorities;
  //  public Collection<? extends GrantedAuthority> getAuthorities() {
      //  return authorities;
  //  }

    @Override
    public UserDTO getUserById(final Long id) {
        return userMapper.toDto(userRepository.getUserById(id));
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return userRepository.getAllUsers().stream()
                .map(e -> userMapper.toDto(e))
                .collect(Collectors.toList());
    }

    @Override
    public UserDTO createUser(final UserDTO userDTO) {
        if(userDTO.getId() != null){
            throw new ServiceException(400, "User shouldn't have an id ", null);
        }

        return userMapper.toDto(userRepository.createUser(userMapper.toEntity(userDTO)));
    }

    @Override
    public UserDTO updateUser(final UserDTO userDTO) {

        if(userDTO.getId() == null){
            throw new ServiceException(400, "User shouldn't have an id ", null);
        }

        return userMapper.toDto(userRepository.updateUser(userMapper.toEntity(userDTO)));
    }

    @Override
    public void deleteUserById(final Long id) {
        userRepository.deleteUserById(id);
    }

   // @Override
   // public UserDTO loadUserByUsername(String username) throws UsernameNotFoundException {
     //   return  userMapper.toDto(userRepository.findByUsername(username));
    //}
}

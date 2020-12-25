package com.example.service.impl;

import com.example.dto.UserDTO;
import com.example.mapper.UserToUserDTOMapper;
import com.example.models.User;
import com.example.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    private UserToUserDTOMapper userMapper;

	@Override
	//@Transactional
	public UserDetails loadUserByUsername(String username)  {
		User user = userRepository.findByUsername(username);
				//.orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));
		//User user = userRepository.findByUsername(username);
		return UserDetailsImpl.build(userMapper.toDto(user));
	}

}


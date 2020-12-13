package com.example.mapper;

import com.example.dto.UserDTO;
import com.example.models.Order;
import com.example.models.User;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class UserToUserDTOMapper {
    public User toEntity(final UserDTO userDTO, final List<Order> orderList){
        final User user = new User();

        user.setFirstname(userDTO.getFirstname());
        user.setLastname(userDTO.getLastname());
        user.setBirth(userDTO.getBirth());
        user.setOrders(orderList);

        return user;
    }

    public UserDTO toDto(final User user){
        final UserDTO userDTO = new UserDTO();

        userDTO.setFirstname(user.getFirstname());
        userDTO.setLastname(user.getLastname());
        userDTO.setBirth(user.getBirth());

        return userDTO;
    }
}

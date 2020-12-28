package com.example.mapper;

import com.example.dto.OrderDTO;
import com.example.dto.UserDTO;
import com.example.models.Order;
import com.example.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderToOrderDTOMapper {
    @Autowired
    private UserToUserDTOMapper userToUserDTOMapper;

    public Order toEntity(final OrderDTO orderDTO, final User user){
//        if(user == null){
//
//            //todo add custom exception throwing
//
//        }

        final Order order = new Order();

        order.setId(orderDTO.getId());
        order.setOrderDate(orderDTO.getOrderDate());
        order.setUser(user);


        return order;
    }

    public OrderDTO toDTO(final Order order){
        final OrderDTO orderDTO = new OrderDTO();

        orderDTO.setId(order.getId());
        orderDTO.setOrderDate(order.getOrderDate());
        orderDTO.setUserID(order.getUser().getId());
       // orderDTO.setUser(order.getUser());

        return orderDTO;
    }


}

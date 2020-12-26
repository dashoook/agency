package com.example.mapper;

import com.example.dto.OrderDTO;
import com.example.models.Order;
import com.example.models.User;
import org.springframework.stereotype.Component;

@Component
public class OrderToOrderDTOMapper {
    public Order toEntity(final OrderDTO orderDTO, final User user){
        if(user == null){

            //todo add custom exception throwing

        }

        final Order order = new Order();

        order.setId(orderDTO.getId());
        order.setOrderDate(orderDTO.getOrderDate());
        order.setOrderDetails(order.getOrderDetails());
        order.setUser(user);

        return order;
    }

    public OrderDTO toDTO(final Order order){
        final OrderDTO orderDTO = new OrderDTO();

        orderDTO.setId(order.getId());
        orderDTO.setOrderDate(order.getOrderDate());
       // orderDTO.setOrderDetails(order.getOrderDetails());
      //  orderDTO.setUserFirstname(order.getUser().getFirstname());
      //  orderDTO.setUserLastname(order.getUser().getLastname());

        return orderDTO;
    }


}

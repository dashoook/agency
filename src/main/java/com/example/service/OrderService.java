package com.example.service;

import com.example.dto.OrderDTO;
import com.example.dto.UserDTO;
import com.example.models.User;

import java.util.List;

public interface OrderService {
    OrderDTO getOrderById(Long id);
    List<OrderDTO> getAllOrders();
    OrderDTO createOrder(OrderDTO OrderDTO);
    OrderDTO updateOrder(OrderDTO OrderDTO);
    void deleteOrderById(Long id);
}

package com.example.repository;

import com.example.dto.OrderDTO;
import com.example.dto.UserDTO;
import com.example.exception.ServiceException;
import com.example.models.Order;
import com.example.models.User;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class OrderRepository {
    @PostConstruct
    public void init(){
        savedOrders = new ArrayList<>();
    }

    private static Long lastId = 1L;
    private List<Order> savedOrders;

    public Order getOrderById(final Long id){
        return savedOrders.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ServiceException(400, "Order with id: " + id + " not found ", null));

    }
    public List<Order> getAllOrders(){
        return savedOrders;
    }

    public Order createOrder(final Order order){
        if(order.getId() != null){
            throw new ServiceException(400, "Order shouldn't have an id ", null);
        }

        ++lastId;
        order.setId(lastId);

        savedOrders.add(order);

        return order;
    }

    public Order updateOrder(final Order order){
        if(order.getId() == null){
            throw new ServiceException(400, "User shouldn't have an id ", null);
        }

        final Order savedOrder = getOrderById(order.getId());

        savedOrder.setId(order.getId());
        savedOrder.setUser(order.getUser());
        savedOrder.setOrderDate(order.getOrderDate());
        savedOrder.setOrderDetails(order.getOrderDetails());

        return savedOrder;
    }

    public void deleteOrderById(final Long id){
        if(id == null){
            throw new ServiceException(400, "Id isn't specified", null);
        }

        savedOrders.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ServiceException(400, "User with id: " + id + " not found ", null));

        savedOrders = savedOrders.stream()
                .filter(e -> !e.getId().equals(id))
                .collect(Collectors.toList());

    }
}
package com.example.dto;

import com.example.mapper.UserToUserDTOMapper;
import com.example.models.Tour;
import com.example.models.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.Map;

public class OrderDTO {
    private Long id;
    private LocalDate orderDate;
    private Long userID;

    public OrderDTO() {
    }

    public OrderDTO(final Long id, final LocalDate orderDate, final Long userID){
        this.id = id;
        this.orderDate = orderDate;
        this.userID = userID;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(final LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(final Long userID) {
        this.userID = userID;
    }

//    public void setUser(User user){
//        user = userRepository.getUserById(id);
//        this.user = user;
//    }
//
//    public User getUser(final Long id) {
//        final User user = userRepository.getUserById(id);
//        return user;
//    }
}

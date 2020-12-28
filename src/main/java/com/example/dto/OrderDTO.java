package com.example.dto;

import com.example.models.Tour;

import java.time.LocalDate;
import java.util.Map;

public class OrderDTO {
    private Long id;
    private LocalDate orderDate;
    private Long tourID;

    public OrderDTO() {
    }

    public OrderDTO(final Long id, final LocalDate orderDate, final Long tourID){
        this.id = id;
        this.orderDate = orderDate;
        this.tourID = tourID;
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

    public Long getTourID() {
        return tourID;
    }

    public void setTourID(final Long tourID) {
        this.tourID = tourID;
    }
}

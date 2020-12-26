package com.example.dto;

import com.example.models.Tour;

import java.time.LocalDate;
import java.util.Map;

public class OrderDTO {
    private Long id;
    private LocalDate orderDate;
    private Long tourID;
  //  private String userFirstname;
  //  private String userLastname;
   // private Map<Tour, Integer> orderDetails;

    public OrderDTO() {
    }

//    public OrderDTO(final Long id, final LocalDate orderDate, final String userFirstname, final String userLastname, final Map<Tour, Integer> orderDetails) {
//        this.id = id;
//        this.orderDate = orderDate;
//        this.userFirstname = userFirstname;
//        this.userLastname = userLastname;
//        this.orderDetails = orderDetails;
//    }
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
//
//    public String getUserFirstname() {
//        return userFirstname;
//    }
//
//    public void setUserFirstname(final String userFirstname) {
//        this.userFirstname = userFirstname;
//    }
//
//    public String getUserLastname() {
//        return userLastname;
//    }
//
//    public void setUserLastname(final String userLastname) {
//        this.userLastname = userLastname;
//    }
//
//    public Map<Tour, Integer> getOrderDetails() {
//        return orderDetails;
//    }
//
//    public void setOrderDetails(final Map<Tour, Integer> orderDetails) {
//        this.orderDetails = orderDetails;
//    }

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

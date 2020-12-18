package com.example.dto;

public class TourDTO {
    private Long id;
    private String country;
    private double price;

    public TourDTO() {
    }

    public TourDTO(final Long id, final String country, final double price) {
        this.id = id;
        this.country = country;
        this.price = price;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(final String title) {
        this.country = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }
}

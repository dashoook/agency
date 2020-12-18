package com.example.models;

public class Tour {
    private Long id;
    private String country;
    private double price;

    public Tour() {
    }

    public Tour(final Long id, final String title, final double price) {
        this.id = id;
        this.country = title;
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

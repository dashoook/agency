package com.example.models;

public class Tour {
    private String title;
    private double price;

    public Tour() {
    }

    public Tour(final String title, final double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

}

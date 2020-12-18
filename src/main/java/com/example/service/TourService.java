package com.example.service;

import com.example.dto.TourDTO;

import java.util.List;

public interface TourService {
    TourDTO getTourById(Long id);
    List <TourDTO> getToursByCountry(String country);
    List<TourDTO> getAllTours();
    TourDTO createTour(TourDTO tourDTO);
    TourDTO updateTour(TourDTO tourDTO);
    void deleteTourById(Long id);
    void deleteToursByCountry(String country);
    List<TourDTO> getAllToursByPriceLower(int price);
    List<TourDTO> getAllToursByPriceHigher(int price);
}

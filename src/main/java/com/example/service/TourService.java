package com.example.service;

import com.example.dto.TourDTO;

import java.util.List;

public interface TourService {
    TourDTO getTourById(Long id);
    List<TourDTO> getAllTours();
    TourDTO createTour(TourDTO tourDTO);
    TourDTO updateTour(TourDTO tourDTO);
    void deleteTourById(Long id);
}

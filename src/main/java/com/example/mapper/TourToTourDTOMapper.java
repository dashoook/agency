package com.example.mapper;

import com.example.dto.TourDTO;
import com.example.models.Tour;
import org.springframework.stereotype.Component;

@Component
public class TourToTourDTOMapper {
    public Tour toEntity(final TourDTO tourDTO){
        final Tour tour = new Tour();

        tour.setId(tourDTO.getId());
        tour.setPrice(tourDTO.getPrice());
        tour.setTitle(tourDTO.getTitle());

        return tour;
    }

    public TourDTO toDTO(final Tour tour){
        final TourDTO tourDTO = new TourDTO();

        tourDTO.setId(tour.getId());
        tourDTO.setPrice(tour.getPrice());
        tourDTO.setTitle(tour.getTitle());

        return tourDTO;
    }
}

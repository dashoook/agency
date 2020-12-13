package com.example.mapper;

import com.example.dto.TourDTO;
import com.example.models.Tour;
import org.springframework.stereotype.Component;

@Component
public class TourToTourDTOMapper {
    public Tour toEntity(final TourDTO bookDTO){
        final Tour tour = new Tour();

        tour.setPrice(bookDTO.getPrice());
        tour.setTitle(bookDTO.getTitle());

        return tour;
    }

    public TourDTO toDTO(final Tour book){
        final TourDTO tourDTO = new TourDTO();

        tourDTO.setPrice(book.getPrice());
        tourDTO.setTitle(book.getTitle());

        return tourDTO;
    }
}

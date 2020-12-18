package com.example.service.impl;

import com.example.dto.TourDTO;
import com.example.mapper.TourToTourDTOMapper;
import com.example.repository.TourRepository;
import com.example.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;
import java.util.List;

public class TourServiceImpl implements TourService {
    @Autowired
    private TourRepository tourRepository;

    @Autowired
    private TourToTourDTOMapper tourToTourDTOMapper;

    @Override
    public TourDTO getTourById(final Long id) {
        return null;
    }

    @Override
    public List<TourDTO> getAllTours() {
        return null;
    }

    @Override
    public TourDTO createTour(final TourDTO bookDTO) {
        return null;
    }

    @Override
    public TourDTO updateTour(final TourDTO bookDTO) {
        return null;
    }

    @Override
    public void deleteTourById(final Long id) {

    }
}

package com.example.service.impl;

import com.example.dto.TourDTO;
import com.example.exception.ServiceException;
import com.example.mapper.TourToTourDTOMapper;
import com.example.repository.TourRepository;
import com.example.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class TourServiceImpl implements TourService {
    @Autowired
    private TourRepository tourRepository;

    @Autowired
    private TourToTourDTOMapper tourMapper;

    @Override
    public TourDTO getTourById(final Long id) {
        return tourMapper.toDTO(tourRepository.getTourById(id));
    }

    @Override
    public List<TourDTO> getToursByCountry(String country) {
        return tourRepository.getAllUsers().stream()
                .map(e -> tourMapper.toDTO(e))
                .filter(tourDTO1 -> tourDTO1.getCountry().equals(country))
                .collect(Collectors.toList());
    }

    @Override
    public List<TourDTO> getAllTours() {
        return tourRepository.getAllUsers().stream()
                .map(e -> tourMapper.toDTO(e))
                .collect(Collectors.toList());
    }

    @Override
    public TourDTO createTour(final TourDTO tourDTO) {
        if(tourDTO.getId() != null){
            throw new ServiceException(400, "User shouldn't have an id ", null);
        }

        return tourMapper.toDTO(tourRepository.createTour(tourMapper.toEntity(tourDTO)));
    }

    @Override
    public TourDTO updateTour(final TourDTO tourDTO) {
        if(tourDTO.getId() == null){
            throw new ServiceException(400, "User shouldn't have an id ", null);
        }

        return tourMapper.toDTO(tourRepository.updateTour(tourMapper.toEntity(tourDTO)));
    }

    @Override
    public List<TourDTO> getAllToursByPriceLower(int price) {
        return tourRepository.getAllUsers().stream()
                .map(e -> tourMapper.toDTO(e))
                .filter(tourDTO1 -> tourDTO1.getPrice() <= price)
                .collect(Collectors.toList());
    }
    @Override
    public List<TourDTO> getAllToursByPriceHigher(int price) {
        return tourRepository.getAllUsers().stream()
                .map(e -> tourMapper.toDTO(e))
                .filter(tourDTO1 -> tourDTO1.getPrice() >= price)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteTourById(final Long id) {
        tourRepository.deleteTourById(id);
    }

    @Override
    public void deleteToursByCountry(final String country) {
        tourRepository.deleteToursByCountry(country);
    }
}

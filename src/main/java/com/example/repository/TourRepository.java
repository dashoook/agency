package com.example.repository;

import com.example.exception.ServiceException;
import com.example.models.Tour;
import com.example.models.User;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class TourRepository {
    @PostConstruct
    public void init(){
        savedTours = new ArrayList<>();
    }

    private static Long lastId = 1L;
    private List<Tour> savedTours;

    public Tour getTourById(final Long id){
        return savedTours.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ServiceException(400, "User with id: " + id + " not found ", null));
    }

    public List<Tour> getAllUsers(){
        return savedTours;
    }

    public Tour createTour(final Tour tour){
        if(tour.getId() != null){
            throw new ServiceException(400, "Tour shouldn't have an id ", null);
        }

        ++lastId;
        tour.setId(lastId);

        savedTours.add(tour);

        return tour;
    }

    public Tour updateTour(final Tour tour){
        if(tour.getId() == null){
            throw new ServiceException(400, "User shouldn't have an id ", null);
        }

        final Tour savedTour = getTourById(tour.getId());

        savedTour.setCountry(tour.getCountry());
        savedTour.setPrice(tour.getPrice());

        return savedTour;
    }

    public void deleteTourById(final Long id){
        if(id == null){
            throw new ServiceException(400, "Id isn't specified", null);
        }

        savedTours.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ServiceException(400, "User with id: " + id + " not found ", null));

        savedTours = savedTours.stream()
                .filter(e -> !e.getId().equals(id))
                .collect(Collectors.toList());

    }
    public void deleteToursByCountry(final String country){
        if(country == null){
            throw new ServiceException(400, "Id isn't specified", null);
        }

        savedTours.stream()
                .filter(e -> e.getCountry().equals(country))
                .findFirst()
                .orElseThrow(() -> new ServiceException(400, "User with id: " + country + " not found ", null));

        savedTours = savedTours.stream()
                .filter(e -> !e.getCountry().equals(country))
                .collect(Collectors.toList());
    }

}

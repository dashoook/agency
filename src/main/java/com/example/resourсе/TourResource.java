package com.example.resourсе;

import com.example.dto.TourDTO;
import com.example.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TourResource {
    @Autowired
    private TourService tourService;

    @GetMapping("/tours/{country}")
    public List<TourDTO> getToursByCountry(final @PathVariable String country){
        return tourService.getToursByCountry(country);
    }

    @GetMapping("/tour/{id}")
    public TourDTO getTourById(final @PathVariable Long id){
        return tourService.getTourById(id);
    }

    @GetMapping("/tours")
    public List<TourDTO> getAllTours(){
        return tourService.getAllTours();
    }

    @PostMapping("/tours")
    public TourDTO createTour(final @RequestBody TourDTO tourDTO){
        return tourService.createTour(tourDTO);
    }

    @PutMapping("/tours")
    public TourDTO updateTour(final @RequestBody TourDTO tourDTO){
        return tourService.updateTour(tourDTO);
    }

    @DeleteMapping("/tour/{id}")
    public void deleteTourById(final @PathVariable Long id){
        tourService.deleteTourById(id);
    }

    @DeleteMapping("/tours/{country}")
    public void deleteToursByCountry(final @PathVariable String country){
        tourService.deleteToursByCountry(country);
    }
    @GetMapping("/toursbylowerprice/{price}")
    public List<TourDTO> getAllToursByPriceLower(final @PathVariable int price){
        return tourService.getAllToursByPriceLower(price);
    }
    @GetMapping("/toursbyhigherprice/{price}")
    public List<TourDTO> getAllToursByPriceHigher(final @PathVariable int price){
        return tourService.getAllToursByPriceHigher(price);
    }

}

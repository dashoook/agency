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

    @GetMapping("/tours/{id}")
    public TourDTO getTourById(final @PathVariable Long id){
        return tourService.getTourById(id);
    }

    @GetMapping("/tours")
    public List<TourDTO> getAllTours(){
        return tourService.getAllTours();
    }

    @PostMapping("/tours")
    public TourDTO createTour(final @RequestBody TourDTO bookDTO){
        return tourService.createTour(bookDTO);
    }

    @PutMapping("/tours")
    public TourDTO updateTour(final @RequestBody TourDTO tourDTO){
        return tourService.updateTour(tourDTO);
    }

    @DeleteMapping("/tours/{id}")
    public void deleteTourById(final @PathVariable Long id){
        tourService.deleteTourById(id);
    }
}

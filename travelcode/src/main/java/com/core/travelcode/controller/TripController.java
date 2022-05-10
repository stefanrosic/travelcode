package com.core.travelcode.controller;

import com.core.travelcode.entity.Trip;
import com.core.travelcode.service.ITripService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/trips")
public class TripController {

    private final ITripService tripService;

    public TripController(ITripService tripService) {
        this.tripService = tripService;
    }

    @GetMapping
    public List<Trip> getAllDoctors() {
        return tripService.getAll();
    }
}

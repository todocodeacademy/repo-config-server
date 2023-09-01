package com.todocodeacademy.citiesservice.controller;

import com.todocodeacademy.citiesservice.dto.CityDTO;
import com.todocodeacademy.citiesservice.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cities")
public class CitiesController {

    @Autowired
    private ICityService servCity;

    @GetMapping("/hotels")
    public CityDTO getCityAndHotels(@RequestParam String name,
                                    @RequestParam String country) {

        return servCity.getCitiesHotels(name, country);

    }
}

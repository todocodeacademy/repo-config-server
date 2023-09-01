package com.todocodeacademy.citiesservice.service;

import com.todocodeacademy.citiesservice.dto.CityDTO;

import java.util.List;

public interface ICityService {

    public CityDTO getCitiesHotels(String name, String country);
}

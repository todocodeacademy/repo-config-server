package com.todocodeacademy.citiesservice.model;

import com.todocodeacademy.citiesservice.dto.HotelDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class City {

    private Long city_id;
    private String name;
    private String continent;
    private String country;
    private String state;

}

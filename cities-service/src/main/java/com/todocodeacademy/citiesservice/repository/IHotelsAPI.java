package com.todocodeacademy.citiesservice.repository;

import com.todocodeacademy.citiesservice.dto.HotelDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//mismo nombre de la app en eureka
//asi ya no es necessario configurar la url
@FeignClient(name = "hotels-service")
public interface IHotelsAPI {

    @GetMapping("hotels/{city_id}")
    public List<HotelDTO> getHotelsByCityId (@PathVariable("city_id") Long city_id);

}

package com.todocodeacademy.hotelsservice.service;

import com.todocodeacademy.hotelsservice.model.Hotel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HotelService implements IHotelService{

    List<Hotel> hotelsList = new ArrayList<Hotel>();


    @Override
    public List<Hotel> getHotelsByCityId(Long city_id) {

        List<Hotel> hotelCityList = new ArrayList<Hotel>();

        //carga la bd "lógica"
        this.loadHotels();
        //busca si coincide la id
        for(Hotel h:hotelsList) {
           if (h.getCity_id()==city_id) {
               hotelCityList.add(h);
           }

        }
        //develve la lista
        return hotelCityList;
    }

    public void loadHotels() {

        hotelsList.add(new Hotel(1L,"Paradise", 5, 1L));
        hotelsList.add(new Hotel(2L, "Sunset View", 4, 2L));
        hotelsList.add(new Hotel(3L, "Ocean Breeze", 3, 3L));
        hotelsList.add(new Hotel(4L, "Mountain Retreat", 4, 1L));
        hotelsList.add(new Hotel(5L, "City Lights Inn", 3, 2L));
        hotelsList.add(new Hotel(6L, "Riverside Lodge", 4, 3L));
        hotelsList.add(new Hotel(7L, "Cozy Cabin Resort", 2, 1L));
        hotelsList.add(new Hotel(8L, "Luxury Haven", 5, 2L));
        hotelsList.add(new Hotel(9L, "Historic Grand Hotel", 4, 3L));
        hotelsList.add(new Hotel(10L, "Tranquil Gardens", 3, 1L));

    }


}

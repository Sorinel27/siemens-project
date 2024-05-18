package com.internship.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.internship.Repository.HotelRepository;
import com.internship.Entity.Hotel;

@Service
public class HotelService {
    @Autowired
    private HotelRepository hotelRepository;

    public List<Hotel> findHotelsWithinRadius(double latitude, double longitude, double radius) {
        return hotelRepository.findHotelsWithinRadius(latitude, longitude, radius);
    }
}

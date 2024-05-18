package com.internship.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.internship.Entity.Hotel;
import com.internship.Service.HotelService;
import java.util.List;

@RestController
@RequestMapping("/api/hotels")
@CrossOrigin(origins = "http://localhost:5173")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @GetMapping("/nearby")
    public List<Hotel> getNearbyHotels(@RequestParam double latitude, @RequestParam double longitude, @RequestParam double radius) {
        return hotelService.findHotelsWithinRadius(latitude, longitude, radius);
    }
}

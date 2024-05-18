package com.internship.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.internship.Entity.rooms;
import com.internship.Service.RoomsService;
import java.util.List;

@RestController
@RequestMapping("/api/hotels")
@CrossOrigin(origins = "http://localhost:5173")
public class RoomsController {

    @Autowired
    private RoomsService roomService;

    @GetMapping("/{hotelId}/available-rooms")
    public List<rooms> getAvailableRooms(@PathVariable Integer hotelId) {
        return roomService.findAvailableRoomsByHotelId(hotelId);
    }
}
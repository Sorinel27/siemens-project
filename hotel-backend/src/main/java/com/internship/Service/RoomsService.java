package com.internship.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.internship.Repository.RoomRepository;
import com.internship.Entity.rooms;

@Service
public class RoomsService {
    
    @Autowired
    private RoomRepository roomRepository;

    public List<rooms> findAvailableRoomsByHotelId(Integer hotel_ID) {
        return roomRepository.findByHotelIdAndIsAvailableTrue(hotel_ID);
    }

}

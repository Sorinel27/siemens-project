package com.internship.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.internship.Entity.rooms;

import java.util.List;

public interface RoomRepository extends JpaRepository<rooms, Integer> {
    List<rooms> findByHotelIdAndIsAvailableTrue(Integer hotel_ID);
}

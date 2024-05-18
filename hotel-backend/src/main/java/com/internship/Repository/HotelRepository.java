package com.internship.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.internship.Entity.Hotel;
import java.util.List;

public interface HotelRepository extends JpaRepository<Hotel, Integer> {
    @Query("SELECT h FROM Hotel h WHERE (6371 * acos(cos(radians(:latitude)) * cos(radians(h.latitude)) * cos(radians(h.longitude) - radians(:longitude)) + sin(radians(:latitude)) * sin(radians(h.latitude)))) < :radius")
    List<Hotel> findHotelsWithinRadius(@Param("latitude") double latitude, @Param("longitude") double longitude, @Param("radius") double radius);
}

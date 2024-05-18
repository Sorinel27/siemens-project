package com.internship.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "rooms")
public class rooms {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int roomNumber;

    @ManyToOne
    @JoinColumn(name = "hotel_ID")
    private Hotel hotel_ID;

    @ManyToOne
    @JoinColumn(name = "roomTypeID")
    private roomtype roomTypeID;

    private int price;
    private boolean isAvailable;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Hotel getHotel_ID() {
        return hotel_ID;
    }

    public void setHotel_ID(Hotel hotel_ID) {
        this.hotel_ID = hotel_ID;
    }

    public roomtype getRoomTypeID() {
        return roomTypeID;
    }

    public void setRoomTypeID(roomtype roomTypeID) {
        this.roomTypeID = roomTypeID;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

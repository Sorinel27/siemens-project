package com.internship.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class roomtype {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String Name;
    
    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }
}
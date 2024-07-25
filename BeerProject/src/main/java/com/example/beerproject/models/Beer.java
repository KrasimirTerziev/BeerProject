package com.example.beerproject.models;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class Beer {

    @Positive(message = "Id should be positive")
    private int id;

    @NotNull(message = "name can't be empty")
    @Size(min = 2, max = 20, message = "Name should be between 2 and 20 symbols")
    private String name;

    @Positive(message = "ÄBV should be positive")
    private double abv;
    public Beer(){

    }

    public Beer(int id, String name, double abv) {
        this.id = id;
        this.name = name;
        this.abv = abv;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getAbv() {
        return abv;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAbv(double abv) {
        this.abv = abv;
    }
}

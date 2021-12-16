package com.example.f21comp1011gcfinala;

import java.util.ArrayList;
import java.util.Collections;

public class Car extends Dealership {

    private int id;
    private int year;
    private String make;
    private double price;
    private String model;
    private ArrayList<String> type;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public ArrayList<String> getType() {
        Collections.sort(type);
        return type;
    }

    public void setType(ArrayList<String> type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "[" + year + "]-[" + make + "] [" + model + "]- [$" + price + "]- Type(s): [" + type + "]";
    }
}

package com.example.f21comp1011gcfinala;

import java.util.ArrayList;
import java.util.Collections;
import com.google.gson.annotations.SerializedName;

public class Car extends Dealership {

    @SerializedName("id")
    private int id;

    @SerializedName("year")
    private String year;

    @SerializedName("make")
    private String make;

    @SerializedName("model")
    private String model;

    @SerializedName("price")
    private double price;

    @SerializedName("type")
    private ArrayList<String> type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ArrayList<String> getType() {
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

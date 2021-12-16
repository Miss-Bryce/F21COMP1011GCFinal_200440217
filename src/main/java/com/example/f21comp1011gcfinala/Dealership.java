package com.example.f21comp1011gcfinala;

import com.google.gson.annotations.SerializedName;

public class Dealership {

    @SerializedName("Dealership")
    private String dealership;

    @SerializedName("Inventory")
    private Car[] inventory;


    public void setDealership(String dealership) {
        this.dealership = dealership;
    }

    public String getDealership() {
        return dealership;
    }


    public Car[] getInventory() {
        return inventory;
    }

    public void setInventory(Car[] inventory) {
        this.inventory = inventory;
    }
}

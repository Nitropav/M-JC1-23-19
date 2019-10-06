package com.homework1;

public class Motor {

    private double volume;
    private String fuel;
    private String name;

    public Motor(double volume, String fuel, String name){
        this.volume = volume;
        this.fuel = fuel;
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public String getFuel() {
        return fuel;
    }

    public String getName() {
        return name;
    }
}

package com.company;

public class Wheel {

    private int radius;
    private String season;
    private String name;

    public Wheel(int radius, String season, String name){
        this.radius = radius;
        this.season = season;
        this.name = name;
    }

    public int getRadius() {
        return radius;
    }

    public String getSeason() {
        return season;
    }

    public String getName() {
        return name;
    }
}

package com.homework1;

public class Mercedes extends Car{

    private int place;
    private String category;
    private String key;
    private String name;


    Mercedes(int place, String name){
        this.place = place;
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

}

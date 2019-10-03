package com.company;

public class Driver implements IDriver {

    private int drivingExperience;
    private String category;
    private String key;

    Driver(int drivingExperience, String category, String key){
        this.drivingExperience = drivingExperience;
        this.category = category;
        this.key = key;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public String getKey() {
        return key;
    }

    public String getCategory() {
        return category;
    }

    public void open(){
        System.out.println("Открыл авто.");
    }

    public void start(){
        System.out.println("Завел авто.");
    }

    public void drive(){
            System.out.println("Начал движение.");
    }

    public void takepass(){
        System.out.println("Принял пассажиров.");
    }

    public void fillcar(){
        System.out.println("Заправил авто.");
    }
}

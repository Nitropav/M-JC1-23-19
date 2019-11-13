package com.homework1;

public class Main {

    public static void main(String[] args) {

        Driver c1 = new Driver(4, "b", "mercedes");
        Car c2 = new Mercedes(5, "Mercdes G65 AMG");
        Wheel wheel = new Wheel(23, "summer", "belshina");
        Motor motor = new Motor(5.5, "gasoline", "AMG V12");

        avto(motor, wheel, (Mercedes) c2);

        ((Mercedes) c2).setCategory("b");
        ((Mercedes) c2).setBak(75);
        ((Mercedes) c2).setKey("mercedes");

        prav(c1, (Mercedes) c2);
        key(c1, (Mercedes) c2);
        zajig(c1, (Mercedes) c2);
        bak(c1, (Mercedes) c2);
        pass(c1);
    }

    public static void prav(Driver c1, Car c2){
        if(c1.getCategory() == ((Mercedes) c2).getCategory()){
            System.out.println("Категория водителя соответсвует!");//
        }else {
            System.out.println("Категория водителя не соответсвует для данного автомобиля!");
        }
    }

    public static void key(Driver c1, Car c2){
        String answer = (c1.getKey() == ((Mercedes) c2).getKey()) ? "Имеет ключ для этого авто" : "Не имеет ключ для этого авто";
        System.out.println(answer);
        c1.open();
    }

    public static void zajig(Driver c1, Car c2){
        if(c1.getKey() == ((Mercedes) c2).getKey()){
            System.out.println("Так как ключ соответсвует");
            c1.start();
            c1.drive();
        }else {
            System.out.println("Не имеет ключа");
        }
    }

    public static void bak(Driver c1, Car c2){
        System.out.println("Приехал на заправку");
        if(c2.getBak() == 75){
            c1.fillcar();
        } else {
            System.out.println("Пытается заправить больше полного бака!");
        }
    }

    public static void pass(Driver c1){
        if(c1.getDrivingExperience() >= 3){
            System.out.println("Может перевозить больше 3-х человек");
        }else{
            System.out.println("Не может перевозить больше 3-х человек");
        }
        c1.takepass();
    }

    public static void avto(Motor motor, Wheel wheel, Car c2){
        System.out.println("Автомобиль: " + ((Mercedes) c2).getName());
        System.out.println("\nМОТОР\n" + "Название мотора " + motor.getName() + "\nТип топлива " + motor.getFuel() + "\nРасход " + motor.getVolume());
        System.out.println("\nКОЛЕСА\n" + "Название колес " + wheel.getName() + "\nСезонность " + wheel.getSeason() + "\nРадиус " + wheel.getRadius() + "\n");
    }
}

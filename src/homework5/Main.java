package homework5;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        sravDate();
        plusbDate();
        plusYear();
        nameCountry();
        sravCountry(Country.Belarus);
        noElement();
    }

    public static void sravDate(){
        System.out.println("================");
        Date date = new Date();
        Date date1 = new Date();
        System.out.println(date == date1);
        System.out.println(date.equals(date1));
    }

    private static void plusbDate(){
        System.out.println("================");
        Date date = new Date();
        System.out.println(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, 5);
        calendar.add(Calendar.MONTH, 1);
        date = calendar.getTime();
        System.out.println("New: " + date);
    }

    private static void plusYear(){
        System.out.println("================");
        Date date = new Date();
        System.out.println(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.YEAR, 1);
        date = calendar.getTime();
        System.out.println(date);
        calendar.setTime(date);
        calendar.add(Calendar.YEAR, 1);
        date = calendar.getTime();
        System.out.println(date);
    }

    public static void nameCountry(){
        System.out.println("================");
        String nameCountry = "Belarus";
        Country country = Country.valueOf(nameCountry);
        System.out.println("Name " + nameCountry + "\nArea " + country.getArea() + "\nPopulation " + country.getPopulation());
    }

    public static void sravCountry(Country country){
        System.out.println("================");
        String nameCountry = "Belarus";
        System.out.println(country == Country.valueOf(nameCountry));
    }

    public static void noElement(){
        System.out.println("================");
        Country country = Country.valueOf("Finland");
        //System.out.println(country); //ошибка, такого элемента не существует
    }
}

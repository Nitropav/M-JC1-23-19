package homework3;

public class FootballClub {
    private String name;
    private int year;

    FootballClub(String name, int year){
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "FootballClub{" +
                "name = '" + name + '\'' +
                ", year = " + year +
                '}';
    }
}

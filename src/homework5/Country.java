package homework5;

public enum Country implements ICountry {
    Belarus(207595, 9500000),
    Russia(17100000, 144000000),
    Ukraine(603628, 44000000),
    USA(9834000, 328000000),
    Canada(9985000, 37000000),
    Spain(505990, 47000000),
    France(643801, 66000000),
    Germany(357386, 81000000),
    Italy(301338, 61000000),
    Portugal(92212, 11000000);

    private int area;
    private int population;

    Country(int area, int population){
        this.area = area;
        this.population = population;
    }

    @Override
    public int getArea() {
        return area;
    }

    @Override
    public int getPopulation() {
        return population;
    }
}

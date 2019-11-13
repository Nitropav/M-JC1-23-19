package homework7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Filter filter = new Filter();
        FilterApplicator filterApplicator = new FilterApplicator();

        List<Clubs> clubsList = new ArrayList<>();

        clubsList.add(new Clubs("Juventus", 1890, 34));
        clubsList.add(new Clubs("Barcelona", 1897, 36));
        clubsList.add(new Clubs("Real", 1902, 40));
        clubsList.add(new Clubs("Liverpool", 1877, 31));
        clubsList.add(new Clubs("Arsenal", 1899, 32));
        clubsList.add(new Clubs("Inter", 1923, 29));
        clubsList.add(new Clubs("Milan", 1865, 27));

        System.out.println(filterApplicator.filter(clubsList, filter));

        System.out.println(filterApplicator.sort(clubsList));
    }
}

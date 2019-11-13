package homework7;

import java.util.Collection;
import java.util.List;

public class FilterApplicator<T extends Collection> {
    public static <T> Collection<T> filter (Collection<T> collectoin, Filter filter){
        return filter.filter(collectoin);
    }

    public static List<Clubs> sort(List <Clubs> collection){
        collection.sort(Clubs::compareTo);
        return collection;
    }
}

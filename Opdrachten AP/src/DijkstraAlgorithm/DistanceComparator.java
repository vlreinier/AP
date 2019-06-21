package DijkstraAlgorithm;

import java.util.Comparator;

public class DistanceComparator implements Comparator<City> {

    public int compare(City city1, City city2) {
        if (city1.distance_from_source < city2.distance_from_source)
            return -1;
        if (city1.distance_from_source > city2.distance_from_source)
            return 1;
        return 0;
    }

}

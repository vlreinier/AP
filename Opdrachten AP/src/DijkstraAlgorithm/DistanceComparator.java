package DijkstraAlgorithm;

import java.util.Comparator;

class DistanceComparator implements Comparator<City> {

    /**
     * @param city1
     * @param city2
     * @return value displacement in priority queue by index by comparing city distances from source (starting point)
     *
     */

    public int compare(City city1, City city2) {

        if (city1.distance_from_source < city2.distance_from_source)
            return -1;

        if (city1.distance_from_source > city2.distance_from_source)
            return 1;

        return 0;
    }
}

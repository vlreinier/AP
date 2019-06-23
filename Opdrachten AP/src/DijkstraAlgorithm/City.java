package DijkstraAlgorithm;

class City {
    int id;
    double distance_from_source;

    /**
     * @param id city id
     * @param distance_from_source best distance from source / starting point
     */

    City(int id, double distance_from_source) {
        this.id = id;
        this.distance_from_source = distance_from_source;
    }
}

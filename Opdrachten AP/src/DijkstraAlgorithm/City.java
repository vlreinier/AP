package DijkstraAlgorithm;

public class City {
    int id;
    double distance_from_source;

    public City(int id, double distance_from_source) {
        this.id = id;
        this.distance_from_source = distance_from_source;
    }
}

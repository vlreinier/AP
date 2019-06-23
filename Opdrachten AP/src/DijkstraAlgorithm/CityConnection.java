package DijkstraAlgorithm;

public class CityConnection {
    int source;
    int destination;
    double distance;

    /**
     * @param source
     * @param destination
     * @param distance
     *
     * class for creating connection between cities with corresponding distance in between
     *
     */

    public CityConnection(int source, int destination, double distance) {
        this.source = source;
        this.destination = destination;
        this.distance = distance;
    }
}

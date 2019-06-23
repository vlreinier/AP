package DijkstraAlgorithm;

public class CityConnection {
    int source;
    int destination;
    double distance;

    /**
     * @param source start city for connection
     * @param destination end city for connection
     * @param distance distance between cities for this connection
     *
     * class for creating connection between cities with corresponding distance in between
     *
     */

    CityConnection(int source, int destination, double distance) {
        this.source = source;
        this.destination = destination;
        this.distance = distance;
    }
}

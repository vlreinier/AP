package DijkstraAlgorithm;

public class Connection {
    int source;
    int destination;
    double distance;

    public Connection(int source, int destination, double distance) {
        this.source = source;
        this.destination = destination;
        this.distance = distance;
    }
}

package DijkstraManualCitiesOLD;

public class Connection {
    City source;
    City destination;
    int distance;

    public Connection(City source, City destination, int distance) {
        this.source = source;
        this.destination = destination;
        this.distance = distance;
    }
}

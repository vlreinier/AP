package DijkstraAlgorithm;

import java.util.List;

public class Main {


    /**
     * @param arg
     *
     * Dijkstra's Shortest Path algorithm based on cities and their distances in between
     * Cities are not manually created but are updated during run algorithm (creates from new found connections)
     *
     */


    public static void main(String[] arg) {
        // number of cities
        int cities = 4;

        // defining cities with their integer id
        int soest = 0;
        int utrecht = 1;
        int amsterdam = 2;
        int denhaag = 3;

        // create empty connectionsGraph for city connections
        ConnectionsGraph connectionsGraph = new ConnectionsGraph(cities);

        // add connections to connectionsGraph (from id, destination id, distance)
        connectionsGraph.addConnection(soest, utrecht, 1);
        connectionsGraph.addConnection(soest, amsterdam, 1);
        connectionsGraph.addConnection(utrecht, amsterdam, 1);
        connectionsGraph.addConnection(utrecht, denhaag, 2);
        connectionsGraph.addConnection(amsterdam, denhaag, 1);

        // create new journey (connectionsGraph with connections, source, destination)
        Journey my_first_journey = new Journey(connectionsGraph, soest, denhaag);
        my_first_journey.dijkstraShortestPath();

        // get shortest distance and belonging shortest path
        double shortestDistance = my_first_journey.shortestDistance();
        List<Integer> shortestPath = my_first_journey.shortestPath();

        // print shortest distance and corresponding journey / path
        System.out.println("Shortest distance: " + shortestDistance);
        System.out.println("Visited cities: " + shortestPath);
    }
}

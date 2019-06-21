package DijkstraAlgorithm;

import java.util.List;

public class Main {
    public static void main(String[] arg) {
        // number of cities
        int cities = 4;

        // defining cities with their integer id
        int soest = 0;
        int utrecht = 1;
        int amsterdam = 2;
        int denhaag = 3;

        // create empty graph
        Graph graph = new Graph(cities);

        // add connections to graph (from id, destination id, distance)
        graph.addConnection(soest, amsterdam, 2);
        graph.addConnection(amsterdam, utrecht, 2);
        graph.addConnection(utrecht, denhaag, 1);
        graph.addConnection(soest, denhaag, 7);
        graph.addConnection(amsterdam, denhaag, 4);

        // create new journey (graph with connections, source, destination)
        Journey my_first_journey = new Journey(graph, amsterdam, denhaag);

        // get shortest distance and belonging shortest path
        double shortestDistance = my_first_journey.shortestDistance();
        List<Integer> shortestPath = my_first_journey.shortestPath();

        // print shortest distance and corresponding journey / path
        System.out.println("Shortest distance: " + shortestDistance);
        System.out.println("Visited cities: " + shortestPath);
    }
}
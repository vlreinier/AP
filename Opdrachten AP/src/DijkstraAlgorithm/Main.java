package DijkstraAlgorithm;

import java.util.List;

public class Main {
    public static void main(String[] arg) {
        // number of cities
        int cities = 5;

        // defining cities with their integer id
        int soest = 0;
        int utrecht = 1;
        int amsterdam = 2;
        int brussel = 3;
        int berlijn = 4;

        // create empty graph
        Graph graph = new Graph(cities);

        // add connections to graph (from id, destination id, distance)
        graph.addConnection(soest, utrecht, 10);
        graph.addConnection(utrecht, amsterdam, 10);
        graph.addConnection(amsterdam, brussel, 5);
        graph.addConnection(amsterdam, berlijn, 30);
        graph.addConnection(brussel, berlijn, 5);

        // create new journey (graph with connections, source, destination)
        Journey my_first_journey = new Journey(graph, soest, berlijn);

        // get shortest distance and belonging shortest path
        double shortestDistance = my_first_journey.shortestDistance();
        List<Integer> shortestPath = my_first_journey.shortestPath();

        // print shortest distance and corresponding journey / path
        System.out.println(shortestDistance);
        System.out.println(shortestPath.toString());
    }
}

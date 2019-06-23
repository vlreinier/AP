package DijkstraManualCitiesOLD;

public class Main {

    /**
     * @param arg
     *
     * OLD version of Dijkstra Shortest Path where cities are manually created
     * new version is package DijkstraAlgorithm
     *
     * algorithm works but not added:
     * returning reconstructed path from source to destination
     * returning shortest distance
     *
     */


    public static void main(String[] arg) {
        // create cities (nodes)
        City soest = new City("soest", 0);
        City utrecht = new City("utrecht", 1);
        City amsterdam = new City("amsterdam", 2);
        City brussel = new City("brussel", 3);
        City berlijn = new City("berlijn", 4);

        // create graph
        int num_cities = 5;
        Graph graph = new Graph(num_cities);

        // establish connections between cities with distance in between and add to graph
        graph.addConnection(soest, utrecht, 10);
        graph.addConnection(utrecht, amsterdam, 10);
        graph.addConnection(utrecht, berlijn, 25);
        graph.addConnection(amsterdam, berlijn, 30);
        graph.addConnection(amsterdam, brussel, 5);
        graph.addConnection(brussel, berlijn, 5);

        // calculate shortest path from city start to city end
        DijkstraShortestPath journey = new DijkstraShortestPath(graph, num_cities);
        journey.sourceDestination(soest, berlijn);
        journey.shortestDistance();
        //List<Integer> path = journey.shortestPath();
    }
}

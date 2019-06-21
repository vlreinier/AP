package DijkstraAlgorithm;

import java.util.*;

public class Journey {
    private int destination, source;
    private double shortestDistance;
    private int[] previous_cities;

    public Journey(Graph graph, int source, int destination){
        // save destination and start as its needed for reconstructing path
        this.destination = destination;
        this.source = source;

        // number of cities
        int cities = graph.graph.size();

        // create list with best distances from source where index == city id
        double[] distances_from_source = new double[cities];

        // create list with visited cities to make sure no cities are double visited
        boolean[] visited_cities = new boolean[cities];

        // remember best previous visited cities, so reversed path can be reconstructed later
        int[] previous_cities = new int[cities];

        // no distances are known yet so they could all be infinite (except for source to source, thats 0 off course)
        Arrays.fill(distances_from_source, Double.POSITIVE_INFINITY);
        distances_from_source[source] = 0;

        // create new comparator to compare distances values in priority queue
        DistanceComparator comparator = new DistanceComparator();

        // create priority queue to keep track of most promising cities to visit
        PriorityQueue<City> queue = new PriorityQueue<>(2 * cities, comparator);
        queue.offer(new City(source, 0));

        // run algorithm as long as destination is not reached or queue is not empty
        while (!queue.isEmpty()) {

            // get city from queue and mark city as visited
            City city = queue.poll();
            visited_cities[city.id] = true;

            // if already calculated distance is shorter continue
            if (distances_from_source[city.id] < city.distance_from_source) {
                continue;
            }

            // get city connections
            List<Connection> connections = graph.graph.get(city.id);

            for (int i = 0; i < connections.size(); i++) {
                Connection connection = connections.get(i);

                // if city is already visited, continue
                if (visited_cities[connection.destination]) {
                    continue;
                }

                // calculate new distance from starting city to current city
                double bestDistance = distances_from_source[connection.source] + connection.distance;

                // check if new calculated distance from start city is less than current saved distance for this city
                if (bestDistance < distances_from_source[connection.destination]) {
                    // if so, update best previous city for reconstructing path later
                    previous_cities[connection.destination] = connection.source;
                    // also change best distance from starting city for current city
                    distances_from_source[connection.destination] = bestDistance;
                    // update queue with new city from connections from graph
                    queue.offer(new City(connection.destination, distances_from_source[connection.destination]));
                }
            }

            // if destination city if reached, stop algorithm
            if (city.id == destination) {
                break;
            }
        }

        // save best previous cities and shortest distance for source to destination journey
        this.previous_cities = previous_cities;
        this.shortestDistance = distances_from_source[destination];
        //for (int i=0;i<previous_cities.length;i++) System.out.println(previous_cities[i]);
    }

    public double shortestDistance() {
        return shortestDistance;
    }

    public List<Integer> shortestPath() {
        List<Integer> path = new ArrayList<>();
        // reconstruct path from end to start, because we only know the best previous cities, not the best next
        if (destination == 0){
            return path;
        } else {
            for (Integer at = destination; at != null; at = previous_cities[at]) {
                path.add(at);
                if (at == 0){
                    break;
                }
            }
        }

        // reverse path, so that path starts from source instead of destination
        Collections.reverse(path);
        if (source != 0){
            path.remove(0);
        }
        return path;
    }

}

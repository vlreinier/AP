package DijkstraAlgorithm;

import java.util.*;

public class Journey {
    private int destination, source;
    private double shortestDistance;
    private int[] previous_cities;
    ConnectionsGraph connectionsGraph;

    /**
     * @param connectionsGraph
     * @param source
     * @param destination
     *
     * class calculates shortest distance for given source to destination using priority queue
     * also reconstructs path from destination to source (reversed) continuously getting best previous city
     *
     */

    public Journey(ConnectionsGraph connectionsGraph, int source, int destination) {
        this.connectionsGraph = connectionsGraph;
        this.destination = destination;
        this.source = source;
    }

    public void dijkstraShortestPath(){
        // number of cities
        int cities = connectionsGraph.graph.size();

        // create list with best distances from source where index == city id
        double[] distances_from_source = new double[cities];

        // create list with visited cities to make sure no cities are double visited
        boolean[] visited_cities = new boolean[cities];

        // remember best previous visited cities, so reversed path can be reconstructed later
        int[] previous_cities = new int[cities];

        // no distances are known yet so they could all be infinite (except for source to source, that is 0 off course)
        Arrays.fill(distances_from_source, Double.POSITIVE_INFINITY);
        distances_from_source[source] = 0;

        // create new comparator to compare distances values in priority queue
        DistanceComparator comparator = new DistanceComparator();

        // create priority queue to keep track of most promising cities to visit
        PriorityQueue<City> queue = new PriorityQueue<>(2 * cities, comparator);
        queue.offer(new City(source, 0));

        // run algorithm as long as destination is not reached or queue is not empty
        while (!queue.isEmpty()) {

            // get city with lowest distance value from queue
            City city = queue.poll();

            // mark city as visited (dont wanna visit twice)
            visited_cities[city.id] = true;

            // if already calculated distance is shorter than currently saved distance, break iteration and continue
            if (distances_from_source[city.id] < city.distance_from_source) {
                continue;
            }

            // get city cityConnections for current city
            List<CityConnection> cityConnections = connectionsGraph.graph.get(city.id);

            // iterate over city connections
            for (int i = 0; i < cityConnections.size(); i++) {
                CityConnection cityConnection = cityConnections.get(i);

                // if city connection is already visited, break from current iteration and continue
                if (visited_cities[cityConnection.destination]) {
                    continue;
                }

                // calculate new distance from starting city to current city
                double bestDistance = distances_from_source[cityConnection.source] + cityConnection.distance;

                // check if new calculated distance from start city is less than current saved distance for this city
                if (bestDistance < distances_from_source[cityConnection.destination]) {
                    // if so, update best previous city for reconstructing path later
                    previous_cities[cityConnection.destination] = cityConnection.source;
                    // also change best distance from starting city for current city
                    distances_from_source[cityConnection.destination] = bestDistance;
                    // update queue with new city from cityConnections from connectionsGraph if destination is not reached
                    // in package DijkstraManualCitiesOLD cities are constructed before staring journey, this saves some code
                    queue.offer(new City(cityConnection.destination, distances_from_source[cityConnection.destination]));
                }
            }

            // if destination city if reached, stop algorithm
            if (city.id == destination) {
                break;
            }
        }

        // save best previous cities and shortest distance for source to destination journey
        // needed for reconstructing path and returning best distance
        this.previous_cities = previous_cities;
        this.shortestDistance = distances_from_source[destination];
    }

    public double shortestDistance() {
        return shortestDistance;
    }

    public List<Integer> shortestPath() {
        List<Integer> path = new ArrayList<>();

        // reverse construct path, starting from destination (last index of previous_cities)
        // constructing path by adding best previous city to path until source is reached
        path.add(destination);
        for (int i = destination;i < previous_cities.length; i--) {
            path.add(previous_cities[i]);
            if (previous_cities[i] == source) break;
        }

        // reverse path, so that path starts from source instead of destination
        Collections.reverse(path);
        return path;
    }

}

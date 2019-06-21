package Dijkstra;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class DijkstraShortestPath {
    Graph graph;
    City source, destination;
    int cities;

    public DijkstraShortestPath(Graph graph, int cities) {
        this.graph = graph;
        this.cities = cities;
    }

    public void sourceDestination(City source, City destination){
        this.source = source;
        this.destination = destination;
    }

    public void shortestDistance() {
        // create empty list for visited cities
        boolean[] visited_cities = new boolean[cities];
        // create empty list for shortest distance from source to every city
        int [] distances_from_source = new int[cities];
        // create comparator to compare city distances
        DistanceComparator comparator = new DistanceComparator();
        // create priority queue with pairs of city id and distance (from source)
        PriorityQueue<Pair<City, Integer>> queue = new PriorityQueue<>(cities, comparator);
        // add infinity distances
        Arrays.fill(distances_from_source, Integer.MAX_VALUE);
        distances_from_source[0] = 0;
        // add first starting city pair
        Pair<City, Integer> p0 = new Pair<>(source, distances_from_source[0]);
        queue.offer(p0);


        while(!queue.isEmpty()){

            Pair<City, Integer> extractedPair = queue.poll();


            City extractedCity = extractedPair.getKey();
            if(!visited_cities[extractedCity.id]) {
                visited_cities[extractedCity.id] = true;

                LinkedList<Connection> list = graph.adjacencylist[extractedCity.id];
                for (int i = 0; i < list.size(); i++) {
                    Connection connection = list.get(i);
                    City destination = connection.destination;
                    if (!visited_cities[destination.id]) {
                        int bestDistance =  distances_from_source[extractedCity.id] + connection.distance;
                        int currentDistance = distances_from_source[destination.id];
                        if(currentDistance>bestDistance){
                            Pair<City, Integer> p = new Pair<>(destination, bestDistance);
                            queue.offer(p);
                            distances_from_source[destination.id] = bestDistance;
                        }
                    }
                }
            }
            if (extractedCity.id == destination.id) {
                break;
            }
        }
    }
}

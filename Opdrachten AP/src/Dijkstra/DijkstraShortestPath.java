package Dijkstra;

import javafx.util.Pair;
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
        boolean[] visited = new boolean[cities];
        // create empty list for shortest distance from source to every city
        int [] distances = new int[cities];
        // create comparator to compare city distances
        CityComparator comparator = new CityComparator();
        // create priority queue with pairs of city id and distance (from source)
        PriorityQueue<Pair<City, Integer>> pq = new PriorityQueue(cities, comparator);
        // add infinity distances
        distances[0] = 0;
        for (int i = 1; i <cities ; i++) {
            distances[i] = Integer.MAX_VALUE;
        }

        // add first starting city pair
        Pair<City, Integer> p0 = new Pair<>(source, distances[0]);
        pq.offer(p0);


        while(!pq.isEmpty()){

            Pair<City, Integer> extractedPair = pq.poll();

            City extractedCity = extractedPair.getKey();
            if(!visited[extractedCity.id]) {
                visited[extractedCity.id] = true;

                LinkedList<Connection> list = graph.adjacencylist[extractedCity.id];
                for (int i = 0; i < list.size(); i++) {
                    Connection connection = list.get(i);
                    City destination = connection.destination;
                    if (!visited[destination.id]) {
                        int newDistance =  distances[extractedCity.id] + connection.distance;
                        int currentDistance = distances[destination.id];
                        if(currentDistance>newDistance){
                            Pair<City, Integer> p = new Pair<>(destination, newDistance);
                            pq.offer(p);
                            distances[destination.id] = newDistance;
                        }
                    }
                }
            }
            if (extractedCity.id == destination.id) {
                System.out.println(distances[destination.id]);
                break;
            }
        }
    }
}

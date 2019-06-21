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
        int [] distance = new int[cities];
        // create comparator to compare city distances
        CityComparator comparator = new CityComparator();
        // create priority queue with pairs of city id and distance (from source)
        PriorityQueue<Pair<Integer, Integer>> pq = new PriorityQueue(cities, comparator);
        // add infinity distances
        for (int i = 0; i <cities ; i++) {
            distance[i] = Integer.MAX_VALUE;
        }

        // add first starting city
        Pair<Integer, Integer> p0 = new Pair<>(distance[0], 0);
        pq.offer(p0);


        //while priority queue is not empty
        while(!pq.isEmpty()){
            // get the minimum
            Pair<Integer, Integer> extractedPair = pq.poll();

            // extracted city
            Integer extractedCity = extractedPair.getValue();
            if(!visited[extractedCity]) {
                visited[extractedCity] = true;

                // iterate through all the adjacent vertices and update the keys
                LinkedList<Connection> list = graph.adjacencylist[extractedCity];
                for (int i = 0; i < list.size(); i++) {
                    Connection connection = list.get(i);
                    Integer destination = connection.destination.id;
                    // only if edge destination is not present in mst
                    if (!visited[destination]) {
                        // check if distance needs an update or not
                        // means check total weight from source to vertex_V is less than
                        // the current distance value, if yes then update the distance
                        int newKey =  distance[extractedCity] + connection.distance;
                        int currentKey = distance[destination];
                        if(currentKey>newKey){
                            Pair<Integer, Integer> p = new Pair<>(newKey, destination);
                            pq.offer(p);
                            distance[destination] = newKey;
                        }
                    }
                }
            }
        }
        shortestPath(distance, source);
    }

    public void shortestPath(int[] distance, City sourceVertex){
        System.out.println("Dijkstra Algorithm: (Adjacency List + Priority Queue)");
        for (int i = 0; i <cities ; i++) {
            System.out.println("Source Vertex: " + sourceVertex.name + " to vertex " +   + i +
                    " distance: " + distance[i]);
        }
    }

}

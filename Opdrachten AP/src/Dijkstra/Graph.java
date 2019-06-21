package Dijkstra;

import java.util.LinkedList;

public class Graph {
    int cities;
    LinkedList<Connection>[] adjacencylist;

    public Graph(int cities) {
        this.cities = cities;
        this.adjacencylist = new LinkedList[cities];

        //create adjacency lists for all the cities
        for (int i = 0; i < cities; i++) {
            adjacencylist[i] = new LinkedList<>();
        }
    }

    public void addConnection(City source, City destination, int weight) {
        // add connection source to destination
        Connection source_destination = new Connection(source, destination, weight);
        adjacencylist[source.id].addFirst(source_destination);

        // add connection destination to source
        Connection destination_source = new Connection(destination, source, weight);
        adjacencylist[destination.id].addFirst(destination_source);
    }

}

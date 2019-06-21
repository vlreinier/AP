package DijkstraAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    List<List<Connection>> graph;

    public Graph(int cities) {
        graph = new ArrayList<>();
        for (int i = 0; i < cities; i++) {
            graph.add(new ArrayList<>());
        }
    }

    public void addConnection(int from, int to, double distance) {
        graph.get(from).add(new Connection(from, to, distance));
    }

}

package DijkstraAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class ConnectionsGraph {
    List<List<CityConnection>> graph;

    /**
     * @param cities
     *
     * class creates empty graph for city connections and adds needed connections
     *
     */

    public ConnectionsGraph(int cities) {
        graph = new ArrayList<>();
        for (int i = 0; i < cities; i++) {
            graph.add(new ArrayList<>());
        }
    }

    public void addConnection(int from, int to, double distance) {
        // adds city connecting to graph
        graph.get(from).add(new CityConnection(from, to, distance));
    }

}

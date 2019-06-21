package Opd26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Node {
    String name;
    Map<Node,Double> map = new HashMap<>();

    public Node(String name) {
        this.name = name;
    }

    public void relation(Node node, double relation) {
        map.put(node, relation);
    }

    public String getName() {
        return name;
    }

    public Node getNextNode() {
        if (map.size() == 0){ // no relations found returns null
            return null;
        }
        else {
            // because all relations have the same value 0.5, i just randomly pick one City
            Random random = new Random();
            int index = random.nextInt(map.size());
            ArrayList<Node> nodes = new ArrayList<>();
            for (Map.Entry<Node, Double> entry : map.entrySet()) {
                nodes.add(entry.getKey()); // add all existing relations (min 2) to list 'nodes'
            }
            return nodes.get(index); // return randomly node from list 'nodes'
        }
    }
}


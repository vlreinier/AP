package Opd24;

import java.util.HashMap;
import java.util.Map;

public class Node {
    String name;
    Map<Node,Character> map = new HashMap<>();

    public Node(String name) {
        this.name = name;
    }

    public void relation(Node node, Character relation) {
        map.put(node, relation);
    }

    public String getName() {
        return name;
    }

    public Node getNextNode(Character character) {
        for (Map.Entry<Node,Character> entry : map.entrySet()) {
            if (character.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
}

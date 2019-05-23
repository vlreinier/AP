package Opd24;

import java.util.HashMap;
import java.util.Map;

public class Node {
    String name;
    Map<Character, Node> map = new HashMap<>();

    public Node(String name) {
        this.name = name;
    }

    public void relation(Node node, Character relation) {
        map.put(relation, node);
    }

    public String getName() {
        return name;
    }

    public Node getFirstRelation(Character character) {
        return map.get(character);
    }
}

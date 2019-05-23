package Opd24;

import java.util.LinkedHashMap;
import java.util.Map;

public class Node {
    String name;
    LinkedHashMap<Character, Node> map = new LinkedHashMap<>();

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

    public Map<Character, Node> getMap() {
        return map;
    }
}

package Dijkstra;

import javafx.util.Pair;
import java.util.Comparator;

public class CityComparator implements Comparator<Pair<City, Integer>> {

    public int compare(Pair<City, Integer> p1, Pair<City, Integer> p2) {

        int key1 = p1.getValue();
        int key2 = p2.getValue();

        return key1-key2;
    }
}

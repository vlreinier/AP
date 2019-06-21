package Dijkstra;

import javafx.util.Pair;
import java.util.Comparator;

public class CityComparator implements Comparator<Pair<Integer, Integer>> {

    public int compare(Pair<Integer, Integer> p1, Pair<Integer, Integer> p2) {

        //sort using distance values
        int key1 = p1.getKey();
        int key2 = p2.getKey();

        return key1-key2;
    }
}

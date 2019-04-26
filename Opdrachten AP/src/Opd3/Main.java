package Opd3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // creating list size x with random boolean
        List<Boolean> arr = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < 20; i++) {
            arr.add(random.nextBoolean());
        }

        // counting false true occurrence
        int count_false = 0;
        int count_true = 0;
        for(int i = 0; i < arr.size(); i++) {
            if (arr.get(i))
                count_true += 1;
            else
                count_false += 1;
        }

        // check outcome
        String outcome = "Lijst voldoet aan alle eisen";
        if (count_false >= count_true || count_false > 12){
            outcome = "Lijst voldoet niet aan alle eisen";
        }

        // print arraylist and outcome
        System.out.println(arr);
        System.out.println(outcome);
    }

}

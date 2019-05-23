package Opd24;
import java.util.ArrayList;


public class Machine {

    public static void showSteps(String sequence, Node start){
        ArrayList<String> output = new ArrayList<String>(); // create empty output list for seen nodes
        Node node = start; // set first starting node
        output.add(node.getName()); // add first starting node to output

        for (int i = 0; i < sequence.length(); i++){
            Node nextNode = node.getNextNode(sequence.charAt(i)); // returns next node if characters match

            if (nextNode == null){ // returns null if relation is not present
                output.add("X");
                break; // stop program if next relation is not present
            } else {
                output.add(nextNode.getName()); // add to output list
            }
            node = nextNode; // set current next node as starting node for next iteration
        }

        System.out.println(output);
    }
}

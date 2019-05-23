package Opd24;
import java.util.ArrayList;


public class Machine {

    public static void showSteps(String sequence, Node start){
        ArrayList<String> output = new ArrayList<String>(); // create empty output list for seen nodes
        Node node = start; // set first starting node
        output.add(node.getName()); // add first starting node to output

        for (int i = 0; i < sequence.length(); i++){
            Character character = sequence.charAt(i);
            Node nextNode = node.getNextNode(character); // returns next node with corresponding char as relation

            if (nextNode == null){ // if no relation is available getNextNode returns null
                output.add("X");
                System.out.println("Er is geen relatie naar een volgende node gevonden voor karakter " + character);
                break; // stop program if next relation can not be found
            } else {
                output.add(nextNode.getName()); // add to output list
            }

            node = nextNode; // set current next node as starting node for next iteration
        }

        System.out.println(output);
    }
}

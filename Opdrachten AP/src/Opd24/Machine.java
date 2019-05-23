package Opd24;
import java.util.ArrayList;


public class Machine {

    public static void showSteps(String sequence, Node start){
        ArrayList<String> output = new ArrayList<String>();
        Node node = start;
        output.add(node.getName());

        for (int i = 0; i < sequence.length(); i++){
            Node nextNode = node.getNextNode(sequence.charAt(i));

            if (nextNode == null){
                output.add("X");
                System.out.println("Er is geen relatie naar een volgende node gevonden voor karakter " + sequence.charAt(i));
                break;
            } else {
                output.add(nextNode.getName());
            }

            node = nextNode;
        }
        System.out.println(output);

    }
}

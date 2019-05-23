package Opd24;
import sun.rmi.transport.proxy.CGIHandler;

import java.util.ArrayList;
import java.util.Map;

public class Machine {
    Node s0, s1 ,s2, s3;
    ArrayList<String> output = new ArrayList<String>();

    public Machine(){
        s0 = new Node("s0");
        s1 = new Node("s1");
        s2 = new Node("s2");
        s3 = new Node("s3");

        s0.relation(s1, 'B');
        s0.relation(s2, 'A');
        s0.relation(s3, 'B');
        s1.relation(s0, 'B');
        s1.relation(s2, 'B');
        s1.relation(s1, 'A');
        s2.relation(s0, 'A');
        s2.relation(s1, 'B');
        s2.relation(s3, 'B');
        s3.relation(s0, 'B');
        s3.relation(s2, 'B');
        s3.relation(s3, 'A');
    }


    public void showSteps(String sequence){
        Node node = s0;
        output.add(node.getName());

        for (int i = 0; i < sequence.length(); i++){
            Node relation = node.getFirstRelation(sequence.charAt(i));

            if (relation == null){
                output.add("X");
                System.out.println("Er is geen relatie naar een volgende node gevonden voor karakter " + sequence.charAt(i));
                break;
            } else {
                output.add(relation.getName());
            }

            node = relation;
        }
        System.out.println(output);

    }
}

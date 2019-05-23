package Opd24;

public class Main {
    public static void main(String[] arg) {
        // create nodes
        Node s0 = new Node("s0");
        Node s1 = new Node("s1");
        Node s2 = new Node("s2");
        Node s3 = new Node("s3");

        // set relations between nodes
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

        // print path
        Machine.showSteps("BAAB", s0); // sequence and starting node
    }
}

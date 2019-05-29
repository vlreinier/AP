package Opd25;

public class Dtmc {
    public static void showPath(){
        Node node = createDtmc(); // setup dtmc and get starting node
        while (true) {
            Node nextNode = node.getNextNode();
            if (nextNode == null){
                System.out.println("Dice output: "+ node.getName());
                break;
            }
            System.out.print(node.getName() + " -> ");
            node = nextNode;
        }
    }

    public static Node createDtmc(){
        // create nodes and endpoints (also nodes)
        Node n0 = new Node("0"); Node n1 = new Node("1");
        Node n2 = new Node("2"); Node n3 = new Node("3");
        Node n4 = new Node("4"); Node n5 = new Node("5");
        Node n6 = new Node("6"); Node d1 = new Node("1");
        Node d2 = new Node("2"); Node d3 = new Node("3");
        Node d4 = new Node("4"); Node d5 = new Node("5");
        Node d6 = new Node("6");

        // set relation between nodes
        n0.relation(n1, 0.5); n0.relation(n2, 0.5);
        n1.relation(n3, 0.5); n1.relation(n4, 0.5);
        n2.relation(n5, 0.5); n2.relation(n6, 0.5);
        n3.relation(n1, 0.5); n3.relation(d1, 0.5);
        n4.relation(d2, 0.5); n4.relation(d3, 0.5);
        n5.relation(d4, 0.5); n5.relation(d5, 0.5);
        n6.relation(n2, 0.5); n6.relation(d6, 0.5);

        return n0; // return starting node
    }
}

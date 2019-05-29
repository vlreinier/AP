package Opd26;

public class Main {
    public static void main(String[] arg) {
        Dtmc dtmc = new Dtmc(); // setup dtmc and get starting node

        System.out.println("With 8 sided dice:");
        for (int i=0;i<3;i++) {
            dtmc.rollDice(); // print path and output
        }
    }
}

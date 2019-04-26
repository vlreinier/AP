package Opd4;

import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner user_input = new Scanner(System.in);
        System.out.println("Hoe groot?");
        int size = user_input.nextInt();

        for (int i=0; i < size; i++) {
            String line = "";
            for (int j=0; j < size; j++) {
                line += " *";
            }
            System.out.println(line);
        }
    }
}
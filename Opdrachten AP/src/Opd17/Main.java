package Opd17;

import java.time.LocalDate;

public class Main {
    public static void main(String[] arg) {
        int release1 = LocalDate.now().getYear() - 1; // 1 jaar geleden
        int release2 = LocalDate.now().getYear() - 2; // 2 jaar geleden

        Game g1 = new Game("Just Cause 3", release1, 49.98);
        Game g2 = new Game("Need for Speed: Rivals", release2, 45.99);
        Game g3 = new Game("Need for Speed: Rivals", release2, 45.99);

        Person eric = new Person("Eric",200);
        Person hans = new Person("Hans", 55);
        Person arno = new Person("Arno", 185);

        System.out.println("Eric kan G1 kopen: " + eric.buyGame(g1));
        System.out.println("Eric kan G2 kopen: " + eric.buyGame(g2));
        System.out.println("Eric kan G3 kopen: " + eric.buyGame(g3));
        System.out.println("Hans kan G2 kopen: " + hans.buyGame(g2));
        System.out.println("Hans kan G1 kopen: " + hans.buyGame(g1));
        System.out.println("Arno kan G3 kopen: " + arno.buyGame(g3));
        System.out.println();

        System.out.println(eric.toString());
        System.out.println(hans.toString());
        System.out.println(arno.toString());

        System.out.println("Arno kan G1 kopen van Eric: " + eric.sellGame(g1, arno));
        System.out.println("Arno kan G2 kopen van Hans: " + hans.sellGame(g2, arno));
        System.out.println("Aric kan G1 kopen van Hans: " + hans.sellGame(g1, eric));
        System.out.println();

        System.out.println(eric.toString());
        System.out.println(hans.toString());
        System.out.println(arno.toString());

    }
}

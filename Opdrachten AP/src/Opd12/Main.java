package Opd12;

public class Main {
    public static void main(String[] arg) {
        Pool z1 = new Pool(2.0, 5.5, 1.5);
        System.out.println("LENGTE: " + z1.getLength());
        System.out.println("HOOGTE: " + z1.getHeight());
        System.out.println("DIEPTE: " + z1.getDepth());
        System.out.println("BEREKENDE INHOUD: " + z1.getVolume());

        Pool z2 = new Pool();
        z2.setLength(2.5);
        z2.setHeight(100.0);
        z2.setDepth(2.0);
        System.out.println("GEGEVENS ZWEMBAD: " + z2.toString());
        System.out.println("BEREKENDE INHOUD: " + z2.getVolume());

    }
}

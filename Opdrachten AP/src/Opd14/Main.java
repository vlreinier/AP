package Opd14;

public class Main {
    public static void main(String[] arg) {
        House h1 = new House("Nijenoord 1", 1970);
        House h2 = new House("Vredenburg", 1991);

        Person p1 = new Person("Ronald Plasterk", 52);
        Person p2 = new Person("Annie Brouwers", 59);

        h1.setLandLord(p1);
        h2.setLandLord(p2);

        System.out.println(h1.to_String());
        System.out.println(h2.to_String());

        System.out.println("Huisbaas 1: "+ p1.to_String());
        System.out.println("Huisbaas 2: "+ p2.to_String());
    }
}

package Opd2;

public class Main {
    public static void main(String[] args) {
        String prefix = "A";
        String full_string = "Appel";
        String result = prefix + " is de prefix van Appel";
        for (int i = 0; i < prefix.length(); i++) {
            if (prefix.charAt(i) != full_string.charAt(i)) {
                result = prefix + " is niet de prefix van Appel";
            }
        }
        System.out.println(result);
    }

}


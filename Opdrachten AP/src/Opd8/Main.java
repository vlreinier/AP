package Opd8;

public class Main {
    public static void main(String[] arg) {
        int n = 5;
        int i,j;
        for (i = 0; i < n; i++) {
            for(j= n-i ; j > 0; j--) {
                System.out.print(" ");
            }
            for(j=0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = 0; i < n; i++) {
            for(j=0; j < i; j++) {
                System.out.print(" ");
            }
            for(j= n-i ; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


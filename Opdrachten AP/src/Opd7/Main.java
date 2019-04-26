package Opd7;

/**
 * findGCD(900,280)
 * findGCD(620,280)
 * findGCD(340,280)
 * findGCD(60,280)
 * findGCD(60,220)
 * findGCD(60,160)
 * findGCD(60,100)
 * findGCD(60,40)
 * findGCD(20,40)
 * findGCD(20,20)
 * Code wordt 10 keer uitgevoerd
 */

public class Main {
    public static void main(String[] arg) {
        System.out.print(findGCD(900,280));
    }

    public static int findGCD(int a, int b){
        if( a == b)
            return a;
        else if( a>b )
            return findGCD(a-b, b);
        else
            return findGCD(a, b-a);
    }
}

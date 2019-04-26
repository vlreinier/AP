package Opd6;

/**
 * As example I use 5 rabbits:
 * First check if rabbits are 1 or less and return rabbits * 2
 * This ensures that 0 rabbits returns 0 ears and 1 rabbit returns 2 ears.
 * If there is more than 1 rabbit:
 * rabbits is bigger than 1 so:
 * 2 + (5-1=4)
 * rabbits is bigger than 1 so:
 * 4 + (4-1=3)
 * rabbits is bigger than 1 so:
 * 6 + (3-1=2)
 * rabbits is bigger than 1 so:
 * 8 + (2-1=1)
 * rabbits is not bigger than 1 so recursion ends with return:
 * 8 + (2 * 1 = 2) = 8 + 2 = 10
 *
 * This recursive method returns total ears of given n rabbits.
 */

public class Main {
    public static void main(String[] arg) {
        System.out.print(ears(10));
    }
    public static int ears(int n_rabbits){
        System.out.println(n_rabbits);
        if(n_rabbits <= 1)
            return n_rabbits * 2;
        else
            return 2 + ears(n_rabbits-1);
    }
}

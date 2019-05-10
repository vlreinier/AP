package Opd5;

public class Main {
    public static void main(String[] arg) {
        fibonacci_sequence(1);
    }

    public static void fibonacci_sequence(int sequencelength) {
        int first = 0;
        int second = 1;

        if (sequencelength <= 0){
            System.out.println("Retry with higher numbers");
        }else if(sequencelength == 1) {
            System.out.println(first);
        }else {
            for (int i=0; i < sequencelength; i++){
                int third = first + second;
                System.out.println(first);
                first = second;
                second = third;
            }
        }
    }
}


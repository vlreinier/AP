package Opd9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] arg) {
        // Voorbeeld matrix
        int[][] matrix = {  {20, 18, 22, 20},
                            {18, 20, 18, 21},
                            {16, 18, 16, 20},
                            {25, 24, 22, 24}};
        int[][] matrix2 = new int[matrix.length][matrix.length];

        // nieuwe matrix met getransponeerde diagonaal maken
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++)
                matrix2[j][i] = matrix[i][j];
        }

        // Alleen voor het printen omgezette matrix
        for(int i = 0; i < matrix2.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix2[i].length; j++)
                System.out.print(" " + matrix2[i][j]);
            System.out.print(" ");
        }
    }
}

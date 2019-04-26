package Opd10;

public class Main {
    public static void main(String[] arg) {
        int i, j, h, sum = 0;
        int[][] matrix = {{1, 2, 3, 4},
                {4, 5, 6, 7}};
        int[][] matrix2 = {{7, 8},
                {9, 10},
                {11, 12},
                {13, 14}};
        int[][] newone = new int[matrix.length][matrix.length];

        // Check if multiplication is possible
        if (matrix[0].length != matrix2.length){
            System.out.println("Matrix multiplicatie niet mogelijk");
        }else{
            for (i = 0; i < matrix.length; i++) {
                for (j = 0; j < matrix2[i].length; j++) {
                    sum = 0;
                    for (h = 0; h < matrix2.length; h++) {
                        sum = sum + matrix[i][h] * matrix2[h][j];
                    }
                    newone[i][j] = sum;
                }
            }
            // Printen omgezette matrix
            for (i = 0; i < newone.length; i++) {
                for (j = 0; j < newone[i].length; j++)
                    System.out.print(newone[i][j] + " | ");
                System.out.println();
            }
        }
    }
}

package Q1_Arrays_and_Strings.Q1_8_ZeroMatrix;

public class Solution2 {
    public static void zeroMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return;
        boolean rowHasZero = false;
        boolean columnHasZero = false;

        int m = matrix.length;
        int n = matrix[0].length;

        //check if the first column has zero
        for (int i = 0; i < m; i++)  {
            if(matrix[i][0] == 0) {
                columnHasZero = true;
                break;
            }
        }

        for (int i = 0; i < n; i++)  {
            if(matrix[0][i] == 0) {
                rowHasZero = true;
                break;
            }
        }

        for(int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for( int i = 1; i < m; i++) {
            if (matrix[i][0] == 0) nullifyRow(matrix, i);
        }

        for( int i = 1; i < n; i++) {
            if (matrix[0][i] == 0) nullifyColumn(matrix, i);
        }

        if(rowHasZero) nullifyRow(matrix, 0);
        if(columnHasZero) nullifyColumn(matrix, 0);
    }

    public static void nullifyColumn(int[][] matrix, int column) {
        for(int i = 0; i < matrix.length; i++){
            matrix[i][column] = 0;
        }
    }

    public static void nullifyRow(int[][] matrix, int row) {
        if (matrix.length == 0) return;

        for(int i = 0; i < matrix[0].length; i++){
            matrix[row][i] = 0;
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] x : matrix) {
            for (int y : x) {
                System.out.print(y);
                System.out.print(" ");
            }
           
           System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 0, 2}, {0, 4, 4}, {3, 6, 9} };
        printMatrix(matrix);
        zeroMatrix(matrix);
        System.out.println();
        printMatrix(matrix);
    }
}

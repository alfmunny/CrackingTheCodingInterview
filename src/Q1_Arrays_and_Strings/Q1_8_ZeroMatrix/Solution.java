public class Solution {
    public static void zeroMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return;

        boolean[] rowHasZero = new boolean[matrix.length];
        boolean[] columnHasZero = new boolean[matrix[0].length];

        int m = matrix.length;
        int n = matrix[0].length;

        int[][] newMatrix = copyMatrix(matrix);

        for(int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0){
                    rowHasZero[i] = true;
                    columnHasZero[j] = true;
                }
            }

        }

        for( int i = 0; i < m; i++) {
            if (rowHasZero[i]) nullifyRow(matrix, i);
        }

        for( int i = 0; i < n; i++) {
            if (columnHasZero[i]) nullifyColumn(matrix, i);
        }

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

    public static int[][] copyMatrix(int[][] matrix) {

        if (matrix.length == 0) return new int[0][0];
        if (matrix[0].length == 0) return new int[1][0];

        int m = matrix.length;
        int n = matrix[0].length;

        int[][] res = new int[m][n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                res[i][j] = matrix[i][j];
            }
        }

        return res;
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
        int[][] matrix = { { 1, 2, 0}, {0, 4, 6}, {3, 6, 9} };
        printMatrix(matrix);
        zeroMatrix(matrix);
        System.out.println();
        printMatrix(matrix);
    }
}

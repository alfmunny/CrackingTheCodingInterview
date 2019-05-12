package Q1_Arrays_and_Strings.Q1_7_RotateMatrix;

public class Solution {
    public static void rotateMatrix(int[][] matrix) {
        int dim = matrix.length;
        int tmp = 0;

        for ( int level = 0; level < dim / 2; level++) {

            int first = level;
            int last = dim - first - 1;
            
            for ( int i = first; i < last; i++) {
                int offset = i - first;
                tmp = matrix[first][i];
                matrix[first][i] = matrix[last - offset][first];
                matrix[last - offset][first] = matrix[last][last - offset];
                matrix[last][last - offset] = matrix[i][last];
                matrix[i][last] = tmp;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for ( int[] m : matrix) {
            for ( int n : m) {
             System.out.print(n);
             System.out.print(' ');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 }, { 11, 12 ,13, 14 }, {21, 22, 23, 24}, {31, 32, 33,34} };
        printMatrix(matrix);
        System.out.println();
        rotateMatrix(matrix);
        printMatrix(matrix);
    }
}

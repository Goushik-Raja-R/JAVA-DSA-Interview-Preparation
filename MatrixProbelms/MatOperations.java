import java.util.Arrays;
import java.util.Scanner;

public class MatOperations {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the row Size: ");
        int n = s.nextInt();
        System.out.print("Enter the column Size: ");
        int m = s.nextInt();

        int[][] matrix = new int[n][m];
        int[][] matrix1 = new int[n][m];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                matrix[row][col] = s.nextInt();
            }
        }

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                matrix1[row][col] = s.nextInt();
            }
        }

        int[][] ans = MatrixAddition(matrix, matrix1);
        // int[][] ans = MatrixSubraction(matrix, matrix1);
        // int[][] ans = MatrixMultiplication(matrix, matrix1);
        // int[][] ans = MatrixDivisiom(matrix, matrix1);

        for (int[] num : ans) {
            System.out.println(Arrays.toString(num));
        }
        s.close();
    }

    public static int[][] MatrixAddition(int[][] matrix, int[][] matrix1) {

        int[][] ans = new int[matrix.length][matrix.length];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                ans[row][col] = ((matrix[row][col]) + (matrix1[row][col]));
            }
        }
        return ans;

    }

    public static int[][] MatrixSubraction(int[][] matrix, int[][] matrix1) {

        int[][] ans = new int[matrix.length][matrix.length];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                ans[row][col] = ((matrix[row][col]) + (matrix1[row][col]));
            }
        }
        return ans;

    }

    public static int[][] MatrixMultiplication(int[][] matrix, int[][] matrix1) {

        int[][] ans = new int[matrix.length][matrix.length];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                ans[row][col] = ((matrix[row][col]) + (matrix1[row][col]));
            }
        }
        return ans;

    }

    public static int[][] MatrixDivisiom(int[][] matrix, int[][] matrix1) {

        int[][] ans = new int[matrix.length][matrix.length];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                ans[row][col] = ((matrix[row][col]) + (matrix1[row][col]));
            }
        }
        return ans;

    }
}
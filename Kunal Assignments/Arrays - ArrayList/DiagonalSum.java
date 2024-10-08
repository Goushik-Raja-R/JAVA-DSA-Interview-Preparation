import java.util.Scanner;

// 1572. Matrix Diagonal Sum : https://leetcode.com/problems/matrix-diagonal-sum/description/

public class DiagonalSum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter row size: ");
        int n = s.nextInt();
        System.out.print("Enter col size: ");
        int m = s.nextInt();

        int[][] matrix = new int[n][m];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++)
                matrix[row][col] = s.nextInt();
        }

        int ans = diagonalSum(matrix);
        System.out.println(ans);

        s.close();
    }

    public static int diagonalSum(int[][] matrix) {

        int ans = 0;
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if ((row == col)) {
                    sum = sum + matrix[row][col];
                }
                if (col == (matrix.length - 1) - row) {
                    sum = sum + matrix[row][col];
                }
            }
        }
        if (matrix.length % 2 != 0) {
            ans = matrix.length / 2;
            return sum - matrix[ans][ans];
        }
        return sum;
    }
}

import java.util.Arrays;
import java.util.Scanner;

// 867. Transpose Matrix : https://leetcode.com/problems/transpose-matrix/description/

public class TransposeMatrix {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Row Size: ");
        int n = s.nextInt();
        System.out.print("Enter column Size: ");
        int m = s.nextInt();

        int[][] matrix = new int[n][m];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = s.nextInt();
            }
        }

        int[][] ans = transpose(matrix);

        for (int[] num : ans) {
            System.out.println(Arrays.toString(num));
        }
    }

    public static int[][] transpose(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[][] ans = new int[c][r];

        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                ans[col][row] = matrix[row][col];
            }
        }

        return ans;
    }
}

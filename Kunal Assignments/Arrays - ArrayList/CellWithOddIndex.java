import java.util.Arrays;
import java.util.Scanner;
// 1252. Cells with Odd Values in a Matrix : https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/description/

public class CellWithOddIndex {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the row size: ");
        int row1 = s.nextInt();
        System.out.print("Enter the column size: ");
        int col1 = s.nextInt();

        int[][] indices = new int[row1][col1];

        for (int row = 0; row < row1; row++) {
            for (int col = 0; col < col1; col++) {
                indices[row][col] = s.nextInt();
            }
        }

        System.out.print("Enter the row size New Array: ");
        int m = s.nextInt();
        System.out.print("Enter the column size New Array: ");
        int n = s.nextInt();

        int ans = oddCells(m, n, indices);
        System.out.println(ans);
        s.close();
    }

    public static int oddCells(int m, int n, int[][] indices) {

        int[][] ans = new int[m][n];

        // for (int i = 0; i < indices.length; i++) {
        // int len = indices[i][0];
        // System.out.println(len + "hjg");
        // for (int row = len; row <= len; row++) {
        // for (int col = 0; col < n; col++) {
        // ans[row][col]++;
        // }
        // }

        // for (int j = 0; j < indices.length; j++) {
        // if (j > 0) {
        // int col1 = indices[i][j];
        // System.out.println(col1 + "kwjd");

        // for (int row = 0; row < m; row++) {
        // for (int col = 0; col < n; col++) {
        // if (col == col1)
        // ans[row][col]++;
        // }
        // }
        // }
        // }
        // }

        for (int[] num : indices) {
            int row = num[0];
            int col = num[1];

            for (int j = 0; j < n; j++)
                ans[row][j]++;

            for (int i = 0; i < m; i++)
                ans[i][col]++;
        }

        int count = 0;

        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (ans[row][col] % 2 != 0) {
                    count++;
                }
            }
        }

        return count;
    }
}
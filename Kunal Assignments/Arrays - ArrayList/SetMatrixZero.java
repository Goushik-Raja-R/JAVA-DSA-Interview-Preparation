import java.util.Scanner;
import java.util.Arrays;

// 73. Set Matrix Zeroes: https://leetcode.com/problems/set-matrix-zeroes/description/

public class SetMatrixZero {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the row size: ");
        int n = s.nextInt();
        System.out.print("Enter column size: ");
        int m = s.nextInt();

        int[][] arr = new int[n][m];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                arr[row][col] = s.nextInt();
            }
        }

        int[][] ans = setZeroes(arr);

        for (int[] num : ans) {
            System.out.println(Arrays.toString(num));
        }
    }

    public static int[][] setZeroes(int[][] arr) {

        int len = arr.length;
        int len1 = arr[0].length;

        int[][] ans = new int[len][len1];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                ans[row][col] = arr[row][col];
            }
        }

        for (int row = 0; row < ans.length; row++) {
            for (int col = 0; col < ans[row].length; col++) {
                if (ans[row][col] == 0) {
                    arr = SetMatrizIntoZero(row, col, arr);
                }
            }
        }

        return arr;
    }

    public static int[][] SetMatrizIntoZero(int row, int col, int[][] arr) {

        for (int i = 0; i < arr[row].length; i++) {
            arr[row][i] = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i][col] = 0;
        }

        return arr;
    }
}

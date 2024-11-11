import java.util.Arrays;
import java.util.Scanner;

// 566. Reshape the Matrix : https://leetcode.com/problems/reshape-the-matrix/description/

public class ReshapeMatrix {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter row size: ");
        int n = s.nextInt();
        System.out.print("Enter col size: ");
        int m = s.nextInt();

        int[][] arr = new int[n][m];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                arr[row][col] = s.nextInt();
            }
        }

        System.out.print("Enter the row size you want: ");
        int row1 = s.nextInt();
        System.out.print("Enter col size you want: ");
        int col1 = s.nextInt();

        int[][] ans = MatrixReshape(arr, row1, col1);

        for (int[] num : ans) {
            System.out.println(Arrays.toString(num));
        }
    }

    public static int[][] MatrixReshape(int[][] arr, int row1, int col1) {

        int[][] ans = new int[row1][col1];
        int rows = arr.length;
        int cols = arr[0].length;

        int[] res = new int[rows * cols];
        int k = 0;

        if ((rows * cols) != (row1 * col1)) {
            return arr;
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                res[k] = arr[row][col];
                k++;
            }
        }

        k = 0;

        for (int row = 0; row < row1; row++) {
            for (int col = 0; col < col1; col++) {
                ans[row][col] = res[k];
                k++;
            }
        }

        return ans;
    }
}

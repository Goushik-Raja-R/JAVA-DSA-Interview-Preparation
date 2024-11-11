import java.util.ArrayList;
import java.util.Scanner;

// 54. Spiral Matrix : https://leetcode.com/problems/spiral-matrix/description/


public class SpiralMatrix {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the row size: ");
        int n = s.nextInt();
        System.out.print("Enter col size: ");
        int m = s.nextInt();

        int[][] arr = new int[n][m];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                arr[row][col] = s.nextInt();
            }
        }

        // int[] ans = spiralOrder(arr);

        ArrayList<Integer> aa = spiralOrder(arr);

        System.out.println(aa);
    }

    public static ArrayList<Integer> spiralOrder(int[][] arr) {

        int left = 0, top = 0, right = arr[0].length - 1, bottom = arr.length - 1;

        ArrayList<Integer> list = new ArrayList<>();

        while (left <= right && top <= bottom) {

            for (int i = left; i <= right; i++) {
                list.add(arr[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                list.add(arr[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(arr[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(arr[left][i]);
                }
                left++;
            }
        }

        return list;
    }
}

import java.util.Arrays;

// 74. Search a 2D Matrix: https://leetcode.com/problems/search-a-2d-matrix/description/

public class TwoDSearch {
    public static void main(String[] args) {
        int[][] arr = {
                { 10, 20, 30, 40 },
                { 11, 25, 35, 45 },
                { 28, 29, 37, 49 },
                { 33, 34, 38, 50 }
        };

        int target = 33;

        System.out.println(Arrays.toString(Search(arr, target)));
    }

    public static int[] Search(int[][] arr, int target) {

        int row = 0;
        int col = arr[row].length - 1;

        while (row < arr.length && col >= 0) {

            if (arr[row][col] == target) {
                return new int[] { row, col };
            }
            if (target > arr[row][col]) {
                row++;
            } else {
                col--;
            }
        }

        return new int[] { -1, -1 };
    }
}
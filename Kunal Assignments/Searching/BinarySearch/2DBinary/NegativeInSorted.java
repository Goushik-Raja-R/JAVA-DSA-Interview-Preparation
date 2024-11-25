// 1351. Count Negative Numbers in a Sorted Matrix: https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/

public class NegativeInSorted {
    public static void main(String[] args) {
        int[][] arr = {
                { 4, 3, 2, -1 },
                { 3, 2, 1, -1 },
                { 1, 1, -1, -2 },
                { -1, -1, -2, -3 }
                // { 5, 1, 0 },
                // { -5, -5, -5 }
        };

        System.out.println((SearchInSorted(arr)));
    }

    public static int SearchInSorted(int[][] arr) {

        int row = arr.length - 1;
        int col = 0;
        int count = 0;

        while (row >= 0 && col < arr[row].length) {

            if (arr[row][col] < 0) {
                count += arr[row].length - col;
                row--;
            } else {
                col++;
            }
        }
        return count;
    }
}

import java.util.Arrays;

public class SortedSearchInTD {

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        int target = 22;

        int[] ans = StriverSearch(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] StriverSearch(int[][] arr, int target) {

        int start = 0;
        int end = (arr.length * arr[0].length) - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            int row = mid / 4;
            int col = mid % 4;

            if (arr[row][col] == target) {
                return new int[] { row, col };
            }

            else if (arr[row][col] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return new int[] { -1, -1 };
    }

    // public static int[] Search(int[][] arr, int target) {

    // int row = arr.length;
    // int col = arr[0].length;

    // if (row == 1) {
    // return BinarySearch(arr, row, 0, col - 1, target);
    // }

    // // Checking for the remaining two rows where we can apply binary searc

    // int rStart = 0;
    // int rEnd = arr.length - 1;
    // int Cmid = col / 2;

    // while (rStart < (rEnd - 1)) { // this condition will make confirm that we
    // have two rows

    // int mid = rStart + (rEnd - rStart) / 2;

    // if (arr[mid][Cmid] == target) {
    // return new int[] { mid, Cmid };
    // }
    // if (arr[mid][Cmid] < target) {
    // rStart = mid;
    // } else {
    // rEnd = mid;
    // }
    // }

    // // Conditions for checking the whether where the targeted element is lying
    // using
    // // binarySearch Function

    // // Checking if the
    // if (arr[rStart][Cmid] == target) {
    // return new int[] { rStart, Cmid };
    // }
    // if (arr[rStart + 1][Cmid] == target) {
    // return new int[] { rStart + 1, Cmid };
    // }

    // // firts half
    // if (target <= arr[rStart][Cmid - 1]) {
    // return BinarySearch(arr, rStart, 0, Cmid - 1, target);
    // }
    // // Second half
    // if (target >= arr[rStart][Cmid + 1] && target <= arr[rStart][col - 1]) {
    // return BinarySearch(arr, rStart, Cmid + 1, col - 1, target);
    // }
    // // third half
    // if (target <= arr[rStart + 1][Cmid - 1]) {
    // return BinarySearch(arr, rStart + 1, 0, Cmid - 1, target);
    // } else {
    // return BinarySearch(arr, rStart + 1, Cmid + 1, col - 1, target);
    // }

    // }

    // public static int[] BinarySearch(int[][] arr, int row, int Cstart, int Cend,
    // int target) {

    // while (Cstart <= Cend) {
    // int mid = Cstart + (Cend - Cstart) / 2;

    // if (arr[row][mid] == target) {
    // return new int[] { row, mid };
    // }
    // if (arr[row][mid] > target) {
    // Cend = mid - 1;
    // } else {
    // Cstart = mid + 1;
    // }
    // }
    // return new int[] { -1, -1 };
    // }
}

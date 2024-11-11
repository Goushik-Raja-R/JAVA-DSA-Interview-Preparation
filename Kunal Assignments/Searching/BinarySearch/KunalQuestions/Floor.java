import java.util.Scanner;

public class Floor {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int target = 2;
        int[] arr = { 2, 3, 4, 8, 12, 14, 18, 20, 22, 27, 26 };

        int ans = FindFloor(arr, target);
        System.out.println(ans);
    }

    public static int FindFloor(int[] arr, int target) {

        if (target <= arr[0]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else
                return mid;
        }
        return end;
    }
}

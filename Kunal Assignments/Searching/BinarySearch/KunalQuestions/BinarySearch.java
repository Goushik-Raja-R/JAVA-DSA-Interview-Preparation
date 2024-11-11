import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = { -18, -12, -7, -2, 0, 1, 2, 4, 8, 9, 14, 22, 36, 45 };
        System.out.print("Enter the target: ");
        int target = s.nextInt();
        int ans = BinaryOperation(arr, target);
        System.out.println(ans);

        s.close();
    }

    public static int BinaryOperation(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
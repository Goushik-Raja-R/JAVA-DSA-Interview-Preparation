import java.util.Scanner;

public class OrderAgnostic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = { 98, 87, 76, 63, 54, 49, 33, 22, 11 };
        int target = 938;

        int ans = OrderAgnosticSearch(arr, target);
        System.out.println(ans);

        s.close();
    }

    public static int OrderAgnosticSearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        Boolean isAsc = arr[start] > arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;

            if (isAsc) {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}

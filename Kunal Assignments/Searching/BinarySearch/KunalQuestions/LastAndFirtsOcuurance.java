import java.util.Arrays;

// Firts and Last Occurance: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class LastAndFirtsOcuurance {
    public static void main(String[] args) {
        int target = 3;
        int[] arr = { 1, 2, 3, 3, 3, 7, 10, 13 };
        int[] ans = FirtsAndLast(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] FirtsAndLast(int[] arr, int target) {
        int[] ans = { -1, -1 };

        int First = FindOcuurance(arr, target, true);
        int Last = FindOcuurance(arr, target, false);

        ans[0] = First;
        ans[1] = Last;
 
        return ans;
    }

    public static int FindOcuurance(int[] arr, int target, Boolean Occurance) {

        int start = 0, ans = -1;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (Occurance) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}

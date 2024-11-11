// Find mountain Array : https://leetcode.com/problems/find-in-mountain-array/description/
public class FindMountain {

    public static void main(String[] args) {
        int target = 3;
        int[] arr = { 0, 1, 2, 4, 2, 1 };
        int ans = Peak(arr, target);

        System.out.println(ans);
        int res = Occurance(arr, target, 0, ans);
        if (res < 0)
            res = Occurance(arr, target, ans+1, arr.length - 1);

        System.out.println(res);

    }

    public static int Peak(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static int Occurance(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}

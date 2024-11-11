// Find peak index in mountain: https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

public class MountainArray {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 5, 4, 3, 2 };
        int ans = PeakIndex(arr);
        System.out.println(ans);
    }

    public static int PeakIndex(int[] arr) {
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
}

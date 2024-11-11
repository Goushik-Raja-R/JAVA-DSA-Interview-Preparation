// 81. Search in Rotated Sorted Array II : https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/

public class RotatedDuplicates {
    public static void main(String[] args) {
        int target = 1;
        int[] arr = { 1 };
        int ans = Search(arr, target);
        System.out.println(ans);
    }

    public static int Search(int[] arr, int target) {
        int Pivot = FindPivot(arr);

        if (Pivot == -1) {
            Searching(arr, target, 0, arr.length - 1);
        } else if (arr[Pivot] == target)
            return Pivot;

        if (target >= arr[0])
            return Searching(arr, target, 0, Pivot - 1);

        return Searching(arr, target, Pivot + 1, arr.length - 1);

    }

    public static int FindPivot(int[] arr) {

        if (arr.length == 1) {
            return 0;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr[start] == arr[mid] && arr[end] == arr[mid]) {

                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            } else if (arr[start] < arr[mid] && arr[start] == arr[mid] && arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int Searching(int[] arr, int target, int start, int end) {

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

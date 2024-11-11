// 33. Search in Rotated Sorted Array: https://leetcode.com/problems/search-in-rotated-sorted-array/description/

public class SearchInSorted {

    public static void main(String[] args) {
        int target = 0;
        int[] arr = { 1 };
        int Pivot = search(arr, target);
        System.out.println(Pivot);
    }

    public static int search(int[] arr, int target) {

        int Pivot = FindPivot(arr);
        if (Pivot == -1) {
            Searching(arr, target, 0, arr.length - 1);
        }
        if (arr[Pivot] == target) {
            return Pivot;
        }
        if (target >= arr[0]) {
            return Searching(arr, target, 0, Pivot - 1);
        }
        return Searching(arr, target, Pivot + 1, arr.length - 1);
    }

    public static int FindPivot(int[] arr) {

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
            if (arr[start] > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
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

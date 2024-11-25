public class SearchRotateDup {
    public static void main(String[] args) {
        int[] arr = { 6, 10, 1, 3, 5 };
        int target = 3;

        Boolean ans = DuplicateRoatated(arr, target);
        System.out.println(ans);
    }

    public static Boolean DuplicateRoatated(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return true;
            }

            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                start++;
                end--;
                continue;
            } else if (arr[start] <= arr[mid]) {

                if (arr[start] <= target && target <= arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {

                if (arr[mid] <= target && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return false;
    }
}

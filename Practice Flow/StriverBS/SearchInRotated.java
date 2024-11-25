public class SearchInRotated {
    public static void main(String[] args) {
        int[] arr = { 12, 15, 18, 2, 4 };
        int target = 2;

        int ans = Search(arr, target);
        System.out.println(ans);
    }

    public static int Search(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
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
        return -1;
    }

}

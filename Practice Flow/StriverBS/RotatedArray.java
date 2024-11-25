public class RotatedArray {
    public static void main(String[] args) {
        int[] arr = {8,9,4,5};
        int ans = 0;
        if (arr[0] > arr[arr.length - 1])
            ans = CheckFirtsHalf(arr);
        else {
            ans = CheckSecondHalf(arr);
        }
        System.out.println(ans);
    }

    public static int CheckFirtsHalf(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int ans = 0;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1] && mid < arr.length) {
                start = mid + 1;
            } else {
                end = mid - 1;
                ans = mid;
            }
        }
        return ans+1;
    }

    public static int CheckSecondHalf(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int ans = 0;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid - 1] && mid >= 0) {
                end = mid - 1;
                ans = mid;
            } else {
                start = mid + 1;
            }
        }
        return ans+1;
    }
}

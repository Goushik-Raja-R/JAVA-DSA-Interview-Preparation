public class FirstAndLastOcc {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 3, 3, 6 };
        int target = 3;
        int FindFirst = FindFirtAndLast(arr, target);
        int Findlast = FindLast(arr, target);

        System.out.println(Findlast + "  " + FindFirst);
    }

    public static int FindFirtAndLast(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int ans = arr.length;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] >= target) {
                end = mid - 1;
                ans = mid;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    public static int FindLast(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int ans = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                end = mid - 1;
                ans = mid;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
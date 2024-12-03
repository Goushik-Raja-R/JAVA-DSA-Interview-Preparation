public class kthMissingPositive {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 8, 9 };
        int k = 9;

        int ans = findKthPositive(arr, k);
        int res = FindPositivewithBS(arr, k);
        System.out.println(res);
        System.out.println(ans);
    }

    public static int FindPositivewithBS(int[] arr, int k) {

        int start = 1;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            int missing = arr[mid] - (mid + 1);

            if (missing < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start + k;
    }

    public static int findKthPositive(int[] arr, int k) {

        int MaxValue = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > MaxValue) {
                MaxValue = arr[i];
            }
        }

        int MinValue = 1, count = 0, ans = 0;

        for (int i = MinValue; i <= MaxValue; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i != arr[j]) {
                    count++;
                }
            }
            if (count == arr.length) {
                ans++;
            }
            if (ans == k) {
                return i;
            }
        }
        return arr[arr.length - 1] + (k - ans);
    }
}

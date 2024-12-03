public class NthNumOfBoq {
    public static void main(String[] args) {
        int[] arr = { 7, 7, 7, 7, 13, 11, 12, 7 };
        int m = 2;
        int k = 3;
        // int ans = roseGarden(arr, m, k);
        int result = rosegarden(arr, m, k);
        System.out.println(result);
        // System.out.println(ans);
    }

    public static int rosegarden(int[] arr, int m, int k) {
        if ((m * k) > arr.length) {
            return -1;
        }

        int MinValue = Integer.MAX_VALUE;
        int MaxValue = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > MaxValue) {
                MaxValue = arr[i];
            }

            if (arr[i] < MinValue) {
                MinValue = arr[i];
            }
        }

        int start = MinValue;
        int end = MaxValue;
        int ans = MaxValue;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            int result = Possible(arr, m, k, mid);

            if (result == 1) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static int Possible(int[] arr, int m, int k, int mid) {

        int count = 0, res = 0;
        for (int j = 0; j < arr.length; j++) {

            if (mid >= arr[j]) {
                count++;
            } else {
                count = 0;
            }
            if (count >= k) {
                res++;
                count = 0;
            }
        }
        if (res >= m) {
            return 1;
        }
        return -1;
    }

    public static int roseGarden(int[] arr, int m, int k) {

        if ((m * k) > arr.length) {
            return -1;
        }

        int MinValue = Integer.MAX_VALUE;
        int MaxValue = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > MaxValue) {
                MaxValue = arr[i];
            }

            if (arr[i] < MinValue) {
                MinValue = arr[i];
            }
        }

        for (int i = MinValue; i <= MaxValue; i++) {

            int count = 0, res = 0;

            for (int j = 0; j < arr.length; j++) {

                if (i >= arr[j]) {
                    count++;
                } else {
                    count = 0;
                }
                if (count >= k) {
                    res++;
                    count = 0;
                }
            }
            System.out.println(res + " " + i);
            if (res >= m) {
                if (Check(arr, i)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static Boolean Check(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }
}

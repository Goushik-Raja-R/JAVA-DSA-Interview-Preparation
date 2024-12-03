public class ShipPackages {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int days = 5;

        int ans = shipWithinDays(arr, days);

        System.out.println(ans);
    }

    public static int ShipWithinDays(int[] arr, int days) {

        int SumOfArray = 0, MaxValue = Integer.MIN_VALUE, sum = 0, k = 0, ans = 0;

        for (int i = 0; i < arr.length; i++) {
            SumOfArray += arr[i];
            if (arr[i] > MaxValue) {
                MaxValue = arr[i];
            }
        }

        int start = MaxValue;
        int end = SumOfArray;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            sum = 0;
            k = 0;

            for (int j = 0; j < arr.length; j++) {
                sum += arr[j];

                if (sum > mid) {
                    k++;
                    sum = arr[j];
                }
                if (sum < mid && j == arr.length - 1) {
                    k++;
                }
            }
            if (k <= days) {
                return mid;
            }
        }
        return start;
    }

    public static int shipWithinDays(int[] arr, int days) {

        int SumOfArray = 0, MaxValue = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            SumOfArray += arr[i];
            if (arr[i] > MaxValue) {
                MaxValue = arr[i];
            }
        }

        int start = MaxValue;
        int end = SumOfArray;
        int res = SumOfArray;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            int ans = Check(arr, days, mid);

            if (ans == 1) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return res;
    }

    public static int Check(int[] arr, int days, int mid) {

        int day = 1, load = 0;

        for (int i = 0; i < arr.length; i++) {

            if (load + arr[i] > mid) {
                day = day + 1;
                load = arr[i];
            } else {
                load = load + arr[i];
            }
        }
        return day <= days ? 1 : 0;
    }

}

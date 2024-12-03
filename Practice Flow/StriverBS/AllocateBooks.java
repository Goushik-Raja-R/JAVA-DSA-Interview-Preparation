import java.util.ArrayList;

public class AllocateBooks {

    public static void main(String[] args) {
        int[] arr = { 12, 34, 67, 90 };
        int Student = 2;

        System.out.println(findPages(arr, Student));

        int ans = FindPages(arr, Student);
        System.out.println(ans);
    }

    public static int FindPages(int[] arr, int student) {

        int MaxOfArray = Integer.MIN_VALUE;
        int SumOfArray = 0, res = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > MaxOfArray) {
                MaxOfArray = arr[i];
            }
            SumOfArray += arr[i];
        }

        int start = MaxOfArray;
        int end = SumOfArray;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (Check(arr, student, mid)) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return res;

    }

    public static Boolean Check(int[] arr, int student, int mid) {

        int s = 1;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (sum + arr[i] > mid) {
                s++;
                sum = arr[i];
                if (s > student) {
                    return false;
                }
            } else {
                sum += arr[i];
            }
        }
        return true;
    }

    public static int findPages(int[] arr, int student) {

        int MaxOfArray = Integer.MIN_VALUE;
        int SumOfArray = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > MaxOfArray) {
                MaxOfArray = arr[i];
            }
            SumOfArray += arr[i];
        }

        for (int i = MaxOfArray; i <= SumOfArray; i++) {

            int s = 1;
            int max = 0, sum = 0;

            for (int j = 0; j < arr.length; j++) {

                if (sum + arr[j] > i) {
                    s++;
                    max = Math.max(max, sum);
                    sum = arr[j];
                } else {
                    sum += arr[j];
                }
            }
            if (s == student) {
                return i;
            }
        }
        return 0;
    }
}

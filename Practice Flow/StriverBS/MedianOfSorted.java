import java.util.Arrays;

public class MedianOfSorted {

    public static void main(String[] args) {
        int[] num1 = {};
        int[] num2 = { 1 };

        double ans = findMedianSortedArrays(num1, num2);
        System.out.println(ans);
    }

    public static double findMedianSortedArrays(int[] num1, int[] num2) {

        int[] arr = new int[num1.length + num2.length];

        int index1 = (num1.length + num2.length) / 2;
        int index2 = index1 - 1;
        int i = 0, j = 0, k = 0;

        while (i < num1.length && j < num2.length) {

            if (num1[i] <= num2[j]) {
                arr[k++] = num1[i++];
            } else {
                arr[k++] = num2[j++];
            }
        }

        while (i < num1.length) {
            arr[k++] = num1[i++];
        }

        while (j < num2.length) {
            arr[k++] = num2[j++];
        }

        if (arr.length % 2 != 0) {
            int ans = arr[arr.length / 2];
            return ans;
        } else {
            double ans = (arr[index1] + arr[index2]) / 2.0;
            return ans;
        }
    }
}
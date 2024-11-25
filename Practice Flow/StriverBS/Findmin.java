// https://www.youtube.com/watch?v=nhEMDKMB44g&list=PLgUwDviBIf0pMFMWuuvDNMAkoQFi-h0ZF&index=7

public class Findmin {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 1, 2 };

        int ans = Minimum(arr);
        System.out.println(ans);
    }

    public static int Minimum(int[] arr) {

        int start = 0;
        int end = arr.length - 1;
        int ans = Integer.MAX_VALUE;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[start] <= arr[mid]) {
                ans = Math.min(ans, arr[start]);
                start = mid + 1;
            } else {
                ans = Math.min(ans, arr[mid]);
                end = mid - 1;
            }
        }

        return ans;
    }
}

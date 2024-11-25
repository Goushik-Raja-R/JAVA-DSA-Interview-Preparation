// https://www.youtube.com/watch?v=jtSiWTPLwd0&list=PLgUwDviBIf0pMFMWuuvDNMAkoQFi-h0ZF&index=8

public class HowManyTimesRot {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 1, 2 };

        int ans = NumOfTimesRoatated(arr);
        System.out.println(ans);
    }

    public static int NumOfTimesRoatated(int[] arr) {

        int start = 0;
        int end = arr.length - 1;
        int ans = Integer.MAX_VALUE, ind = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[start] <= arr[mid]) {
                if (ans > arr[start]) {
                    ind = start;
                    ans = arr[start];
                }
                start = mid + 1;
            } else {
                if (ans > arr[mid]) {
                    ind = mid;
                    ans = arr[mid];
                }
                end = mid - 1;
            }
        }
        return ind;
    }
}

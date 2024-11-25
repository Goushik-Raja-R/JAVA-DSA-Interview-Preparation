import java.util.ArrayList;
import java.util.Arrays;

// https://www.youtube.com/watch?v=cXxmbemS6XM&list=PLgUwDviBIf0pMFMWuuvDNMAkoQFi-h0ZF&index=10

public class peakElement {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 5, 4, 1));

        int ans = FindPeak(arr);
        System.out.println(ans);
    }

    public static int FindPeak(ArrayList<Integer> arr) {

        int n = arr.size();

        if (arr.size() == 1) {
            return arr.get(0);
        }

        if (arr.get(0) > arr.get(1)) {
            return arr.get(0);
        }

        if (arr.get(n - 1) > arr.get(n - 2)) {
            return arr.get(n - 1);
        }

        int start = 1;
        int end = n - 2;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr.get(mid - 1) < arr.get(mid) && arr.get(mid) > arr.get(mid + 1)) {
                return arr.get(mid);
            } else if (arr.get(mid) > arr.get(mid - 1)) {
                start = mid + 1;
            } else if (arr.get(mid) > arr.get(mid + 1)) {
                end = mid - 1;
            }
        }
        return -1;
    }
}

import java.util.Arrays;
import java.util.HashMap;

// 167. Two Sum II - Input Array Is Sorted : https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

public class TwoSumSorted {

    public static void main(String[] args) {
        int target = 18;
        int[] arr = { 2, 7, 11, 15 };
        int[] ans = Findtw0sum(arr, target);
        int[] res = Findtw0sumWithBS(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(res));
    }

    public static int[] Findtw0sum(int[] arr, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int ans = arr[i];
            int find = target - ans;

            if (map.containsKey(find)) {
                return new int[] { map.get(find) + 1, i + 1 };
            }
            map.put(ans, i);
        }
        return new int[] { -1, -1 };
    }

    public static int[] Findtw0sumWithBS(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int sum = arr[start] + arr[end];

            if (sum == target) {
                return new int[] { start + 1, end + 1 };
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }

        return new int[] { -1, -1 };
    }
}

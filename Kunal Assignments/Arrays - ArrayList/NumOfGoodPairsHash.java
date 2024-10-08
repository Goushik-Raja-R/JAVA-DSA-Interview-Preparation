import java.util.HashMap;
import java.util.Scanner;

// 1512. Number of Good Pairs : https://leetcode.com/problems/number-of-good-pairs/description/

public class NumOfGoodPairsHash {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Size: ");
        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int ans = numIdenticalPairs(arr, n);
        System.out.println(ans);
    }

    public static int numIdenticalPairs(int[] nums, int ans) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < ans; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                count++;
            }
        }
        return count;
    }
}

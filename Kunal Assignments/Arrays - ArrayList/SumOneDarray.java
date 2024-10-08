import java.util.Arrays;
import java.util.Scanner;

// 1480. Running Sum of 1d Array : https://leetcode.com/problems/running-sum-of-1d-array/description/

public class SumOneDarray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Array Size: ");
        int size = s.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        int[] ans = RunningSum(arr);
        System.out.println(Arrays.toString(ans));

        s.close();
    }

    static int[] RunningSum(int[] nums) {                
        int sum = 0;
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            ans[i] = sum;
        }
        return ans;
    }
}

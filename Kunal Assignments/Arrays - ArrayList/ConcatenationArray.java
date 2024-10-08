import java.util.Arrays;
import java.util.Scanner;

// 1929. Concatenation of Array : https://leetcode.com/problems/concatenation-of-array/description/

public class ConcatenationArray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Size of the array: ");
        int size = s.nextInt();

        int[] arr = new int[size];
        int[] ans = new int[size * 2];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        ans = concatenate(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] concatenate(int[] nums) {
        int[] ans = new int[nums.length * 2];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            k++;
        }
        for (int i = 0; i < nums.length; i++) {
            ans[k] = nums[i];
            k++;
        }

        return ans;
    }
}

import java.util.Arrays;
import java.util.Scanner;

// 1920. Build Array from Permutation : https://leetcode.com/problems/build-array-from-permutation/description/

public class BuildArray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] nums = new int[6];
        System.out.println("Enter The array Elements: ");

        for (int i = 0; i < nums.length; i++) {
            nums[i] = s.nextInt();
        }

        int[] ans = buildArray(nums);
        System.out.println(Arrays.toString(ans));

        s.close();
    }

    static int[] buildArray(int[] ans) {

        int nums[] = new int[ans.length];
        for (int i = 0; i < ans.length; i++) {
            nums[i] = ans[ans[i]];
        }

        return nums;
    }
}

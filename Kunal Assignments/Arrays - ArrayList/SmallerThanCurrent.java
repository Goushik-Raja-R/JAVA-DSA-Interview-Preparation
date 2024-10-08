import java.util.Arrays;
import java.util.Scanner;

// 1365. How Many Numbers Are Smaller Than the Current Number : https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/

public class SmallerThanCurrent {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int size = s.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++)
            arr[i] = s.nextInt();

        int[] ans = smallerNumbersThanCurrent(arr);
        System.out.println(Arrays.toString(ans));

        s.close();
    }

    public static int[] smallerNumbersThanCurrent(int[] ans) {

        int[] nums = new int[ans.length];
        int k = 0;

        for (int i = 0; i < ans.length; i++) {
            int count = 0;
            for (int j = 0; j < ans.length; j++) {
                if (i != j && ans[i] > ans[j]) {
                    count++;
                }
            }
            nums[k] = count;
            k++;
        }
        return nums;
    }
}

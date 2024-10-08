import java.util.Scanner;

// 1512. Number of Good Pairs : https://leetcode.com/problems/number-of-good-pairs/description/
public class NumOfGoodPairs {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Array Size: ");
        int size = s.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = s.nextInt();
        }

        int ans = numIdenticalPairs(nums);
        System.out.println(ans);

        s.close();
    }

    static int numIdenticalPairs(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    count++;
            }
        }
        return count;
    }

}

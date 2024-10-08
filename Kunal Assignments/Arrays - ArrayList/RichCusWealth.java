import java.util.Scanner;

// 1672. Richest Customer Wealth : https://leetcode.com/problems/richest-customer-wealth/description/
public class RichCusWealth {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = s.nextInt();
        int[][] nums = new int[size][size + 1];

        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[row].length; col++) {
                nums[row][col] = s.nextInt();
            }
        }
        int ans = maximumWealth(nums);
        System.out.println("Rich man in the city is: " + ans);
        s.close();
    }

    static int maximumWealth(int[][] ans) {

        int sum = 0, max = 0;
        for (int row = 0; row < ans.length; row++) {

            for (int col = 0; col < ans[row].length; col++) {
                sum += ans[row][col];
            }
            if (sum > max) {
                max = sum;
            }
            sum = 0;
        }
        return max;
    }
}
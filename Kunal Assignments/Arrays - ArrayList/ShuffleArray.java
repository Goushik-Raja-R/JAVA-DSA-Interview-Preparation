import java.util.Arrays;
import java.util.Scanner;

// 1470. Shuffle the Array : https://leetcode.com/problems/shuffle-the-array/description/

public class ShuffleArray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Array Size: ");
        int size = s.nextInt();
        int OriginalsSize = size * 2;
        int[] nums = new int[OriginalsSize];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = s.nextInt();
        }

        int[] ans = shuffle(nums, size);
        System.out.println(Arrays.toString(ans));
    }

    static int[] shuffle(int[] ans, int Size) {
        int[] nums = new int[Size * 2];
        int part = ans.length / 2, res = 0;

        for (int i = 0; i < ans.length; i++) {

            nums[i] = ans[i - res];
            nums[i + 1] = ans[part];
            part++;
            i++;
            res++;
        }

        return nums;
    }
}

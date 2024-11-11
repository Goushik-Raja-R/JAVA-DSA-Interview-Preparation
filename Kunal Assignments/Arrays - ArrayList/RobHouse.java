import java.util.Scanner;

// 198. House Robber : https://leetcode.com/problems/house-robber/description/

public class RobHouse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int size = s.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        int ans = rob(arr);
        System.out.println(ans);

        s.close();
    }

    public static int rob(int[] arr) {

        if (arr.length < 2) {
            return arr[0];
        }

        int[] ans = new int[arr.length];
        ans[0] = arr[0];
        ans[1] = Math.max(arr[0], arr[1]);

        for (int i = 2; i < ans.length; i++) {
            ans[i] = Math.max((ans[i - 2] + arr[i]), ans[i - 1]);
        }

        return ans[ans.length - 1];
    }
}
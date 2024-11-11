import java.util.Scanner;

// 55. Jump Game : https://leetcode.com/problems/jump-game/description/

public class JumpGame {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Array Size: ");
        int size = s.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        Boolean ans = CanJump(arr);
        System.out.println(ans);
    }

    public static Boolean CanJump(int[] arr) {

        int last = arr.length - 1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if ((i + arr[i] >= last)) {
                last = i;
            }
        }
        return last == 0;
    }
}

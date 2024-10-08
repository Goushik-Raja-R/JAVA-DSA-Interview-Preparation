import java.util.Scanner;

// 1732. Find the Highest Altitude : https://leetcode.com/problems/find-the-highest-altitude/description/

public class FindHighestAlti {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = s.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++)
            arr[i] = s.nextInt();

        int ans = largestAltitude(arr);
        System.out.println(ans);
        s.close();
    }

    public static int largestAltitude(int[] arr) {
        int max = 0, res = 0;
        for (int i = 0; i < arr.length; i++) {
            res += arr[i];
            if (res > max)
                max = res;
        }
        return max;
    }
}

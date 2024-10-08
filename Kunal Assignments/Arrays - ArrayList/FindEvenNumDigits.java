import java.util.Scanner;

// 1295. Find Numbers with Even Number of Digits: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

public class FindEvenNumDigits {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Arrays Size: ");
        int size = s.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++)
            arr[i] = s.nextInt();

        int ans = findNumbers(arr);
        System.out.println(ans);
    }

    public static int findNumbers(int[] ans) {
        int c, k = 0;
        for (int i = 0; i < ans.length; i++) {

            int temp = ans[i];
            c = 0;
            while (temp > 0) {
                c++;
                temp /= 10;
            }
            if (c % 2 == 0)
                k++;
        }
        return k;
    }
}

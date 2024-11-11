import java.util.Arrays;
import java.util.Scanner;

// 1304. Find N Unique Integers Sum up to Zero : https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/description/

public class ArraySumEqualZero {

    public static void main(String[] args) {
        System.out.print("Enter Array Size: ");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();

        int[] ans = ArrayEqualZero(size);
        System.out.println(Arrays.toString(ans));

        s.close();
    }

    public static int[] ArrayEqualZero(int size) {

        int[] arr = new int[size];

        if (size <= 1) {
            return new int[] { 0 };
        }

        int res = size / 2;
        int odd = 1;
        int even = 1;

        if (size % 2 == 0) {
            for (int i = 0; i < res; i++) {
                arr[i] = odd;
                odd += 1;
            }
            for (int i = res; i < size; i++) {
                arr[i] = (even) * (-1);
                even += 1;
            }
        }

        if (size % 2 != 0) {
            for (int i = 0; i < size; i++) {
                if (i == res) {
                    arr[i] = 0;
                } else {
                    if (i < res) {
                        arr[i] = even;
                        even += 1;
                    }
                    if (i > res) {
                        arr[i] = (odd) * (-1);
                        odd += 1;
                    }
                }
            }
        }
        return arr;
    }

}

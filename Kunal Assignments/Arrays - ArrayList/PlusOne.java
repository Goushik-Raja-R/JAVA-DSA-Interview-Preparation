import java.util.Scanner;
import java.util.Arrays;
// import java.util.ArrayList;

// 66. Plus One : https://leetcode.com/problems/plus-one/description/

public class PlusOne {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int size = s.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        int[] ans = plusOne(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] plusOne(int[] arr) {

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            } else {
                arr[i] = 0;
            }
        }

        int[] newOne = new int[arr.length + 1];
        newOne[0] = 1;
        return newOne;

        // int sum = 0, ans = 0, k = 0;
        // ArrayList<Integer> list = new ArrayList<>();

        // for (int i = 0; i < arr.length; i++) {
        // sum = arr[i] + ans;
        // ans = sum * 10;
        // }
        // ++sum;
        // System.out.println(sum);

        // while (sum != 0) {
        // int r = sum % 10; // failed in : 9 8 7 6 5 4 3 2 0
        // System.out.println(r);
        // list.add(r);
        // sum /= 10;
        // }
        // int[] res = new int[list.size()];

        // for (int i = list.size() - 1; i >= 0; i--) {
        // res[k] = list.get(i);
        // k++;
        // }

        // return res;
    }
}

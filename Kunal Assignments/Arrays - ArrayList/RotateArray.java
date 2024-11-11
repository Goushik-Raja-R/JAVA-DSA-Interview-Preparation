import java.util.Arrays;
import java.util.Scanner;

// Want to check the optimazation code

public class RotateArray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int size = s.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        System.out.print("Enter Number of Time to rotate: ");
        int NumOfTime = s.nextInt();

        int[] ans = rotate(arr, NumOfTime);

        System.out.println(Arrays.toString(ans));

    }

    public static int[] rotate(int[] arr, int NumOfTime) {

        int k = 0, len = NumOfTime;
        int[] ans = new int[arr.length];

        for (int i = arr.length - 1; i >= arr.length - len; i--) {
            ans[k] = arr[i];
            k++;
        }
        int len1 = (arr.length - len) - 1;

        for (int i = 0; i <= len1; i++) {
            ans[k] = arr[i];
            k++;
        }

        return ans;
    }
}

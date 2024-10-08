import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class CreateArrayWidOld {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int size = s.nextInt();
        int[] arr = new int[size];
        int[] nums = new int[size];

        System.out.print("Enter Array of Value: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        System.out.print("Enter Array of Index: ");
        for (int j = 0; j < nums.length; j++) {
            nums[j] = s.nextInt();
        }

        int[] ans = CreateTargetArray(arr, nums);
        System.out.println(Arrays.toString(ans));

        s.close();
    }

    public static int[] CreateTargetArray(int[] arr, int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(nums[i], arr[i]);
        }
        int[] ans = new int[nums.length];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }

}

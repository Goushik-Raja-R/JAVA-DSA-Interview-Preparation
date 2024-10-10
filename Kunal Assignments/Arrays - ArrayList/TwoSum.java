import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int size = s.nextInt();
        System.out.print("Enter the target element: ");
        int target = s.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        int[] ans = twoSum(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] twoSum(int[] array, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            int ans = target - array[i];

            if (map.containsKey(ans)) {
                return new int[] { i, map.get(ans) };
            }

            map.putIfAbsent(num, i);
        }
        return new int[] {};
    }
}

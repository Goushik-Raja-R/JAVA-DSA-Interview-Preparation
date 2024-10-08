import java.util.Scanner;

public class PythagoreanTriplet {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        boolean ans = Pythagorean(arr);
        System.out.println(ans);
    }

    static boolean Pythagorean(int[] nums) {

        int sum = 0, c = 0;
        for (int i = 0; i < nums.length; i++) { // 3 1 4 6 5
            sum = nums[i] * nums[i];
            c = i;
            for (int j = 0; j < nums.length; j++) {
                if (j != c) {
                    for (int k = 0; k < nums.length; k++) {
                        if (k != j) {
                            if (sum == (nums[j] * nums[j]) + (nums[k] * nums[k])) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}

import java.util.Scanner;

//TIme Limit exceede:I'll be back

public class SubArray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Array Size: ");
        int size = s.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        int ans = Subarray(arr);
        System.out.println(ans);
    }

    public static int Subarray(int[] arr) {

        int max = Integer.MIN_VALUE;
        System.out.println(max);
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}

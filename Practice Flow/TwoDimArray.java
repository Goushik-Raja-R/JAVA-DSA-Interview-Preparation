import java.util.Scanner;
import java.util.Arrays;

public class TwoDimArray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int arr[][] = new int[3][3];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = s.nextInt();
            }
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        for (int[] is : arr) {
            System.out.println(Arrays.toString(is));
        }
    }
    
}

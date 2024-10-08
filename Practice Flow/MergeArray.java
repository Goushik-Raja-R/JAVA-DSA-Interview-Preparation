import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Two  Arrays size: ");
        int one = s.nextInt();
        int Two = s.nextInt();

        int[] arr = new int[one];
        int[] arr1 = new int[Two];
        int c = 0;

        System.out.print("Enter elements for arr: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println();

        System.out.print("Enter elements for arr1: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = s.nextInt();
        }

        int[] merge = new int[arr.length + arr1.length];

        for (int i = 0; i < arr.length; i++) {
            merge[i] = arr[i];
            c++;
        }
        for (int i = 0; i < arr1.length; i++) {
            merge[c] = arr1[i];
            c++;
        }
        System.out.println(Arrays.toString(merge));
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class SwapVar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] arr = { 1, 6, 10, 22, 99 };
        swap(arr, 3, 4);
        System.out.println(Arrays.toString(arr));

        s.close();
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

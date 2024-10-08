import java.util.Arrays;

public class ArrayRev {
    public static void main(String[] args) {
        int[] arr = { 65, 78, 22, 35, 43 };
        Reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Reverse(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        for (start = 0; start < end; start++) {
            if (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    }
}

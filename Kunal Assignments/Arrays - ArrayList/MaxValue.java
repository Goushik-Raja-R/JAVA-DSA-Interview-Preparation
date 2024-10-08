public class MaxValue {
    public static void main(String[] args) {
        int[] arr = { 44, 77, 65, 24, 89 };
        int res = Maximum(arr);
        System.out.println(res + " is the maximum number");
    }

    static int Maximum(int[] arr) {
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        return max;
    }
}

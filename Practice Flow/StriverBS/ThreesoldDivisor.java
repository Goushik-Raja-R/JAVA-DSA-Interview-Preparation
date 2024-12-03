public class ThreesoldDivisor {
    public static void main(String[] args) {
        int[] arr = { 44, 22, 33, 11, 1 };
        int ThreeSold = 5;

        int ans = smallestDivisor(arr, ThreeSold);
        System.out.println(ans);
    }

    public static int smallestDivisor(int[] arr, int ThreeSold) {

        int MaxValue = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > MaxValue) {
                MaxValue = arr[i];
            }
        }

        int MinValue = 1;
        // int ans = MaxValue;

        while (MinValue <= MaxValue) {

            int mid = MinValue + (MaxValue - MinValue) / 2;

            if (Check(arr, ThreeSold, mid)) {
                MaxValue = mid - 1;
            } else {
                MinValue = mid + 1;
            }
        }
        return MinValue;
    }

    public static Boolean Check(int[] arr, int ThreeSold, int MinDiv) {
        int sumOfRem = 0;

        for (int i = 0; i < arr.length; i++) {
            sumOfRem += (arr[i] + MinDiv - 1) / MinDiv;
        }
        return sumOfRem <= ThreeSold;
    }
}

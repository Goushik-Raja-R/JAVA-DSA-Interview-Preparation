import java.util.Arrays;

public class FairCandy {
    public static void main(String[] args) {
        int[] aliceSizes = { 1, 2 };
        int[] bobSizes = { 2, 3 };

        int[] ans = fairCandySwap(aliceSizes, bobSizes);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int target = aliceSizes[0];

        int start = 0;
        int end = bobSizes.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (bobSizes[mid] > target) {
                end = mid - 1;
            } else if (bobSizes[mid] < target) {
                start = mid + 1;
            } else {
                return new int[] { target, bobSizes[mid] };
            }
        }

        return new int[] { target, bobSizes[start] };
    }
}
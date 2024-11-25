// Striver 10th BS video;

public class SquareRoot {
    public static void main(String[] args) {
        int num = 6;
        int ans = FindSquareRoot(num);
        System.out.println(ans);
    }

    public static int FindSquareRoot(int num) {

        int start = 1;
        int end = num;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            long mul = mid * mid;

            if (mul > num) {
                end = mid - 1;
            } else if (mul < num) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}

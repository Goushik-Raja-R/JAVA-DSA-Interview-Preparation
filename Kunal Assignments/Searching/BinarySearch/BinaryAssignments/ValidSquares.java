public class ValidSquares {
    public static void main(String[] args) {
        int num = 14;
        Boolean ans = isPerfectSquare(num);
        System.out.println(ans);
    }

    public static Boolean isPerfectSquare(int num) {

        int start = 1;
        int end = num;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            long res = (long) mid * mid;

            if (res > num) {
                end = mid - 1;
            } else if (res < num) {
                start = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}

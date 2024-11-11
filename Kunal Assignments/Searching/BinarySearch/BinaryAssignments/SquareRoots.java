// 69. Sqrt(x) : https://leetcode.com/problems/sqrtx/description/

public class SquareRoots {
    public static void main(String[] args) {
        int num = 8;
        int ans = FindSquare(num);
        System.out.println(ans);
    }

    public static int FindSquare(int num) {

        int start = 1;
        int end = num;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long mul = (long) mid * mid;

            if (mul <= num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }
}
// 374. Guess Number Higher or Lower : https://leetcode.com/problems/guess-number-higher-or-lower/description/

public class GuessGame {
    public static void main(String[] args) {
        int num = 7;
        int ans = GuessNum(num);
        System.out.println(ans);
    }

    public static int GuessNum(int num) {

        int start = 0;
        int end = num;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int ans = GuessMethod(mid);

            if (ans == -1) {
                end = mid - 1;
            } else if (ans == 1) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int GuessMethod(int pick) {
        int target = 3;
        if (pick > target)
            return -1;
        else if (pick < target)
            return 1;
        else
            return 0;
    }
}

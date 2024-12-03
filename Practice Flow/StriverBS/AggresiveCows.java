import java.util.Arrays;

public class AggresiveCows {

    public static void main(String[] args) {
        int[] stall = { 0, 3, 4, 7, 10, 9 };
        int cow = 4;
        int ans = aggresivecows(stall, cow);
        System.out.println(ans);
    }

    public static int aggresivecows(int[] stall, int cow) {

        for (int i = 0; i < stall.length; i++) {
            for (int j = i + 1; j < stall.length; j++) {

                if (stall[i] > stall[j]) {
                    int temp = stall[j];
                    stall[j] = stall[i];
                    stall[i] = temp;
                }
            }
        }

        int start = 1;
        int end = stall[stall.length - 1] - start;
        int res = 0;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            int ans = Check(stall, cow, mid);

            if (ans > 0) {
                res = mid;
                start = start + 1;
            } else {
                end = mid - 1;
            }
        }
        return res;

    }

    public static int Check(int[] stall, int cow, int mid) {

        int c = 1;
        int MinValue = Integer.MAX_VALUE;
        int ans = stall[0];
        int FinalAns = Integer.MIN_VALUE;

        for (int j = 1; j < stall.length; j++) {
            int rem = stall[j] - ans;

            if (rem >= mid) {
                c++;
                ans = stall[j];
                if (rem < MinValue) {
                    MinValue = rem;
                }
            }
            if (c == cow) {
                return MinValue;
            }
        }
        if (c < cow) {
            return 0;
        }
        if (MinValue > FinalAns) {
            return MinValue;
        }
        return 0;
    }

}

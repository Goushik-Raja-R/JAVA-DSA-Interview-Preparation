public class PainterPartition {
    public static void main(String[] args) {
        int[] Boards = { 40, 90 };
        int Paninters = 2;

        int ans = FindLargestMinDistance(Boards, Paninters);
        int result = FindMinOfMax(Boards, Paninters);
        System.out.println(result);
        System.out.println(ans);
    }

    public static int FindMinOfMax(int[] Boards, int Painters) {

        int MaxOfArray = 0;
        int SumOfArray = 0;

        for (int i = 0; i < Boards.length; i++) {
            if (Boards[i] > MaxOfArray) {
                MaxOfArray = Boards[i];
            }
            SumOfArray += Boards[i];
        }

        int start = MaxOfArray;
        int end = SumOfArray, res = 0;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (Check(Boards, Painters, mid)) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return res;
    }

    public static Boolean Check(int[] Boards, int painters, int mid) {

        int p = 1;
        int sum = 0;

        for (int i = 0; i < Boards.length; i++) {

            if (sum + Boards[i] > mid) {
                p++;
                sum = Boards[i];
                if (p > painters) {
                    return false;
                }
            } else {
                sum += Boards[i];
            }
        }
        return true;

    }

    public static int FindLargestMinDistance(int[] Boards, int Paninters) {

        int FinalAns = Integer.MAX_VALUE, ans = 0, max = Integer.MAX_VALUE;

        for (int i = 0; i < Boards.length - 1; i++) {

            int Painter1 = 0;
            int Painter2 = 0;

            for (int j = 0; j < Boards.length; j++) {

                if (j > i) {
                    Painter2 += Boards[j];
                } else {
                    Painter1 += Boards[j];
                }
            }
            if (Painter2 == 0) {
                break;
            }
            if (Painter1 > Painter2) {
                ans = Painter1;
            } else {
                ans = Painter2;
            }
            max = Math.min(ans, max);

            if (max < FinalAns) {
                FinalAns = max;
            }
        }
        return FinalAns;
    }
}

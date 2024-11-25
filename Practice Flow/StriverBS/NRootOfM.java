public class NRootOfM {
    public static void main(String[] args) {
        int num = 27;
        int n = 3;

        int ans = FindNthRootM(num, n);
        System.out.println(ans);
    }

    public static int funct(int mid, int n, int num) {

        long ans = 1;

        for (int i = 1; i <= n; i++) {
            ans*= mid;

            if (ans > num){
                return 2;
            }
        }
        if (ans == num){
            return 1;
        }

        return 0;
    }

    public static int FindNthRootM(int num, int n) {

        int start = 1;
        int end = num;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            int ans = funct(mid, n, num);

            if (ans == 1) {
                return mid;
            } else if (ans == 2) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}

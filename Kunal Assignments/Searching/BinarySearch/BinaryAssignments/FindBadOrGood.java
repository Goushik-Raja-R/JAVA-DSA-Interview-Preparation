// 278. First Bad Version: https://leetcode.com/problems/first-bad-version/description/

public class FindBadOrGood {
    public static void main(String[] args) {
        int num = 5;
        int ans = GoodOrBad(num);
        System.out.println(ans);
    }

    public static int GoodOrBad(int num) {

        int start = 1;
        int end = num;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            Boolean res = Check(mid);

            if (res == true) {
                end = mid - 1;
            } else if (res == false) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }

    public static Boolean Check(int ans) {
        int target = 3;

        if (ans == target)
            return true;
        else
            return false;
    }
}

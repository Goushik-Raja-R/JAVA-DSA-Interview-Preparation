import java.util.Scanner;
 
//Small letters: https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

public class SmallLetter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char target = 'a';

        char[] str = { 'b', 'i', 'm', 'q', 't' };
        char ans = SmallCharacter(str, target);
        System.out.println(ans);

        s.close();
    }

    public static char SmallCharacter(char[] str, char target) {

        int start = 0;
        int end = str.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < str[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return str[start % str.length];
    }
}

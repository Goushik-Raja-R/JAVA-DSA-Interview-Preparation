import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExtraCandies {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size = s.nextInt(), max = 0;
        int[] candies = new int[size];

        for (int i = 0; i < size; i++) {
            candies[i] = s.nextInt();
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        System.out.print("Enter the extra candies: ");
        int extraCandies = s.nextInt();

        String[] array = kidsWithCandies(candies, extraCandies, max);
        System.out.println(Arrays.toString(array));
    }

    static String[] kidsWithCandies(int[] candies, int extraCandies, int max) {

        String[] str = new String[candies.length];
        int k = 0;
        for (int i = 0; i < candies.length; i++) {
            int c = 0;
            if (candies[i] + extraCandies >= max) {
                c++;
            }
            System.out.println(c);
            if (c == 1) {
                str[k] = "true";
                k++;
            } else {
                str[k] = "false";
                k++;
            }
        }
        return str;
    }
}

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

// 1431. Kids With the Greatest Number of Candies : https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/

public class ExtraCandiesList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Array Size: ");
        int size = s.nextInt();
        int[] candies = new int[size];

        for (int i = 0; i < candies.length; i++) {
            candies[i] = s.nextInt();
        }

        System.out.println("Enter the ExtraCandies");
        int ExtraCandies = s.nextInt();

        ArrayList<Boolean> l = kidsWithCandies(candies, ExtraCandies);
        System.out.println(l);
    }

    public static ArrayList<Boolean> kidsWithCandies(int[] candies, int ExtraCandies) {
        ArrayList<Boolean> t = new ArrayList<>();
        int max = 0;

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] >= max)
                max = candies[i];
        }

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + ExtraCandies >= max)
                t.add(true);
            else
                t.add(false);
        }

        return t;
    }
}

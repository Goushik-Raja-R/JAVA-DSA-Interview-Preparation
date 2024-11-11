import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Collections;

// 1854. Maximum Population Year : https://leetcode.com/problems/maximum-population-year/description/

public class population {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter row size: ");
        int n = s.nextInt();

        int[][] maximumPop = new int[n][2];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < 2; col++)
                maximumPop[row][col] = s.nextInt();
        }

        int ans = maximumPopulation(maximumPop);
        System.out.println(ans);

        s.close();

    }

    // Today: fixed yes im here

    public static int maximumPopulation(int[][] maximumPop) {

        int k = 0;

        HashMap<Integer, Integer> FrequencyMap = new HashMap<>();

        for (int[] num : maximumPop) {
            int birth = num[0];
            int death = num[1];

            FrequencyMap.put(birth, FrequencyMap.getOrDefault(birth, 0) + 1);

            FrequencyMap.put(death, FrequencyMap.getOrDefault(death, 0) - 1);
        }

        ArrayList<Integer> list = new ArrayList<>(FrequencyMap.keySet());
        Collections.sort(list);

        int sum = 0, max = 0, res = 0;

        for (int year : list) {
            sum += FrequencyMap.get(year);

            if (sum > max) {
                max = sum;
                res = year;
            }
        }

        return res;
    }
}

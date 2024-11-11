import java.util.Scanner;
import java.util.ArrayList;

// 1380. Lucky Numbers in a Matrix: https://leetcode.com/problems/lucky-numbers-in-a-matrix/description/

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter row Size: ");
        int n = s.nextInt();
        System.out.print("Enter col Size: ");
        int m = s.nextInt();

        int[][] matrix = new int[n][m];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                matrix[row][col] = s.nextInt();
            }
        }

        ArrayList<Integer> ans = luckyNumbers(matrix);
        System.out.println(ans);

        s.close();
    }

    public static ArrayList<Integer> luckyNumbers(int[][] matrix) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {
            int min = matrix[row][0];
            int index = 0;

            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] <= min) {
                    min = matrix[row][col];
                    index = col;
                }
            }

            int store = index;
            Boolean res = true;

            for (int col = 0; col < matrix.length; col++) {
                if (matrix[col][store] > min) {
                    res = false;
                    break;
                }
            }
            if (res == true) {
                list.add(min);
            }

        }

        // HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        // for (int ele : list) {
        // frequencyMap.put(ele, frequencyMap.getOrDefault(ele, 0) + 1);
        // }

        // ArrayList<Integer> l = new ArrayList<>();

        // for (int i : list) {
        // if (frequencyMap.get(i) > 1) {
        // l.add(i);
        // }
        // }
        // HashSet<Integer> h = new HashSet<>(l);

        return list;
    }
}

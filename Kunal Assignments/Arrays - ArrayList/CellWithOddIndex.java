import java.util.Arrays;
import java.util.Scanner;

public class CellWithOddIndex {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the row size: ");
        int n = s.nextInt();
        System.out.print("Enter the column size: ");
        int m = s.nextInt();

        int[][] indices = new int[n][m];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                indices[row][col] = s.nextInt();
            }
        }

        int ans = oddCells(m, n, indices);
        System.out.println(ans);
    }

    public static int oddCells(int m, int n, int[][] indices) {

        int[] row = new int[m];
        int[] col = new int[n];
        int c = 0;

        for (int[] num : indices) {
            row[num[0]]++;
            col[num[1]]++;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((row[i] + col[j]) % 2 != 0) {
                    c++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println(row[i] + col[j]);
            }
            System.out.println();
        }

        return c;
    }
}
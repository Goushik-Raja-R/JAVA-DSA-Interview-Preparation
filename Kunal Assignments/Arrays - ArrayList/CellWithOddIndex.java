import java.util.Scanner;

public class CellWithOddIndex {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size for: ");
        int n = s.nextInt();
        int m = s.nextInt();

        System.out.print("Enter the size for: ");
        int size = s.nextInt();

        int[][] indices = { { 0, 1 }, { 1, 1 } };

        int ans = oddCells(m, n, indices);
        System.out.println(ans);
    }

    public static int oddCells(int m, int n, int[][] indices) {

        int[][] arr = new int[m][n];

        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < indices.length; j++) {
                System.out.print(indices[i][j]);
            }
            System.out.println();
        }

        return 0;
    }
}

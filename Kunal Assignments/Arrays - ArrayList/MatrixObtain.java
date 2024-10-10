import java.util.Scanner;
import java.util.Arrays;

// There is error in this program i would work on this in weekend.

public class MatrixObtain {
    static int c = 0;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Row Size: ");
        int n = s.nextInt();
        System.out.print("Enter Column Size: ");
        int m = s.nextInt();

        int[][] matrix = new int[n][m];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                matrix[row][col] = s.nextInt();
            }
        }

        int[][] target = new int[n][m];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                target[row][col] = s.nextInt();
            }
        }

        Boolean ans = NintyDegree(matrix, target); // 90
        System.out.println(ans);
    }

    public static Boolean NintyDegree(int[][] matrix, int[][] target) {

        if (c >= 5) {
            for (int[] num : matrix)
                System.out.println(Arrays.toString(num));
            return false;
        }

        int[][] array = new int[matrix.length][matrix.length];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = matrix.length - 1; col >= 0; col--) {
                array[col][(matrix.length - 1) - row] = matrix[row][col];
            }
        }
        Boolean ans = ArrayChecking(array, target);
        if (ans) {
            return true;
        }
        c++;
        return NintyDegree(array, target);
    }

    public static Boolean ArrayChecking(int[][] matrix, int[][] target) {
        int count = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col] == target[row][col]) {
                    count++;
                    System.out.println(count);
                }
            }
        }
        if ((matrix.length * target.length) == count) {
            return true;
        } else {
            return false;
        }
    }
}
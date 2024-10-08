import java.util.Scanner;
import java.util.Arrays;

public class DegreeMatrix {

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

         int[][] ans = NintyDegree(matrix); //90
        // int[][] res = OneEightyDegree(matrix); //180
        // int[][] result = TwoSeventyDegree(matrix); //270

        for (int[] num : ans) {
            System.out.println(Arrays.toString(num));
        }

    }

    public static int[][] NintyDegree(int[][] matrix) {

        int[][] array = new int[matrix.length][matrix.length];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = matrix.length - 1; col >= 0; col--) {
                array[col][row] = matrix[(matrix.length - 1) - row][col];
            }
        }

        return array;
    }

    public static int[][] OneEightyDegree(int[][] matrix) {

        int[][] array = new int[matrix.length][matrix.length];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                array[row][col] = matrix[(matrix.length - 1) - row][(matrix.length - 1) - col];
            }
        }
        return array;
    }

    public static int[][] TwoSeventyDegree(int[][] matrix) {

        int[][] array = new int[matrix.length][matrix.length];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                array[row][col] = matrix[col][(matrix.length - 1) - row];
            }
        }

        return array;
    }

}

import java.util.Scanner;

// 1886. Determine Whether Matrix Can Be Obtained By Rotation : https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/description/

public class MatrixRotationObtain {

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

        Boolean ans = findRotation(matrix, target);
        System.out.println(ans);

        s.close();
    }

    public static Boolean findRotation(int[][] matrix, int[][] target) {

        for (int i = 0; i < 4; i++) {
            if (ArrayChecking(matrix, target))
                return true;
            matrix = NintyDegree(matrix, target);
        }
        return false;
    }

    public static int[][] NintyDegree(int[][] matrix, int[][] target) {

        int[][] array = new int[matrix.length][matrix.length];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = matrix.length - 1; col >= 0; col--) {
                array[col][(matrix.length - 1) - row] = matrix[row][col];
            }
        }
        return array;
    }

    public static boolean ArrayChecking(int[][] array, int[][] target) {

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array.length; col++) {
                if (array[row][col] != target[row][col])
                    return false;
            }
        }
        return true;
    }
}

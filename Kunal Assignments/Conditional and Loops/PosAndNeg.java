import java.util.Scanner;

public class PosAndNeg {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of numbers you want to enter: ");
        int num = s.nextInt();
        int sum = 0, sum1 = 0, sum2 = 0;

        for (int i = 0; i < num; i++) {
            int n = s.nextInt();
            if (n > 0) {
                if (n % 2 == 0) {
                    sum = sum + n;
                }
                if (n % 2 != 0) {
                    sum1 = sum1 + n;
                }
            }
            if (n < 0) {
                sum2 = sum2 + n;
            }
        }

        System.out.println("Sum of the negative numbers: " + sum2);
        System.out.println("Sum of the positive odd numbers: " + sum1);
        System.out.println("Sum of the positive even numbers: " + sum);
    }
}

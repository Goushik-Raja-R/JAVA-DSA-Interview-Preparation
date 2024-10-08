import java.util.Scanner;

public class SumOfTwo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the two Numbers: ");
        int num1 = s.nextInt();
        int num2 = s.nextInt();

        int sum = Sumoftwo(num1, num2);
        System.out.print("Sum of Two Number is: " + sum);

        s.close();
    }

    public static int Sumoftwo(int num1, int num2) {
        return num1 + num2;
    }
}
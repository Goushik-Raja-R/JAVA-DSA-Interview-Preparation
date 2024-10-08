import java.util.Scanner;

public class SumAllTillX {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0, m = 1, b;

        while (m > 0) {
            System.out.print("Enter the number: ");
            b = s.nextInt();
            sum = sum + b;
            System.out.print("Enter the character X if you want to stop: ");
            char c = s.next().charAt(0);
            if (c == 'x') {
                System.out.println("Sum of the number till now" + sum);
                m = 0;
            } else
                m++;
        }
        s.close();
    }

}

import java.util.Scanner;

public class prime {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = s.nextInt();
        if (num <= 1) {
            System.out.println("Neither prime nor composite");
            System.exit(0);
        }
        int c = 2;
        while (c * c < num) {
            if (num % c * c == 0) {
                System.out.println("Not prime");
                System.exit(0);
            }
            c = c + 1;
        }
        System.out.println("Its prime number");
    }

}

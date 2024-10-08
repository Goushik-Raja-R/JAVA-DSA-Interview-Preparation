import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {

            System.out.println("Calcultor Programs Starts");
            System.out.println();
            System.out.print("Enter the Operator : ");

            char charc = s.next().charAt(0);

            if (charc == '+' || charc == '-' || charc == '*' || charc == '/' || charc == '%') {

                System.out.print("Enter the Two Number");
                int num1 = s.nextInt();
                int num2 = s.nextInt();

                if (charc == '+') {
                    System.out.println(num1 + num2);
                }
                if (charc == '-') {
                    System.out.println(num1 - num2);
                }
                if (charc == '%') {
                    System.out.println(num1 % num2);
                }
                if (charc == '/') {
                    System.out.println(num1 / num2);
                }
                if (charc == '*') {
                    System.out.println(num1 * num2);
                }

            } else if (charc == 'X' || charc == 'x') {
                break;
            } else {
                System.out.println("Invalid Operator ");
                break;
            }

        }
    }

}

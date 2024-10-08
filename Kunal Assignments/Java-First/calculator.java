import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = s.nextInt();
        int num2 = s.nextInt();

        System.out.println("Enter the Operation you want to do ");
        System.out.println("Enter 1 for Addition");
        System.out.println("Enter 2 for Subraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for Division");

        int a = s.nextInt();
        Cal(num1, num2, a);
    }

    static void Cal(int num1, int num2, int option) {
        if (option == 1)
            System.out.println("Addition of two number: " + (num1 + num2));

        if (option == 2)
            System.out.println("Subraction of two number: " + (num1 - num2));

        if (option == 3)
            System.out.println("Multiplication of two number: " + (num1 * num2));

        if (option == 4)
            System.out.println("Division of two number: " + (num1 / num2));
    }

}

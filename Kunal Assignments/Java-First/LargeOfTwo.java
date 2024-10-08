import java.util.Scanner;

public class LargeOfTwo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Two Numbers: ");
        int num1 = s.nextInt();
        int num2 = s.nextInt();

        if (num1 > num2)
            System.out.println(num1 + " is largest number");
        else
            System.out.println(num2 + " is Largest Number");

        s.close();
    }

}

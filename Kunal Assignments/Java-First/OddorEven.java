import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = s.nextInt();
        CheckOddorEven(num);

        s.close();
    }

    static void CheckOddorEven(int num) {
        if (num % 2 == 0) {
            System.out.println("Its a Even Number");
        } else {
            System.out.println("its a odd number");
        }
    }
}
import java.util.Scanner;

public class CurrencyToUsd {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Indian Rupees: ");
        int money = s.nextInt();

        System.out.println((money * 0.01195) + " is the USD Conversion of input rupees " + money);

        s.close();
    }

}

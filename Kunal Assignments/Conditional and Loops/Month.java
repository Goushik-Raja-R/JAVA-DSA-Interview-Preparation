import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the month: ");
        String month = s.nextLine();
        int c = 0, a = 0;

        if (month.equals("januar") || month.equals("march") || month.equals("may") || month.equals("july")
                || month.equals("august")
                || month.equals("october") || month.equals("december")) {
            for (int i = 1; i <= 31; i++) {
                if (i % 2 == 0) {
                    c++;
                }
            }
            System.out.println("Number of days i will go out in " + month + " are " + c);
        } else if (month.equals("April") || month.equals("june") || month.equals("September")
                || month.equals("November")) {
            for (int i = 1; i <= 30; i++) {
                if (i % 2 == 0) {
                    a++;
                }
            }
            System.out.println("Number of days i will go out in " + month + " are " + a);
        } else if (month.equals("february")) {
            for (int i = 1; i <= 29; i++) {
                if (i % 2 == 0) {
                    a++;
                }
            }
            System.out.println("Number of days i will go out in " + month + " are " + a);
        }
        s.close();
    }
}

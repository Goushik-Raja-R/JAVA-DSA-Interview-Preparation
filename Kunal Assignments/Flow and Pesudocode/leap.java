import java.util.Scanner;

public class leap {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the leap year: ");
        int year = s.nextInt();

        boolean ans = LeapYearOrNot(year);
        if (ans) {
            System.out.println("Its is a leap year");
        } else {
            System.out.println("Its Not a leap year");
        }
    }

    public static boolean LeapYearOrNot(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}

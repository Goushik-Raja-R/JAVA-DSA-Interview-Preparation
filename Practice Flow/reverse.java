import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = s.nextInt();
        int rev = 0;

        while (num > 0) {
            int r = num % 10;
            rev = rev * 10 + r;
            num = num / 10;
        }
        System.out.println(rev);
        s.close();
    }
}

import java.util.Scanner;

public class LargeNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Lest start: ");

        int a = 1, max = 0, num;

        while (a > 0) {
            num = s.nextInt();
            if (num > max) {
                max = num;
            }
            if (num == 0) {
                System.out.println("The largest number is: " + max);
                a = 0;
            }
        }
    }
}

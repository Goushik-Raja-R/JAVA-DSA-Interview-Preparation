import java.util.Scanner;

public class largestnum {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = s.nextInt();
        System.out.print("Enter the value of b: ");
        int b = s.nextInt();
        System.out.print("Enter the value of c: ");
        int c = s.nextInt();

        // if (a > b && a > c) {
        // System.out.println(a + " is the largest");
        // } else if (b > a && b > c) {
        // System.out.println(b + " is the largest");
        // } else {
        // System.out.println(c + " is the largest");
        // }

        int max = Math.max(a, Math.max(b, c));

        System.out.println(max);

    }

}

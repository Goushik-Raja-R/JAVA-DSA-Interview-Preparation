import java.util.Scanner;

public class functioncall {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the name: ");
        String name = s.next();
        char c = Series(name);
        System.out.println(c);

        System.out.print("Enter two number: ");
        int a = s.nextInt();
        int b = s.nextInt();
        int num = adding(a, b);
        System.out.println("Sum of the number " + num);

        System.out.println("Swapping the number: ");
        System.out.print("Enter two number: ");
        int x = s.nextInt();
        int y = s.nextInt();
        swap(x, y);

    }

    static char Series(String name) {
        return name.charAt(3);
    }

    static int adding(int a, int b) {
        return a + b;
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.print("values after Swapping: ");
        System.out.println("value of x: " + a);
        System.out.println("value of y: " + b);
    }

}

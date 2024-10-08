import java.util.Scanner;

public class occurance {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int num = s.nextInt();
        System.out.print("Enter the occurance number you want to find: ");
        int find = s.nextInt();
        int c = 0, rem = 0;
        while (num > 0) {
            rem = num % 10;
            if (rem == find)
                c++;
            num = num / 10;
        }
        System.out.println(c);
        s.close();
    }
}

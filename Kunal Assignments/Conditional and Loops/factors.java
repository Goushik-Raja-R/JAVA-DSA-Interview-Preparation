import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = s.nextInt();
        int ans = fact(num);
        System.out.println("The factor of the Given Number is: "+ ans);
        s.close();
    }

    static int fact(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
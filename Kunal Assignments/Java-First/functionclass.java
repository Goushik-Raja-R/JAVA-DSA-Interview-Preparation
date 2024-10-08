import java.util.Scanner;

public class functionclass {
    static int c = 0;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = s.nextInt();
        boolean ans = PrimeOrNot(num);
        System.out.println(ans);

        System.out.print("Enter number: ");
        int number = s.nextInt();
        boolean res = ArmstrongOrNot(number);
        System.out.println(res);

        s.close();
    }

    static boolean PrimeOrNot(int n) {

        if (n <= 1) {
            return false;
        }

        int c = 2;
        while (c * c <= n) {
            if (n % c * c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }

    static boolean ArmstrongOrNot(int n) {

        int mul = 0, temp = n, temp1 = n;

        while (n != 0) {
            c++;
            n = n / 10;
        }

        while (temp != 0) {
            int rem = temp % 10;
            int sum = 1;
            for (int i = 0; i < c; i++) {
                sum = sum * rem * 1;
            }
            mul = mul + sum;
            temp /= 10;
        }

        if (mul == temp1) {
            System.out.println(mul);
            return true;
        } else
            return false;
    }

}

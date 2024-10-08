import java.util.Scanner;

public class HcfAndLcm {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Two Numbers: ");
        int num1 = s.nextInt();
        int num2 = s.nextInt();

        GcdAndLcm(num1, num2);

        s.close();
    }

    static void GcdAndLcm(int num1, int num2) {
        int min = 0, GCD = 0;
        if (num1 > num2) {
            min = num2;
        } else {
            min = num1;
        }

        for (int i = 1; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                GCD = i;
            }
        }
        System.out.println("GCD is: " + GCD);
        System.out.println("LCM is: " + (num1 * num2) / GCD);
    }
}

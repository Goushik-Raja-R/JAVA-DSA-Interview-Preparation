import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the salary:  ");
        int sal = s.nextInt();
        int incrementedsal = 0;

        if (sal >= 10000) {
            incrementedsal = sal + 2000;
            System.out.println(incrementedsal);
        } else {
            incrementedsal = sal + 1000;
            System.out.println(incrementedsal);
        }
    }

}
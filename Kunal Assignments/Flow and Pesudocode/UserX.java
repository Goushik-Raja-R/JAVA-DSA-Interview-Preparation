import java.util.Scanner;

public class UserX {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int sum = 0;
        String str = "";

        System.out.println("If you want continue Enter INTEGER ");
        System.out.println("If you want Exit Enter X ");

        while (true) {

            str = s.next();

            if (str.equals("x")) {
                System.out.println("The sum of the number is: " + sum);
                break;
            } else {
                int num = Integer.parseInt(str);
                sum = sum + num;
            }
        }
        s.close();
    }
}

import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the what");
        double waht = s.nextInt();
        double hours = s.nextInt();
        double days = s.nextInt();

        System.out.println(waht / 1000); // 0.2

        System.out.println((waht / 1000) * hours);

        System.out.println(((waht / 1000) * hours) * days);

        System.out.println((((waht / 1000) * hours) * days) * 8);

        s.close();
    }
}

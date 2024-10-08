import java.util.Scanner;

public class Tables {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the Number You get Multiple tables foe that number: ");
        int num = s.nextInt();

        MultiplyTables(num);
    }

    static void MultiplyTables(int num) {
        for (int a = 1; a <= 10; a++) {
            System.out.println(a + " * " + num + " = " + a * num);
        }
    }

}

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class PRT {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Principal amount: ");
        int x = s.nextInt();
        System.out.print("Enter Rate of Interest: ");
        int y = s.nextInt();
        System.out.print("Enter Time period: ");
        int z = s.nextInt();

        int ans = SimpleInterest(x, y, z);
        System.out.println("Simple interest is: " + ans);

    }

    static int SimpleInterest(int x, int y, int z) {

        return (x * y * z) / 100;
    }

}

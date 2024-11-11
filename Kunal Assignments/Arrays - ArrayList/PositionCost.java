import java.util.Scanner;

public class PositionCost {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the array Size: ");
        int size = s.nextInt();

        int[] position = new int[size];

        for (int i = 0; i < position.length; i++) {
            position[i] = s.nextInt();
        }

        int ans = minCostToMoveChips(position);
        System.out.println(ans);

    }

    public static int minCostToMoveChips(int[] position) {

        int odd = 0, even = 0;

        for (int i = 0; i < position.length; i++) {
            if (position[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        if (even == position.length || odd == position.length)
            return 0;

        return Math.min(odd, even);

    }
}

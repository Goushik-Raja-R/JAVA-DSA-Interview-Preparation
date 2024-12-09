import java.util.ArrayList;
import java.util.List;

public class GasStation {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>(List.of(1, 13, 17, 23));
        int gas = 5;
        double ans = MinimiseMaxDistance(arr, gas);
        System.out.println(ans);
    }

    public static double MinimiseMaxDistance(ArrayList<Integer> arr, int gas) {

        int[] howMany = new int[arr.size() - 1];

        for (int i = 1; i <= gas; i++) {

            double Max = -1;
            int index = -1;

            for (int j = 0; j < arr.size() - 1; j++) {

                double diff = arr.get(j + 1) - arr.get(j);
                double ans = (double) diff / (howMany[j] + 1);
                System.out.println("Segment " + j + ": diff = " + diff + ", effectiveGap = " + ans);
                if (ans > Max) {
                    Max = ans;
                    index = j;
                }
            }
            howMany[index]++;
            System.out.println("==================================");

            // int res = (arr.get(index) + arr.get(index + 1)) / 2;
            // arr.add(index + 1, res);
        }
        for (int i = 0; i < howMany.length; i++) {
            System.out.println(howMany[i] + "    " + i);
        }
        double FinalAns = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            double diff = arr.get(i + 1) - arr.get(i);
            double Answer = (double) diff / (howMany[i] + 1);
            System.out.println("Final Segment " + i + ": diff = " + diff + ", effectiveGap = " + Answer);
            if (Answer > FinalAns) {
                FinalAns = Answer;
            }
        }
        return FinalAns;
    }
}

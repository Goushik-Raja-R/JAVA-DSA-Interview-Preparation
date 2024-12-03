import java.util.ArrayList;
import java.util.Scanner;;

public class Color {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        ArrayList<ArrayList<String>> twoDList = new ArrayList<>();

        for (int row = 0; row < 3; row++) { // Number of rows

            ArrayList<String> row1 = new ArrayList<>();

            for (int col = 0; col < 3; col++) { // Number of columns
                row1.add(s.next());
            }
            twoDList.add(row1);
        }
        String rulekey = "color";
        String rulevalue = "silver";

        int ans = countMatches(twoDList, rulekey, rulevalue);
        System.out.println(ans);
    }

    public static int countMatches(ArrayList<ArrayList<String>> list, String rulekey, String rulevalue) {

        String[] str = { "type", "color", "name" };
        int ind = 0, count = 0;
        ;

        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(rulekey)) {
                ind = i;
                break;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).get(ind).equals(rulevalue)) {
                count++;
            }
        }

        return count;
    }
}

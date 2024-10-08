import java.util.ArrayList;
import java.util.Scanner;

// 1773. Count Items Matching a Rule : https://leetcode.com/problems/count-items-matching-a-rule/description/

public class CountItemMartch {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter array Size: ");
        int size = s.nextInt();

        ArrayList<ArrayList<String>> list = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                list.get(i).add(s.next());
            }
        }

        System.out.print("Enter RuleKey: ");
        String ruleKey = s.next();
        System.out.print("Enter RuleValue: ");
        String ruleValue = s.next();

        int ans = countMatches(list, ruleKey, ruleValue);
        System.out.println(ans);
    }

    public static int countMatches(ArrayList<ArrayList<String>> list, String ruleKey, String ruleValue) {
        int count = 0, m = 0;
        String[] str = { "type", "color", "name" };
        for (int i = 0; i < str.length; i++) {
            if (ruleKey.equals(str[i])) {
                m = i;
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).get(m).equals(ruleValue))
                    count++;
            }
        }
        return count;
    }
}

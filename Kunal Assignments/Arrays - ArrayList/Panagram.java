import java.util.Scanner;
import java.util.HashSet;

// 1832. Check if the Sentence Is Pangram : https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/

public class Panagram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = s.nextLine();                 //HashSet is used to store unique values

        Boolean ans = checkIfPangram(str);
        System.out.println(ans);

        s.close(); 
    }

    public static Boolean checkIfPangram(String str) {

        HashSet<Character> set = new HashSet<>();
        str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        return set.size() >= 26;

    }

}
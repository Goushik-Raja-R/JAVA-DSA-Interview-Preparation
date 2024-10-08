import java.util.Scanner;

public class StringPalin {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = s.nextLine();
        int a = str.length(), c = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(a - 1 - i)) {
                c++;
            }
        }
        if (c == str.length()) {
            System.out.println("its is palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
        s.close();
    }
}

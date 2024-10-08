import java.util.Scanner;

public class VowelAndConsonant {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = s.nextLine();
        int c = 0, sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                c++;
            } else {
                sum++;
            }
        }

        System.out.println("Number of vowels are: " + c);
        System.out.println("Number of Consonents are: " + sum);

        s.close();
    }
}

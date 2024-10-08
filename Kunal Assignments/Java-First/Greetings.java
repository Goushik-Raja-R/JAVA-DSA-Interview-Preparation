import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = s.nextLine();
        Greet(name);

        s.close();
    }

    static void Greet(String name) {
        System.out.println("You are doing great " + name + " Keep going, don't GIVE UP");
    }
}

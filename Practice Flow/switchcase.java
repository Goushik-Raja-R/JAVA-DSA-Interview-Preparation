import java.util.Scanner;

public class switchcase {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter fruit name: ");
        String fruit = s.nextLine();

        switch (fruit) {
            case "apple":
                System.out.println("red fruit");
                break;
            case "mango":
                System.out.println("citric fruit");
                break;
            case "grapes":
                System.out.println("mini apple");
                break;

            default:
                System.out.println("Invalid");
                break;
        }

        s.close();
    }

}

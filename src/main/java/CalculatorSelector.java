import java.util.Scanner;

public class CalculatorSelector {
    public static int getChoice() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your choice of calculator.");
        System.out.println("0 to exit, 1 for rectangle, and 2 for triangle.");

        int choice = -1;
        while (choice < 0 || choice > 3) {
            System.out.print("Your choice: ");
            choice = scanner.nextInt();
        }

        return choice;
    }
}

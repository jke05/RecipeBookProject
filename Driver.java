import java.util.Scanner;

/**
 * Write a description of class Driver here.
 *
 * @author Gilbert
 * @version 1.1
 */
public class Driver
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        RecipeBook book = new RecipeBook("My Recipe Book", "Gilbert Aquino", "John Espinosa", "Dec 2025");

        boolean running = true;
        while (running) {
            System.out.println("\n--- MENU ---");
            System.out.println("1) List all recipes");
            System.out.println("2) Add a recipe");
            System.out.println("3) Top rated recipe");
            System.out.println("0) Quit");
            System.out.print("Choose: ");

            int choice = scan.nextInt();
            scan.nextLine(); // consume newline

            if (choice == 0) {
                running = false;
            } else {
                System.out.println("Not implemented yet.");
            }
        }

        System.out.println("Goodbye!");
        scan.close();
    }
}

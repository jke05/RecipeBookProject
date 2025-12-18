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

            switch(choice) {
                case 0:
                running = false;
                    break;

                case 1:
                    book.listAll();
                    break;
                
                case 2:
                    addRecipeFlow(scan, book);
                    break;

                case 3:
                    Recipe top = book.getTopRated();
                    if (top == null) {
                        System.out.println("No recipes yet.");
                    } else {
                        System.out.println("Top rated recipe:");
                        System.out.println(top);
                    }
                    break;
                
                default: 
                    System.out.println("Invalid Choice.");
            }
        }
        System.out.println("Goodbye!");
        scan.close();
    }
    
     private static void addRecipeFlow(Scanner scan, RecipeBook book) {
        System.out.print("Enter recipe title: ");
        String title = scan.nextLine();

        System.out.print("Enter servings: ");
        int servings = scan.nextInt();
        scan.nextLine(); // consume newline

        Recipe r = new Recipe(title, servings);

        // Rating (optional)
        System.out.print("Enter a rating 1-5 (or 0 to skip): ");
        double rating = scan.nextDouble();
        scan.nextLine();
        if (rating != 0) {
            r.addRating(rating);
        }

        // Ingredients loop
        boolean addingIngredients = true;
        while (addingIngredients) {
            System.out.print("Add ingredient? (y/n): ");
            String yn = scan.nextLine().trim().toLowerCase();

            if (!yn.equals("y")) {
                addingIngredients = false;
            } else {
                System.out.print("Ingredient name: ");
                String name = scan.nextLine();

                System.out.print("Quantity: ");
                double qty = scan.nextDouble();
                scan.nextLine();

                System.out.print("Unit (ML, LITER, CUP, GRAM): ");
                String unitStr = scan.nextLine().trim().toUpperCase();

                Unit unit;
                try {
                    unit = Unit.valueOf(unitStr);
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid unit, defaulting to CUP");
                    unit = Unit.CUP;
                }

                Ingredient ing = new Ingredient(name, qty, unit);
                r.addIngredient(ing);
            }
        }

        book.addRecipe(r);
        System.out.println("Recipe added!");
    }
}


        

import java.util.Scanner;

/**
 * The Driver class contains the main method and provides
 * a menu interface to interact with RecipeBook.
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
            System.out.println();
            System.out.println("=======================================");
            System.out.println("              RECIPE BOOK              ");
            System.out.println("=======================================");  
            System.out.println("1) Print book details");
            System.out.println("2) List all recipes");
            System.out.println("3) List by type");
            System.out.println("4) Search by title, ingredient, or tag");
            System.out.println("5) Print recipe details");
            System.out.println("6) Rate a recipe");
            System.out.println("7) List top-rated recipes");
            System.out.println("8) Scale by number of servings");
            System.out.println("9) Add your own recipe");
            System.out.println("---------------------------------------");
            System.out.println("0) Exit");
            System.out.println("=======================================");
            System.out.print("Choose: ");

            int choice = scan.nextInt();
            scan.nextLine(); // consume newline

            switch(choice) {
                case 0:
                running = false;
                    break;

                case 1:
                    book.printDetails();
                    System.out.println();
                    break;
                
                case 2:
                    book.listAll();
                    System.out.println();
                    break;

                case 3:
                    book.listByType();
                    System.out.println();
                    break;
                    
                case 4:
                    System.out.println("Search by: ");
                    System.out.println("1) Title");
                    System.out.println("2) Ingredient");
                    System.out.println("3) Tag");
                    System.out.print("Choose: ");
                    
                    int s = scan.nextInt();
                    scan.nextLine();
                    
                    System.out.print("Enter search term: ");
                    String term = scan.nextLine();
                    
                    if (s == 1) {
                        book.searchByTitle(term);
                    } else if (s ==2) {
                        book.searchByIngredient(term);
                    } else if (s == 3) {
                        book.searchByTag(term);
                    } else {
                        System.out.println("Invalid search.");
                    }
    
                    System.out.println();
                    break;
                    
                case 5:
                    System.out.print("Enter the recipe title to print: ");
                    String t1 = scan.nextLine();
                    Recipe r1 = book.findByTitle(t1);
                    if (r1 == null) System.out.println("Recipe not found.");
                    else r1.printRecipe();
                    System.out.println();
                    break;
                
                case 6:
                    System.out.print("Enter recipe title to rate: ");
                    String t2 = scan.nextLine();
                    Recipe r2 = book.findByTitle(t2);
                    if (r2 == null) {
                        System.out.println("Recipe not found.");
                    } else {
                        while (true) {
                            System.out.print("Enter rating 1-5 (0 to stop): ");
                            double rating = scan.nextDouble();
                            scan.nextLine();
                            if (rating == 0) break;
                            r2. addRating(rating);
                        }
                    }
                    System.out.println();
                    break;
                    
                case 7:
                    System.out.println("Top rated recipe:");
                    System.out.println(book.getTopRated());
                    System.out.println();
                    break;
                    
                case 8: 
                    System.out.print("Enter recipe title to scale: ");
                    String t3 = scan.nextLine();
                    Recipe r3 = book.findByTitle(t3);
                    if (r3 == null) {
                        System.out.println("Recipe not found.");
                    } else {
                        System.out.print("enter new servings: ");
                        int ns = scan.nextInt();
                        scan.nextLine();
                        r3.scale(ns);
                        r3.printRecipe();
                    }
                    
                    System.out.println();                
                    break;
                    
                case 9:
                    
                    System.out.println("Select recipe type:");
                    System.out.println("1) Main Dish");
                    System.out.println("2) Drink");
                    System.out.println("3) Dessert");
                    System.out.print("Choose: ");
                    
                    int type = scan.nextInt();
                    scan.nextLine();

                    System.out.print("Enter recipe title: ");
                    String newTitle = scan.nextLine();
                    
                    System.out.print("Enter servings: ");
                    int newServings = scan.nextInt();
                    scan.nextLine();
                    
                    Recipe newRecipe;
                    
                if (type == 1) {
                    System.out.print("Contains protein? (true/false): ");
                    boolean protein = scan.nextBoolean();
                    scan.nextLine();
                    newRecipe = new MainDishRecipe(newTitle, newServings, protein);
                
                } else if (type == 2) {
                    System.out.print("Contains alcohol? (true/false): ");
                    boolean alcohol = scan.nextBoolean();
                    scan.nextLine();
                    newRecipe = new DrinkRecipe(newTitle, newServings, alcohol);
                
                } else if (type == 3) {
                    System.out.print("Has sugar? (true/false): ");
                    boolean sugar = scan.nextBoolean();
                    scan.nextLine();
                    newRecipe = new DessertRecipe(newTitle, newServings, sugar);
                
                } else {
                    System.out.println("Invalid type. Defaulting to Main Dish.");
                    newRecipe = new MainDishRecipe(newTitle, newServings, false);
                }
                    
                    while (true) {
                        System.out.print("Enter rating 1-5 (or 0 to stop): ");
                        double rt = scan.nextDouble();
                        scan.nextLine();
                        if (rt == 0) break;
                        newRecipe.addRating(rt);
                    }
                    
                    while (true) {
                        System.out.print("Add ingredient? (y/n): ");
                        String yn = scan.nextLine().trim().toLowerCase();
                        if (!yn.equals("y")) break;
                        
                        System.out.print("Ingredient name: ");
                        String ingName = scan.nextLine();
                        
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
                        
                        Ingredient ing = new Ingredient(ingName, qty, unit);
                        newRecipe.addIngredient(ing);
                    }
                        
                        while (true) {
                            System.out.print("Add tag? (y/n): ");
                            String yn = scan.nextLine().trim().toLowerCase();
                            if (!yn.equals("y")) break;
                            
                            System.out.print("Tag (EASY, QUICK, HEALTHY, SPICY, HALAL): ");
                            String tagName = scan.nextLine().trim().toUpperCase();
                            
                            Tag tag = Tag.valueOf(tagName);
                            newRecipe.addTag(tag);
                    }
                    
                    book.addRecipe(newRecipe);
                    System.out.println();
                    System.out.println("Recipe added!");
                    
                    break;
                
                default: 
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            
        }
        
        System.out.println("Goodbye!");
        scan.close();    
    }
    
    private static void searchTitleContains(RecipeBook book, String term) {
        term = term.toLowerCase();
        boolean foundAny = false;
    
        for (Recipe r : book.getRecipes()) {   // requires getRecipes() in RecipeBook
            if (r == null || r.getTitle() == null) continue;
    
            if (r.getTitle().toLowerCase().contains(term)) {
                System.out.println("- " + r.getTitle());
                foundAny = true;
            }
        }
    
        if (!foundAny) System.out.println("No matches found.");
    }

    private static void searchIngredientContains(RecipeBook book, String term) {
        term = term.toLowerCase();
        boolean foundAny = false;
    
        for (Recipe r : book.getRecipes()) {   // requires getRecipes() in RecipeBook
            if (r == null) continue;
    
            boolean printed = false;
    
            for (Ingredient ing : r.getIngredients()) { // requires getIngredients() in Recipe
                if (ing == null || ing.getName() == null) continue;
    
                if (ing.getName().toLowerCase().contains(term)) {
                    if (!printed) {
                        System.out.println("- " + r.getTitle());
                        printed = true;
                        foundAny = true;
                    }
                }
            }
        }
    }
}



        

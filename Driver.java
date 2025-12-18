
/**
 * Write a description of class Driver here.
 *
 * @author Gilbert
 * @version 1.1
 */
public class Driver
{
    public static void main(String[] args) {
        RecipeBook book = new RecipeBook("My Recipe Book", "John", "Gilbert", "Dec 2025");
        
        System.out.println(book);
        
        Recipe r1 = new Recipe("Pancakes", 2);
        r1.addRating(4.0);
        book.addRecipe(r1);
        
        System.out.println("All Recipes:");
        book.listAll();
        
        Ingredient flour = new Ingredient("Flour", 1.0, Unit.CUP);
        r1.addIngredient(flour);
        
        System.out.println("\nBefore scaling:");
        r1.printRecipe();
        
        r1.scale(4);
        System.out.println("After scaling:");
        r1.printRecipe();
    }
}

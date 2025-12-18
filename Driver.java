
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
        
        System.out.println("All Recipes: ");
        book.listAll();
    }
}

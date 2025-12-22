
/**
 * Represents a drink recipe. Extends Recipe and includes
 * information about whether the drink contains alcohol.
 *
 * @author Gilbert Aquino
 * @version 1.1
 */
public class DrinkRecipe extends Recipe
{
    private boolean containsAlcohol;

    public DrinkRecipe(String title, int servings, boolean containsAlcohol){
        super(title, servings);
        this.containsAlcohol = containsAlcohol;
    }
        
    @Override 
    public void printRecipe() {
        System.out.println("Drink Recipe: " + getTitle());
        System.out.println("Servings: " + getServings());
        System.out.println("Contains alcohol: " + containsAlcohol);
        System.out.println("Average Rating: " + getAverageRating());
        System.out.println("Ingredients: " + getIngredients());
        System.out.println("Tags: " + getTags());
    }
}

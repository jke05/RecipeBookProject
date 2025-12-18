
/**
 * Represents a main dish recipe. Extends Recipe and includes
 * information about whether the dish contains protein.
 *
 * @author Gilbert Aquino
 * @version V 1.0
 */
public class MainDishRecipe extends Recipe{
    private boolean containsProtein;
    
    public MainDishRecipe(String title, int servings, boolean containsProtein){
        super(title, servings);
        this.containsProtein = containsProtein;
    }
    
    @Override
    public void printRecipe() {
        System.out.println("Main Dish Recipe: " + getTitle());
        System.out.println("Servings: " + getServings());
        System.out.println("Contains protein: " + containsProtein);
        System.out.println("Average Rating: " + getAverageRating());
        System.out.println("Ingredients: " + getIngredients());
        System.out.println("Tags: " + getTags());
    }
}

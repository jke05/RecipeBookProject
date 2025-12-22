
/**
 * Represents a dessert recipe. Extends Recipe and includes
 * information about whether the dessert contains sugar.
 *
 * @author Gilbert Aquino
 * @version 1.0
 */
public class DessertRecipe extends Recipe
{
    private boolean hasSugar;
    
    public DessertRecipe(String title, int servings, boolean hasSugar){
        super(title, servings);
        this.hasSugar = hasSugar;
    }
    
    @Override
    public void printRecipe() {
        System.out.println("Dessert Recipe: " + getTitle());
        System.out.println("Servings: " + getServings());
        System.out.println("Has sugar: " + hasSugar);
        System.out.println("Average Rating: " + getAverageRating());
        System.out.println("Ingredients: " + getIngredients());
        System.out.println("Tags: " + getTags());
    }
}

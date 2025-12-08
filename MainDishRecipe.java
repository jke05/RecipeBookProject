
/**
 * Write a description of class MainDishRecipe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainDishRecipe extends Recipe
{
    private boolean containsProtein;
    
    public MainDishRecipe(String title, int servings, boolean containsProtein){
        super(title, servings);
        this.containsProtein = containsProtein;
    }
    
    public void act(){
        
    }
    
    /*
     * @Override
     * 
     * METHOD printRecipe
     *   PRINT "Main Dish Recipe: " + title
     *   PRINT "Servings: " + servings
     *   PRINT "Contains protein: " + containsProtein
     *   PRINT "Average Rating: " + getAverageRating()
     *   PRINT ingredients list
     *   PRINT tags (if applicable)
     *   END METHOD
     */
    
    //END CLASS
}

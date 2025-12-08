
/**
 * Write a description of class DessertRecipe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DessertRecipe extends Recipe
{
    private boolean hasSugar;
    
    public DessertRecipe(String title, int servings, boolean hasSugar){
        super(title, servings);
        this.hasSugar = hasSugar;
    }
    /*
     * METHOD DessertRecipe(title, servings, hasSugar)
     *      CALL Recipe constructor with title and servings
     *      SET this.hasSugar = hasSugar
     * END METHOD
     */
    
    /*
     * OVERRIDE METHOD printRecipe
     *      PRINT "Dessert Recipe: " + title
     *      PRINT "Servings: " + servings
     *      PRINT "Has sugar: " + hasSugar
     *      PRINT "Average Rating: " + getAverageRating()
     *      PRINT ingredients list
     *      PRINT steps or tags if applicable
     * END METHOD
     */
    
    //END CLASS
}

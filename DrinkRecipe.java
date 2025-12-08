
/**
 * Write a description of class DrinkRecipe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DrinkRecipe extends Recipe
{
    private boolean containsAlcohol;

    public DrinkRecipe(String title, int servings, boolean containsAlcohol){
        super(title, servings);
        this.containsAlcohol = containsAlcohol;
        
        /*
         * METHOD DrinkRecipe(title, servings, isAlcoholic)
         *      CALL Recipe constructor with title and servings
         *      SET this.isAlcoholic = isAlcoholic
         * END METHOD
         */
        
        /*
         * OVERRIDE METHOD printRecipe
         *      PRINT "Drink Recipe: " + title
         *      PRINT "Servings: " + servings
         *      PRINT "Contains alcohol: " + isAlcoholic
         *      PRINT "Average Rating: " + getAverageRating()
         *      PRINT ingredients list
         *      PRINT tags if applicable
         * END METHOD
         */
        
        //END CLASS
    }
}

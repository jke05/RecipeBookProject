
/**
 * Write a description of class DessertRecipe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DessertRecipe extends Recipe
{
    // instance variables - replace the example below with your own
    String newTitle;
    int newServings;
    private boolean containsSugar = true;

    /**
     * Constructor for objects of class DessertRecipe
     */
    public DessertRecipe(String newTitle, int newServings, boolean hasSugar)
    {
        this.newTitle = newTitle;
        this.newServings = newServings;
        this.containsSugar = containsSugar;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
}

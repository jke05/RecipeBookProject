
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
    public DessertRecipe(String newTitle, int newServings, boolean hasSugar)
    {
        this.newTitle = newTitle;
        this.newServings = newServings;
        this.containsSugar = containsSugar;
    }
}

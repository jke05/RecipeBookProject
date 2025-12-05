import java.util.ArrayList;

/**
 * Write a description of class Recipe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Recipe
{
    private String title;
    private ArrayList<Ingredient> ingredients = new ArrayList<>();
    private ArrayList<Tag> tags = new ArrayList<>();
    private int servings;
    private ArrayList<Rating> rating = new ArrayList<>();

    public Recipe(String title, int servings){
        this.title = title;
        this.servings = servings;
    }
    
    public void addIngredient(Ingredient ingredient){
        //ADD ingredient TO ingredients
    }
    
    public void printRecipe(){
        /*
         * PRINT title, servings, rating, comment, ingredients, tags
         */
    }
    
    public void addRating(/*score, comment*/){
        /*Create new Rating using score, comment
         * ADD Rating to ratings
           */
    }
    
    public void scale(int servings){
        //IF newServings <= 0
        //STOP
        //ELSE 
        
        /*
         * SET factor = newServings / servings
         * 
         * for EACH ingredient IN ingredients
         * ingredient.quantity = ingredient.quantity * factor
         * END FOR LOOP
         * 
         * SET servings = newServings
         */
    }
    
   
    
}
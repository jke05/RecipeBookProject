import java.util.ArrayList;

/**
 * Write a description of class Recipe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Recipe
{
    String title;
    ArrayList<Ingredient> ingredient = new ArrayList<Ingredient>();
    RecipeType type;
    ArrayList<Tag> tag = new ArrayList<Tag>();
    int servings;
    ArrayList<Rating> rating = new ArrayList<>();

    public Recipe(){
        
    }
    
    public void searchByIngredient(ArrayList<Ingredient> ingredient){
        
    }
    
    public void searchByTag(ArrayList<Tag> tag){
        
    }
    
    public void printRecipe(){
        
    }
    
    public void addRating(double rating){
        
    }
    
    public void addComment(String comment){
        
    }
    
    public void scale(int servings){
        
    }
    
}
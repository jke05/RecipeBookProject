import java.util.ArrayList;

/**
 * Write a description of class Recipe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Recipe
{
    private String title;
    private ArrayList<Ingredient> ingredient = new ArrayList<>();
    private ArrayList<Tag> tags = new ArrayList<>();
    private int servings;
    private ArrayList<Rating> rating = new ArrayList<>();

    public Recipe(String title, int servings){
        this.title = title;
        this.servings = servings;
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
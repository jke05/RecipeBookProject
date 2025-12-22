import java.util.ArrayList;

/**
 * The Recipe class represents a single recipe.
 * It stores the recipe title, ingredients, tags,
 * ratings, and serving information.
 * 
 * @author Gilbert Aquino
 * @version 1.1
 */

public class Recipe
{
    private String title;
    private ArrayList<Ingredient> ingredients = new ArrayList<>();
    private ArrayList<Tag> tags = new ArrayList<>();
    private int servings;
    private ArrayList<Double> ratings = new ArrayList<>();
    
    public Recipe() {
        this.title = "";
        this.servings = 0;
    }
    
    public Recipe(String title, int servings){
        this.title = title;
        this.servings = servings;
    }
    
    public void addIngredient(Ingredient ingredient){
        //ADD ingredient TO ingredients
        if (ingredient != null) {
            ingredients.add(ingredient);
        }
    }
    
    public void printRecipe(){
        /*
         * PRINT title, servings, average rating, ingredients, tags
         */
        System.out.println("Title: " + title);
        System.out.println("Servings: " + servings);
        System.out.println("Average Rating: " + getAverageRating() + " Stars");
        System.out.println("Ingredients: " + ingredients);
        System.out.println("Tags: " + tags);
    }
    
    public void addRating(double rating){
        //ADD rating to ratings
        if (rating >= 1 && rating <= 5){
            ratings.add(rating);
        }
    }
    
    public void scale(int newServings){
        if (newServings <= 0) {
            return;
        }
        
        double factor = (double) newServings/servings;
        
        for (Ingredient ingredient : ingredients) {
            ingredient.setQuantity(ingredient.getQuantity() * factor);
        }
        servings = newServings;
    }
    
    
    public double getAverageRating() {
        //IF RATINGS IS EMPTY
        //SET total = 0
        //ELSE
        
        //for EACH r in ratings
        //SET total += r
        //RETURN total / ratings size
        
        if(ratings.isEmpty()) {
            return 0;
        }
        double total = 0;
        for(double r : ratings) {
            total += r;
        }
        return total/ratings.size();
    }
    
    public String getTitle() {
        return title;
    }
    
    public void addTag(Tag tag) {
        if(tag != null) {
            tags.add(tag);
        }
    }
    
    public ArrayList<Tag> getTags() {
        return tags;
    }
        
    public int getServings() {
        return servings;
    }
    
    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }
    
    @Override 
    public String toString() {
        return "Recipe{" +
               "title=" + title+ 
               ", servings=" + servings +
               ", averageRating=" + getAverageRating() +
               "}";
    }
}
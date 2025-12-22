import java.util.ArrayList;

/**
 * Represents a collection of recipes. Allows recipes to be added,
 * listed, searched, and compared to find the top-rated recipe.
 * 
 * @author John Knight Espinosa & Gilbert Aquino
 * @version 1.1
 */
public class RecipeBook
{
    private String title;
    private ArrayList<Recipe> recipes = new ArrayList<Recipe>();
    private String author;
    private String editor;
    private String creationDate;
    

    public RecipeBook(String title, String author, String editor, String creationDate){
        this.title = title;
        this.author = author;
        this.editor = editor;
        this.creationDate = creationDate;
    }
    
    //printDetails shouldn't take paramaters
    public void printDetails(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(editor);
        System.out.println(creationDate);
    }
    
    public String getTitle(){
        return title;
    }
    
    public void addRecipe(Recipe newRecipe){
        recipes.add(newRecipe);
    }
    
    @Override
    public String toString(){
        return this.title + " " + this.author + " " + this.editor + " " +  this.creationDate;
    }

    public void printString(){
        System.out.println(this);
    }
    
    public ArrayList<Recipe> getRecipes() {
        return recipes;
    }
    
    public void listAll(){
        for (Recipe r : recipes){
            System.out.println(r);
        }
    }
    
    public void listByType(){
        System.out.println("=== Main Dishes ===");
        for (Recipe r : recipes){
            if (r instanceof MainDishRecipe){
                r.printRecipe();
            }
        }
        
        System.out.println("=== Drinks ===");
        for (Recipe r : recipes){
            if (r instanceof DrinkRecipe){
                r.printRecipe();
            }
        }
        
        System.out.println("=== Desserts ===");
        for (Recipe r : recipes){
            if (r instanceof DessertRecipe){
                r.printRecipe();;
            }
            }
        }
    
    public void searchByTitle(String title){
        boolean found = false;
        String q = title.trim().toLowerCase();
        
        for(Recipe r : recipes){
           if (r.getTitle().equalsIgnoreCase(title)){
               System.out.println(r.getTitle());
               found = true;
           }
        }
           
        if(!found) {
            System.out.println("No recipes found.");
        }
    }
    
    public Recipe findByTitle(String title) {
        for (Recipe r: recipes) {
            if(r.getTitle().equalsIgnoreCase(title)) {
                return r;
            }
        }
        return null; 
    }
    
    public void searchByIngredient(String ingredientName) {
        boolean found = false;
        String q = ingredientName.trim().toLowerCase();
        
        for (Recipe r : recipes) {
            boolean printed = false;
            
                for (Ingredient i : r.getIngredients()){
                    if (i.getName().toLowerCase().contains(q)) {
                        if (!printed) {
                        System.out.println(r.getTitle());
                        printed = true;
                        found = true;
                    }
                }
            }
        }
          
        if (!found){
            System.out.println("No recipes found with that ingredient.");
        }
    }
    
    public void searchByUnit(String unitName) {
        Unit wanted = Unit.valueOf(unitName.toUpperCase());
        for (Recipe r : recipes) {
            for (Ingredient i : r.getIngredients()) {
                if (i.getUnit() == wanted) {
                    System.out.println(r);
                    }
                }
            }
    }
    
    public void searchByTag(String tagName){
        boolean found = false;
        String q = tagName.trim().toUpperCase();
        
        for (Recipe r : recipes) {
            boolean printed = false;
            
            for (Tag t: r.getTags()) {
                if (t.name().startsWith(q)) {
                    if (!printed) {
                        System.out.println(r.getTitle() + " (tag: " + t.name() + ")");
                        printed = true;
                        found = true;
                    }
                }
            }
        }
        
        if (!found) {
            System.out.println("No recipes found with that tag.");
        }
    }
       
    public Recipe getTopRated(){
        if(recipes.isEmpty()){
            return null;
        }
        
        Recipe bestRecipe = recipes.get(0);
        for (Recipe r: recipes) {
                if (r.getAverageRating() > bestRecipe.getAverageRating()){
                    bestRecipe = r;
                }   
        }
        return bestRecipe;
    }
}
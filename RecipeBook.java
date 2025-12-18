import java.util.ArrayList;

/**
 * Represents a collection of recipes. Allows recipes to be added,
 * listed, searched, and compared to find the top-rated recipe.
 * 
 * @author John Knight Espinosa & Gilbert Aquino
 * @version 1.0
 */
public class RecipeBook
{
    String title;
    ArrayList<Recipe> recipes = new ArrayList<Recipe>();
    String author;
    String editor;
    String creationDate;
    

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
    
    public Recipe findByTitle(String title) {
        for (Recipe r: recipes) {
            if(r.getTitle().equalsIgnoreCase(title)) {
                return r;
            }
        }
    return null; 
    }
    
    
    public void listAll(){
        for (Recipe r : recipes){
            System.out.println(r);
        }
    }
    
    public void listByType(){
        for (Recipe r : recipes){
            if (r instanceof MainDishRecipe){
                System.out.println(r);
            }
        }
        
        for (Recipe r : recipes){
            if (r instanceof DrinkRecipe){
                System.out.println(r);
            }
        }
        
        for (Recipe r : recipes){
            if (r instanceof DessertRecipe){
                System.out.println(r);
            }
            }
        }
    
    public void searchByTitle(String title){
        for(Recipe r : recipes){
        if (getTitle().equalsIgnoreCase(title)){
            System.out.println(r);
        }else{
            System.out.print("No recipe found");
        }
        }
    }   
    
    public Recipe getTopRated(){
        if(recipes.isEmpty()){
            return null;
        }
        
        Recipe bestRecipe = recipes.get(1);
        for (Recipe r: recipes) {
            if (r.getAverageRating() > bestRecipe.getAverageRating()){
                bestRecipe = r;
            }   
    }
    return bestRecipe;
    }
}
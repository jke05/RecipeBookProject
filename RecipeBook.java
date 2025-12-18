import java.util.ArrayList;

public class RecipeBook
{
    String title;
    ArrayList<Recipe> recipe = new ArrayList<Recipe>();
    String author;
    String editor;
    String creationDate;
    

    public RecipeBook(String title, String author, String editor, String creationDate){
        this.title = title;
        this.author = author;
        this.editor = editor;
        this.creationDate = creationDate;
    }
    
    public void printDetails(String title, String author, String editor, String creationDate){
        System.out.println(title);
        System.out.println(author);
        System.out.println(editor);
        System.out.println(creationDate);
    }
    
    public String getTitle(){
        return title;
    }
    
    @Override
    public String toString(){
        return this.title + " " + this.author + " " + this.editor + " " +  this.creationDate;
    }

    public void printString(){
        System.out.println(this);
    }
    
    public void listAll(){
        for (Recipe r : recipe){
            System.out.println(getTitle());
        }
    }
    
    public void listByType(){
        for (Recipe r : recipe){
            if (r instanceof MainDishRecipe){
                printString();
            }
        }
        
        for (Recipe r : recipe){
            if (r instanceof DrinkRecipe){
                printString();
            }
        }
        
        for (Recipe r : recipe){
            if (r instanceof DessertRecipe){
                printString();
            }
            }
        }
    
    public void searchByTitle(String title){
        for(Recipe r : recipe){
           if (getTitle().equalsIgnoreCase(title)){
               printString();
           }else{
               System.out.print("No recipe found");
           } 
        }
    }   
    
    public void getTopRated(){
        /*
         *IF recipe list IS empty
         *      RETURN null
         *END IF
         *
         *SET bestRecipe = first recipe IN list
         *
         *FOR EACH recipe IN recipe list
         *
         *IF recipe.getAverageRating() > bestRecipe.getAverageRating()
         *SET best recipe = recipe
         *END IF
         *
         *END FOR
         *
         *return bestRecipe
         */
    }
    
    public void addRecipe(Recipe newRecipe){
        recipe.add(newRecipe);
    }
}
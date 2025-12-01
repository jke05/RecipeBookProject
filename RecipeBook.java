import java.util.ArrayList;

/**
 * Write a description of class RecipeBook here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RecipeBook
{
    String title;
    ArrayList<Recipe> recipe = new ArrayList<Recipe>();
    String author;
    String editor;
    String creationDate;
    

    public RecipeBook(){
        
    }
    
    public void printDetails(String title, String author, String editor, String creationDate){
        System.out.println(title);
        System.out.println(author);
        System.out.println(editor);
        System.out.println(creationDate);
    }
    
    public void listAll(){
        
    }
    
    public void listByType(){
        
    }
    
    public void searchByTitle(String title){
        
    }
    
    public void getTopRated(){
        
    }
    
    public void addRecipe(){
        
    }
}
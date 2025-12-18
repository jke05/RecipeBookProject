

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class RecipeBookTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
class Recipe{}
class MainDishRecipe extends Recipe{}
class DrinkRecipe extends Recipe{}
class DessertRecipe extends Recipe{}
public class RecipeBookTest
{
    private RecipeBook book;

    @BeforeEach
    public void setUp(){
        book = new RecipeBook("RecipeBookOfGood", "John", "Gilbert", "Dec 8th 2025");
        book.title = "The Book";
    }
    
    @Test
    

    @AfterEach
    public void tearDown(){
        
    }
}
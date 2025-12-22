

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the RecipeBook class.
 * Verifies adding recipes and identifying the top-rated recipe.
 *
 * @author  Gilbert Aquino
 * @version 1.0
 */

public class RecipeBookTest
{
    private RecipeBook book;
    
    public RecipeBookTest(){
        
    }

    @BeforeEach
    public void setUp(){
        book = new RecipeBook("The Book", "John", "Gilbert", "Dec 8th 2025");
    }
    
    @AfterEach
    public void tearDown(){
        book = null;
    }
    
    @Test
    public void testSearchByTitle(){
        Recipe r = new Recipe("Pancakes", 2);
        book.addRecipe(r);

        assertDoesNotThrow(() -> book.searchByTitle("Pancakes"));
    }
}
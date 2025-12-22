

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
    
    
    @BeforeEach
    public void setUp(){
        book = new RecipeBook("RecipeBookOfGood", "John", "Gilbert", "Dec 8th 2025");
    }
    
    
     // Verify that adding a recipe increases the list size
    @Test
     public void testAddRecipe() {
        Recipe r = new Recipe("Pancakes", 2);
        book.addRecipe(r);

        assertEquals(1, book.getRecipes().size());
    }
    
     // Ensure findByTitle works and ignores case
    @Test
     public void testFindByTitleFoundIgnoreCase() {
        Recipe r = new Recipe("Pancakes", 2);
        book.addRecipe(r);

        Recipe found = book.findByTitle("pAnCaKeS");
        assertNotNull(found);
        assertEquals("Pancakes", found.getTitle());
    }
    
     // Searching for a missing title should return null
    @Test
    public void testFindByTitleNotFoundReturnsNull() {
        book.addRecipe(new Recipe("Pancakes", 2));

        assertNull(book.findByTitle("Waffles"));
    }
    
     // If no recipes exist, top-rated should be null
    @Test
    public void testGetTopRatedEmptyReturnsNull() {
        assertNull(book.getTopRated());
    }
    
    // Verify that the recipe with the highest average rating is returned
    @Test
    public void testGetTopRatedReturnsHighest() {
        Recipe low = new Recipe("Toast", 1);
        low.addRating(2);

        Recipe high = new Recipe("Steak", 2);
        high.addRating(5);

        book.addRecipe(low);
        book.addRecipe(high);

        assertEquals("Steak", book.getTopRated().getTitle());
    }
}
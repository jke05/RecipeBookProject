

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the Recipe class.
 * Verifies rating logic, average rating calculation,
 * and input validation.
 *
 * Gilbert Aquino
 * @version 1.0 Deliverable 2
 */
public class RecipeTest
{    
    private Recipe recipe;
    
    /**
     * Default constructor for test class RecipeTest
     */
    public RecipeTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        recipe = new Recipe("Pancakes", 2);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
        recipe = null;
    }
    
    @Test
     public void testGetAverageRating()
    {
        assertEquals(0.0, recipe.getAverageRating(), 0.0001);
    }
    
    @Test
    public void testAddRating() {
        recipe.addRating(4.0);
        assertEquals(4.0, recipe.getAverageRating(), 0.0001);
    }
    
    @Test
    public void testInvalidLowRating() {
        recipe.addRating(0.0);  // invalid
        recipe.addRating(4.0);  // valid

        assertEquals(4.0, recipe.getAverageRating(), 0.0001);
    }
    
    @Test
     public void testInvalidHighRating()
    {
        recipe.addRating(6.0);  // invalid
        recipe.addRating(2.0);  // valid

        assertEquals(2.0, recipe.getAverageRating(), 0.0001);
    }
}


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
    
    // New recipe with no ratings should average to 0
    @Test
     public void testAverageRatingEmpty()
    {
        assertEquals(0.0, recipe.getAverageRating());
    }
    
    // A valid rating (1-5) should be included in the average
    @Test
    public void testAddValidRating() {
        recipe.addRating(4.0);
        assertEquals(4.0, recipe.getAverageRating());
    }
    
    // Ratings below 1 should be ignored
    @Test
    public void testInvalidLowRating() {
        recipe.addRating(0.0);  // invalid
        recipe.addRating(4.0);  // valid

        assertEquals(4.0, recipe.getAverageRating());
    }
    
    // Ratings above 5 should be ignored
    @Test
     public void testInvalidHighRating()
    {
        recipe.addRating(6.0);  // invalid
        recipe.addRating(2.0);  // valid

        assertEquals(2.0, recipe.getAverageRating());
    }
    
    // Scaling should update servings and ingredient quantities proportionally
    @Test
    public void testScaleChangesServingsAndQuantities() {
        Ingredient flour = new Ingredient("Flour", 2.0, Unit.CUP);
        recipe.addIngredient(flour);

        recipe.scale(4); // factor = 4/2 = 2

        assertEquals(4, recipe.getServings());
        assertEquals(4.0, flour.getQuantity(), 0.0001);
    }
}

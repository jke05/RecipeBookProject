
/**
 * Write a description of class Ingredient here.
 *
 * @author (Gilbert)
 * @version 1.0
 */
public class Ingredient
{
    private String name;
    private double quantity;
    private Unit unit;
    

    /**
     * Constructor for objects of class Ingredient
     */
    
    public Ingredient(String name,double quantity, Unit unit)
    {
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
    }
}
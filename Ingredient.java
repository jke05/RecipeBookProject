
/**
 * Represents an ingredient used in a recipe, including its name,
 * quantity, and measurement unit.
 *
 * @author Gilbert Aquino
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
    
    public double getQuantity() {
        return quantity;
    }
    
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    
    @Override
    public String toString() {
        return name + " (" + quantity + " " + unit + ")";
    }
}
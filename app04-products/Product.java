/**
 * Model some details of a product sold by a company.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 */
public class Product
{
    private int id;
    private String name;
    private int quantity;

    /**
       * Constructor for objects of class Product.
     * The initial stock quantity is zero.
     * 
     */
    public Product(int id, String name)
    {
        this.id = id;
        this.name = name;
        quantity = 0;
    }

    /**
     * return The product's id.
     */
    public int getID()
    {
        return id;
    }

    /**
     * return The product's name.
     */
    public String getName()
    {
        return name;
    }

    /**
     * return The quantity in stock.
     */
    public int getQuantity()
    {
        return quantity;
    }

    /**
     * return The id, name and quantity that are in stock.
     */
    public String toString()
    {
        return id + ": " +  name + " stock level: " + quantity;
    }

    /**
     * Restock with the given amount of this product.
     * The current quantity is incremented by the given amount.
     * 
     */
    public void deliver(int amount)
    {
        if(amount > 0) 
        {
            quantity += amount;
        }
        else 
        {
            System.out.println("Attempt to restock " + name +
                               " with a non-positive amount: " + amount);
        }
    }

    /**
     * Sell one of these products.
     * An error is shown if there appears to be no stock.
     */
    public void sellOne()
    {
        if(quantity > 0) 
        {
            quantity--;
        }
        else 
        {
            System.out.println(
                "Attempt to sell an out of stock item: " + name);
        }
  
    
    }

    
    public void renameProduct(String name) 
    {   
        this.name = name; 
    }
    
    

}


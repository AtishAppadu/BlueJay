import java.util.Random;



/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 * modified by Atish
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;
    private Random randomGenerator; 

    /**
     * this product list contains 10 different products from the same company with different id's.
     * .
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        
        randomGenerator = new Random();
        
        manager.addProduct(new Product(101, "Razer BlackWidow mechanical keyboard"));
        manager.addProduct(new Product(102,  "Razer Tournament keyboard"));
        manager.addProduct(new Product(103,  "Razer ornata"));
        manager.addProduct(new Product(104, "Razer blackwidow ultimate"));
        manager.addProduct(new Product(105, "Razer Huntsman Elite"));    
        manager.addProduct(new Product(106, "Razer huntsman Mini"));
        manager.addProduct(new Product(107, "Razer deathadder Mouse")); 
        manager.addProduct(new Product(108, "Razer viper mouse"));  
        manager.addProduct(new Product(109,  "Razer Deathadder V2 Mouse"));
        manager.addProduct(new Product(110,   "Razer Siren Cardoid Microphone"));
        
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    public void runDemo()
    {
        manager.printAllproducts(); 
        demoDeliverproducts(); 
        manager.printAllproducts();
        demoSellProduct(); 
        manager.printAllproducts();
        
    }
    
    /**
     * Show details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void showDetails(int id)
    {
        Product product = getProduct(id);
        
        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }
    
    /**
     * Sell one of the given item.
     * Show the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    private void demoSellProduct()
    {
        int quantity = 0;
        
        for (int id = 101; id < 110; id++)
        {
            quantity = randomGenerator.nextInt(4); 
            manager.sellProduct(id, quantity); 
        }
    }
    
    private void demoDeliverproducts() 
    {   
        int quantity = 0;
        
        for (int id = 101; id < 110; id++)
        {   
            quantity = randomGenerator.nextInt(5) +1;
            manager.deliverProduct(id, quantity); 
            
        }
        
     
    }
    
    
    
    
    
    
    /**
     * Get the product with the given id from the manager.
     * An error message is printed if there is no match.
     * @param id The ID of the product.
     * @return The Product, or null if no matching one is found.
     */
    public Product getProduct(int id)
    {
        Product product = manager.findProduct(id);
        
        if(product == null) 
        {
            System.out.println("Product with ID: " + id +
                               " is not recognised.");
        }
        return product;
    }

    /**
     * @return The stock manager.
     */
    public StockManager getManager()
    {
        return manager;
    }

    
}

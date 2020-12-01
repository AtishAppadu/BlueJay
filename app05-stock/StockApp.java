

/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Atish
 * @version 0.1
 */
public class StockApp
{
    public final int FIRST_ID = 200; 
    
    private InputReader input;
    
    private StockManager manager;
    
    private StockDemo demo; 
    
    private int nextID = FIRST_ID; 
    
    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        input = new InputReader();
        manager = new StockManager();
        demo = new StockDemo(manager); 
    } 
    
    
    /**
     * 
     */
    public void run()
    {
        boolean finished = false;
        
        while(!finished)
        {
            printHeading();
            printMenuChoices();
           
            String choice = input.getInput("please enter Command");
            choice = choice.toLowerCase();
            
            
            executeMenuChoice(choice); 
            
            if(choice.equals("quit"))
                finished = true;
            
        }
    }
    
    /**
     * Menu choices listed to the customer's screen. 
     */
    public void executeMenuChoice(String choice)
    {       
        if(choice.equals("add"))
        {   
            addProduct();
        }
        else if(choice.equals("printall")) 
        {   
            printAllProducts(); 
        }
        else if(choice.equals("remove"))
        {   
            removeProduct(); 
        }
    
    
          else if(choice.equals("rename"))
        {
            //renameProduct();
        }
    
          else if(choice.equals("deliver"))
        {
            deliverProduct();
        }
    
    
        else if(choice.equals("search"))
        {
            searchProduct();
        }

        else if(choice.equals("low-stock"))
        {
            lowStock();
        }

        else if(choice.equals("restock"))
        {
            restock();
        }

        else if(choice.equals("sell"))
        {
            sellProduct();
        }
    
       
    }
    
    
    /**
     * Add a product, required to input the name of the product and ID will be automatically
     * added.
     */
    public void addProduct()
    {   
        
        String value = input.getInput("Please enter the ID of the Product"); 
        int id = Integer.parseInt(value);
       
        String name = input.getInput("Please enter Product Name");
        
        Product product = new Product(nextID, name);
        manager.addProduct(product); 
        
        System.out.println("\nAdded" + product + " to the stock\n");
        nextID++;
    }
    
    /**
     * Remove a product, required to input a product ID in order to remove
     */
    public void removeProduct()
    {   
        System.out.println("Remove an old Product");
        System.out.println();
        
        
        String number = input.getInput("Please enter the ID of the product"); 
        
        int id = Integer.parseInt(number);
        manager.removeProduct(id); 
        
        System.out.println(" Product removed ");
    }
        
     /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    PrintAll:   Print all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println("    Sell:       Sell Products   ");
        System.out.println("    Deliver:    Approved Delivery");
        System.out.println("    Search:     Searching for products");
        System.out.println("    Low Stock:  Prints all low stock products");
        System.out.println("    Re-Stock:   Re-stock low stock products  ");
        System.out.println("    Rename:     Rename a product");
        
        System.out.println();           
    }
    
    public void printAllProducts()
    {   
        manager.printAllProducts(); 
    }
    
    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("******************************");
        System.out.println(" Stock Management Application ");
        System.out.println("    App05: by Atish");
        System.out.println("******************************");

    }

    
    /**
     * Deliver a product.
     */
    public void deliverProduct()
    {   
        System.out.println("Deliver products"); 
        System.out.println(); 
        
        int id = input.getInt("Enter Product ID");
        
        int amount = input.getInt("Enter amount for delivery");
        
        manager.deliverProduct(id, amount);
        
        System.out.println(id + " Has been Delivered " );
        
        
    }
    
    /**
     * Search for a product by the name of the product
     */
    public void searchProduct()
    {   
        
        String Word = input.getInput("Enter Product Name");
        
        manager.searchByName(Word);
    }
    
    /**
     * Sell products, require to input a product ID and amount. 
     */
    public void sellProduct()
    {   
        System.out.println("Sell Products");
        System.out.println();
        
        int id = input.getInt("Please enter the ID of the Product \n");
        
        int amount = input.getInt("Enter the amount /n");
        
        manager.sellProduct(id, amount);
        
        System.out.println("This product has been sold: " + id); 
        
    }
    
    /**
     * This indicates low stock with an amount shown to the customer.
     */  
    public void lowStock()
    {
        System.out.println("All stock below have 4 or less in stock");
        manager.getLowStockLevel(0);
    }
    
    /**
     * Restocking low stock with a required amount and at which minimum number it will be 
     * restocked. 
     */ 
    public void restock()
    {
        System.out.println("All products less than 4 will been restocked");
        int restock = input.getInt("Please enter the restock amount");
        manager.getLowStockLevel(restock);
    }
}


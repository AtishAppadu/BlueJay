    import java.util.ArrayList;
    
    /**
     * Manage the stock in a business.
     * The stock is described by zero or more Products.
     * 
     * @author (Atish) 
     * @version (27/10/2020)
     */
    public class StockManager
    {
        // A list of the products.
        private ArrayList<Product> stock;
        
        public static final int LOW_STOCK_LEVEL = 4;
        
        /**
         * Initialise the stock manager.
         */
        public StockManager()
        {
            stock = new ArrayList<>();
        }
    
        /**
         * Adding a product to the list.
         * 
         */
        public void addProduct(Product item)
        {
            stock.add(item);
        }
    
        public ArrayList <Product> getLowstock () 
        {
            ArrayList <Product> result = new ArrayList <Product> ();
            for(Product product: stock) 
    
            {
    
                if( product.getQuantity() <= 3)
                {   
                    System.out.println(" The following products are low in stock "+product); 
    
            
                }
    
                 
    
            
           }
        
           return result;
        }
        
       
        
    
        
        public void sellProduct(int id, int quantity)
        {   
            Product product = findProduct(id) ; 
    
            if (product != null) 
            {   
                if (quantity > product.getQuantity()) 
                    quantity = product.getQuantity(); 
                printProduct(id);
    
                for (int count = 0; count <= quantity; count++)
                {   
                    product.sellOne(); 
    
                }
                printProduct(id); 
    
            }
    
        } 
    
        /**
         * Receive a delivery of a  product.
         * Increases the quantity of the product by the given amount.
         * 
         */
        public void deliverProduct(int id, int amount)
        {   
            Product product = findProduct(id);
    
            if( product != null ) 
                product.deliver(amount);
            else 
                System.out.println("Product ID not found = "+id); 
    
        }
    
        public void searchByName(String name) 
        {   
            for( Product product : stock) 
            {   
                name = name.toLowerCase();
                String productName = product.getName().toLowerCase(); 
                if(name.startsWith(productName))
                {   
                    System.out.println(product); 
                }
    
            }
        } 
    
        /**
         * finding a product based on the ID given to the product. 
         * 
         *        
         */
        public Product findProduct(int id)
        {
            for( Product product: stock) 
            {   
                if ( product.getID() == id ) 
                {   
                    return product; 
                }
            }
            return null;
        }
    
        /**
         * Find a product with the given ID, which then shows how
         * many of this item are in stock. 
         */
        public int numberInStock(int id)
        {
            return 0;
        }
    
        /**
         * Print the product list.
         */
        public void printAllProducts()
        {   
           System.out.println(); 
           System.out.println("Razer's  Stock List");
           System.out.println("#################");  
           System.out.println();
           
         if(stock.size() == 0) 
         { 
              System.out.println("out of Stock"); 
            
         }
         else
        {
            for (Product product : stock)
        {
            System.out.println(product);
        }   
    }
    
        System.out.println(); 
    }
 
   public void printProduct(int id)
    {       
        Product product = findProduct(id); 

        if (product != null)
        {   
            System.out.println(product.toString()); 
        } 
    }

                
    
   /** 
    * Able to rename a listed product to a different product. 
    */
    public void renameProduct(int id, String newName)
    
   {   
        Product product = findProduct(id); 
        if (product != null) 
        {   
            String oldName = product.getName(); 
            product.renameProduct(newName);

            if(oldName != product.getName())
            {   
                System.out.println(" You have renamed "+ oldName+ " to " + product.getName());
            }
        }
    }

    /**
     * Able to remove a listed product. 
     */
    public void removeProduct(int id) 
    {
        Product product = findProduct(id); 
        if (product != null) 
        {   
            this.stock.remove(product); 
            System.out.print(product + "Product has been Removed ");
        }
    }
    
     /**
     * Receive a delivery of a product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void deliver(int id, int amount)
        {
        Product product = findProduct(id);
        if(product !=null)
        {
            product.deliver(amount);
            System.out.println("Product Delivered " + product);
        }
        else
        {
            System.out.println("Cannot find product ID" + id );
        }
  
    }
   
    
    public ArrayList<Product> getLowStockLevel(int restockAmount) 
    {
        ArrayList<Product> result = new ArrayList<Product>();
        
        for (Product product : stock)
        {
            result.add(product);
            if(product.getQuantity() <= LOW_STOCK_LEVEL)
            {
                if(restockAmount >0 && restockAmount >product.getQuantity())
                    deliver(product.getID(), restockAmount);
                System.out.println("The listed products are low in stock " + product);
            }
        }
        return result;
    }
    
}







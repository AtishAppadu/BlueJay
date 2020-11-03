import java.util.Date;
/**
 * The class ticket shows what the price is, where the location of the ticket
 * is and when it was issued.
 *
 * @author (Atish)
 * @version (06/10/2020)
 */
public class Ticket
{
    // Journey destination 
    private String destination;
    // this is the ticket price in pence
    private int price; 
    // time and date the ticket was issued
    private Date timeStamp; 

    /**
     * Constructor for objects of class Ticket this will
     * 
     */
    public Ticket(String destination, int price)
    {
        // initialise instance variables
        this.destination = destination;
        this.price = price;  
        timeStamp = new Date();
    }
    
    
    public int getPrice() 
    {   
        return price ; 
    }
    
    /**
     * Return the ticket's destination as a string. 
     */
    public String getDestination()
    {
        return destination; 
    }
    
    /**
     * This prints out the ticket values of where, the price of the ticket
     * and when it was issued.
       */
    public void print()
    {
        
        System.out.println(" Issued: " + timeStamp);
        System.out.println("##################");
        
        System.out.println(destination); 
        System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();

        
    }
}

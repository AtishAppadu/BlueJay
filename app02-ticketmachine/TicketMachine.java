/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 * 
 * Modified by Atish
 */

public class TicketMachine
{
    
    
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;

    public static final Ticket  aylesburyTicket = new Ticket("Aylesbury",220); 
    public static final Ticket  amershamTicket = new Ticket("Amersham",300);
    public static final Ticket  highwycombeTicket = new Ticket("HighWycombe",330);
    
    private Ticket userTicket; 

    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine()
    {
        balance = 0;
        total = 0;
        userTicket = null; 
        
    }

    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance; 
    }
    
    public void printBalance() 
    {   
        System.out.println(" youre balance is "  +  balance);  
    }
    
    public void insertCoin(Coin coin) 
    {       
        System.out.println(coin.getPrice() + " Pennies inserted " );
        balance = balance + coin.getPrice(); 
        printBalance(); 
    }
    
    
    /**
     * Receive an amount of money from a customer.
     * Check that the amount is adequate.
     */
    public void insertMoney(int amount)
    {
        if(amount > 0) 
        {
            balance = balance + amount;
            printBalance();
        }
        else 
        {
            System.out.println("Use a positive amount rather than: " +
                               amount);
        }
    }

     public void insert20p()
     {
         balance = balance + 20;
    
         insertMoney(20);
    }   

    public void insert£1()
    {
        balance = balance + 1; 
        
        insertMoney(1);
    }
    
    public void insert£2()
    {   
       balance = balance + 2; 
    
       insertMoney(2);
    }

    public void selectAylesbury() 
    {   
        userTicket = aylesburyTicket; 
    }
    
    public void selectAmersham() 
    {   
        userTicket = amershamTicket; 
    }      
    
    public void selectHighwycombe() 
    {   
        userTicket = highwycombeTicket; 
    }
   
    public void print() 
    {   
        if (balance >= userTicket.getPrice ()) 
        {   
            userTicket.print();
            balance = balance - userTicket.getPrice(); 
            printBalance(); 
        }
            
    } 
    
    
    
    
    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    {
        int price = 220; // the price must come from the ticket
        if(balance >= price) 
        {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println();
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + price;
            // Reduce the balance by the price.
            balance = balance - price;
        }
        else 
        {
            System.out.println("You must insert at least: " +
                               (price - balance) + " more cents.");
                    
        }
    }

    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
}

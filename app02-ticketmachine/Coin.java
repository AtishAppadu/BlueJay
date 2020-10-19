
/**
 * Enumeration class Coin - write a description of the enum class here
 *
 * @author (Atish)
 * @version (19/10/2020)
 */

public class Coin
{
    // instance variables - replace the example below with your own
    private int price;

    /**
     * Constructor for objects of class CopyOfCoin
     */
    public Coin(int price)
    {
        // initialise instance variables
       this.price = price;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getPrice()
    {
        // put your code here
       return price; 
       
    }
    
    public enum CopyOfCoin
    {
        P10 (10),
        P20 (20),
        P100 (100),
        P200 (200);

        private final int value;

        private CopyOfCoin(int value)
        {
            this.value = value;
        }

        public int getValue()
        {
            return value;
        }
     }
}


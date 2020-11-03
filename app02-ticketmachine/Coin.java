
/**
 * Enumeration class Coin - This is a coin class which detemines the input 
 * value. 
 *
 * @author (Atish )
 * @version (03/11/2020)
 */

public enum Coin
    {
        P10 (10),
        P20 (20),
        P100 (100),
        P200 (200);

        private final int price;

        private Coin(int price)
        {
            this.price = price;
        }
        
        
        public int getPrice()
        {
            return price;
        }
     }

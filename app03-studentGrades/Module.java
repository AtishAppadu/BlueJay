
/**
 * Write a description of class Module here.
 *
 * @author (Atish  )
 * @version (23/10/2020)
 */
public class Module
{
    // instance variables - replace the example below with your own
    private String title; 
    private int moduleCode; 
    private int percentage; 

    /**
     * Constructor for objects of class Module
     */
    public Module(String title, int moduleCode, int percentage)
    {
        // initialise instance variables
        title = title; 
        moduleCode = moduleCode; 
        percentage = percentage;
    }

    public String getTitle()  
    {
        // put your code here
        return title;

    }


    public int getmoduleCode()  
    {
        // put your code here
        return moduleCode;

    }

    public int getPercentage()  
    {
        // put your code here
        return percentage;

    }



}

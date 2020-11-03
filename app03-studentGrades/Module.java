
/**
 * Write a description of class Module here.
 *
 * @author (Atish)
 * @version (23/10/2020)
 */
public class Module
{
    // instance variables - replace the example below with your own
    private String title; 
    private String moduleCode; 
    private int mark; 
    private boolean complete;

    /**
     * Constructor for objects of class Module
     */
    public Module(String title, String moduleCode)
    {
        // initialise instance variables
        this.title = title; 
        this.moduleCode = moduleCode;
        mark = 0;
        complete = false; 
        
      
        
    }
    
    public void mark(int mark) 
    {   
        if (( mark >= 0 ) && ( mark <=100 )) 
        {   
            this.mark = mark; 
            if (mark >= 40) complete = true ; 
            
        }
        
        else 
        {   
            System.out.print(" invalid mark " ); 
        }
    }
    
    
    
    
    public String getTitle()  
    {
        // put your code here
        return this.title;
        

    }
    
    public void setTitle()
    {   
        this.title = title; 
    }

    public String getmoduleCode()  
    {
        // put your code here
        return this.moduleCode;

    }
    
    public void setModuleCode() 
    {   
        this.moduleCode = moduleCode; 
    }
    
    public int getMark()  
    {
        // put your code here
        return this.mark;

    }
    
    public void setMark(int mark )
    {   
        this.mark = mark ; 
    }
    
    public boolean iscomplete()
    {   
        return this.complete; 
    
   

    }
    
    public void setComplete(boolean complete)
   
    {   
        this.complete = complete; 
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}   


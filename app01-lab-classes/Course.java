
/**
 * Write a description of class Course here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Course
{
    // instance variables - replace the example below with your own
    private String title; 
    private String code; 

    /**
     * Constructor for objects of class Course
     */
    public Course(String title, String code)
    {
        this.title = title;
        this.code = code; 
      
    }
    
    public void print()
    {   
        System.out.println(" course code " + code + " " + title); 
    }
   
}

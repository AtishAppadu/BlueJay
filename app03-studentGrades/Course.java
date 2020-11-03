
/**
 * Write a description of class Course here.
 *
 * @author (Atish)
 * @version (23/10/2020)
 */
public class Course
{
    private String course;
    private String coursenumber; 
    
    public static final int maxmodules = 4;
    
    private int moduleamount; 
    
    private int finalcredit; 
    private int finalmark; 
    private int averagemark; 
    private int total; 
    
    private Grades finalgrade; 
    
    private boolean complete; 
    
    
    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;
    
    public Course(String coursenumber, String course )
    {   
        this.course = course;
        this.coursenumber = coursenumber;
        
        moduleamount = 0;
        finalmark = 0; 
        finalcredit = 0;
        complete = false;
        
        createModules();
        
        
        

    
    }
    
    public void createModules()
    {   
        module1 = new Module("ProgComp","C0452"); 
        module2 = new Module("WebDev","C0456"); 
        module3 = new Module("CompArch","C0450"); 
        module4 = new Module("DigiTech","C0452"); 
        
    }
    
    public void addModules(int number,Module module)
    {   
        if(( number >= 1 ) && ( number <=maxmodules )) moduleamount++; 
        
        switch  (number) 
        {   
            case 1 : module1 = module; break ;  
            case 2 : module2 = module; break ; 
            case 3 : module3 = module; break ; 
            case 4 : module4 = module; break ; 
            
        }
    }

    public void calculateMark() 
    {   
        total = module1.getMark() + module2.getMark() + module3.getMark() + module4.getMark();
        finalmark = total/4; 
        
    }
    
    
    public void calculateGrade() 
    {   
        if (( finalmark >= 40 ) && ( finalmark <50 )) 
            finalgrade = Grades.D; 
        else if (( finalmark >= 50 ) && ( finalmark <60 )) 
            finalgrade = Grades.C;
        else if (( finalmark >= 60 ) && ( finalmark <70 )) 
            finalgrade = Grades.B;
        else if (( finalmark >= 70 ) && ( finalmark <=100 )) 
            finalgrade = Grades.A; 
            
        System.out.println( " You have passed with the following grade " + finalgrade); 
        
        if (( finalmark >= 0 ) && ( finalmark <= 39 ))
        System.out.println(" Unfortunately you have not met the required marks to pass "); 
        
       
    }
    
    public void print()
    {   
        System.out.println( " Course " + coursenumber + " - " + course) ; 
    } 
    
    public void checkComplete(boolean complete) 
    {   
        if (complete = true )
        {   
            System.out.print( " courses completed " );
            
        }   
        
        else 
        {   
            System.out.print(" Course incomplete"); 
        }
    }
    
    
    
    
    
    
    
    
    
    
}   


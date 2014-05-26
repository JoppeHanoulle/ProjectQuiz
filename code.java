import java.util.Scanner;
/**
 * Write a description of class cdoe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class code {
    
    public void vraagCode()
    {
        
        System.out.println("Weet jij de code?");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("> ");
        
        String input = scanner.nextLine();
        
        if("Wse123Iop9876543210yjbgher".equals(input))
        {
            
            System.out.println("Je bent binnen in de server,de code is correct.Proficiat!");
        }else
        {
            
            System.out.println("Sorry deze code is fout.");
            
        }
    }
    
    public void Quiz()
    {
        
        System.out.println("Hoe noemde de magische tovercirkel");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("> ");
        
        String input = scanner.nextLine();
        
        if("De magische tovercirkel van Hui".equals(input))
        {
            System.out.println("Het antwoord is correct 1 punt bij!");
        }else
        {
            System.out.println("Sorry je antwoord is fout eigenlijk was het de magische tovercirkel van Hui");
            
        }
        System.out.println("Hoe noemde het ding dat de aardbevingen en andere trillingen meette");
        
        System.out.print("> ");
      
       
        if("De seismograaf".equals(input))
        {
            System.out.println("Het antwoord is correct 1 punt bij");  
        }else 
        {
            System.out.println("Sorry je antwoord was fout eigenlijk was het de seismograaf");
            
        }
    }
}
           



    


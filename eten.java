import java.util.Scanner;
/**
 * Write a description of class eten here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class eten
{
  public void Wateetjegraag(){
      
      System.out.println("Wat eet je graag ?");
      
      System.out.print("- ");
      
      Scanner scanner = new Scanner(System.in);
      
      String jkl = scanner.nextLine();
     
      System.out.println("Ik eet ook graag " +jkl + "."+ "Dat is super lekker." + "Mjammm!");    
    }
    
}

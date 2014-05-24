import java.util.Scanner;
/**
 * Write a description of class TheTalkingMan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class TheTalkingMan

{
    public void hoeNoemJe(){
        
        System.out.println("hoe Noem Je?");
        
        System.out.print("- ");
        
        Scanner scanner = new Scanner(System.in);
        
        String abc = scanner.nextLine();
        
        System.out.println("hallo " + abc + "!");
        
    }
    
    public void Watzijnjouwhobbys(){
        
        System.out.println("Wat zijn jouw hobby's?");
        
        System.out.print("- ");
        
        Scanner scanner = new Scanner(System.in);
        
        String def = scanner.nextLine();
        
        System.out.println("Oh cool ik doe dat ook. " +def + "Dat is super tof !");
        
    }

    public void eencomputerkanalleszelfoptellen(){
        
        System.out.println("hallo ik ben een computer en hoe heet jij?");
        
        System.out.print("- ");
        
        Scanner scanner = new Scanner(System.in);
        
        String ghi = scanner.nextLine();
        
        System.out.println("hallo " + ghi + "!" + "Ik noem Mac SO X en ik kan echt alles." + "Vraag maar een opteloefening");
        
        System.out.print("getal 1 > ");
        
        int getal1 = scanner.nextInt();
        
        System.out.print("getal 2 > ");
        
        int getal2 = scanner.nextInt();
        
        int som = getal1 + getal2;
        
        System.out.println("De som is " + som );
    }
    
}
        
        
        
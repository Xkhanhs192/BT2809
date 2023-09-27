 
package aaaa;
import java.util.Scanner;

public class ConGiap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("tuoi");
          int namSinh = sc.nextInt();
          int conGiap = namSinh % 12;
          switch (conGiap) {
        
        case 0:
             System.out.println("Monket");
             break;
             
        case 1:
             System.out.println("Rooster");
             break;
      
        case 2:
             System.out.println("Dog");
             break;
             
        case 3:
            System.out.println("pig");
            break;
            
        case 4:
            System.out.println("Rat");
            break;
            
        case 5:
            System.out.println("Ox");
            break;
            
        case 6:
            System.out.println("Tiger");
            break;
            
        case 7:
            System.out.println("rabbit/Cat");
            break; 
        case 8:
            System.out.println("Dragon");
            break;
            
        case 9:
            System.out.println("Snake");
            break;
             
        case 10:
            System.out.println("Horse");
            break;
            
        case 11:
            System.out.println("Sheep");
            break;
        default:
            System.out.println("Không có");
        
    }
                  
    }
    
}

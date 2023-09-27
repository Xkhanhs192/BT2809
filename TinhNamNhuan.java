
package tinhnamnhuan;

    import java.util.Scanner;

public class TinhNamNhuan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so nam: ");
        int year = input.nextInt();
        
        if(year%4 == 0 && year %100 != 0){
            System.out.println(year + " la nam nhuan.");
        } else {
            System.out.println(year + " khong phai la nam nhuan.");
            
        }
    }
    
}

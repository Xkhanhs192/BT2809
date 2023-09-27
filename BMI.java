import java.util.Scanner;

public class BMI {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Chieu Cao =");
           double chieuCao = scanner.nextDouble();
        
        System.out.println("Can Nang =");
           double canNang = scanner.nextDouble();
           
        double bmi = canNang / (chieuCao * chieuCao);
        System.out.println("BMI: " + bmi);
    }
     
   
    public static String classifyBMI(double bmi ) {
        if (bmi < 18.5) {
            System.out.println ("Thiếu Cân");
        
    }else if ( bmi >= 18.5 && bmi < 25.0) {
            System.out.println ("Bình Thường");
        
    }else if ( bmi >= 25.0 && bmi < 30.0 ) {
            System.out.println ("Thừa Cân"); 
                    
    }else if (bmi >= 30.0 ) {        
            System.out.println ("Béo Phì");
    }
        return null;
        
    }
}

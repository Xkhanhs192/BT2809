
package quydoitiente;
        import java.util.Scanner;
    public class QuydoiTienTe {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("chọn chức năng");
        System.out.println("1. chuyển từ VNĐ -> USD");
        System.out.println("2. chuyển từ USD -> VNĐ");
            int USD = 23500;
        int chucNang = 0;
        
        
        
        switch (chucNang){
            case 1 -> {
                System.out.print("Nhập số tiền quy đổi: ");
                float money = input.nextFloat();
                System.out.println(money + "VNĐ -> " + (money/USD)+ "USD");
                break;
        }
                
            case 2 -> { 
                System.out.print("Nhập số tiền quy đổi:");
                float money = input.nextFloat();
                System.out.println(money + "VNĐ -> " + (money*USD)+ "USD");
                break;
            
        }
            default -> System.out.println("không hợp lệ, nhập lại");
        }
          System.out.println("stop"); 
        }
           
    }
   


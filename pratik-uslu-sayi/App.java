package hesap.makinesi;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        int n,k,total=1;
        Scanner input = new Scanner(System.in);
        
        System.out.print("üssü alıncak sayı : ");       
        n=input.nextInt();
        
        System.out.print("üs olcak sayı : ");       
        k=input.nextInt();
        
        for (int i = 1; i <= k; i++) {
            total*=n;
        }
         System.out.print("total: "+total);  
    }

}
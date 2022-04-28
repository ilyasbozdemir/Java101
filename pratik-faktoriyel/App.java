package hesap.makinesi;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        int n,r,toplam=1;
        Scanner input = new Scanner(System.in);
        
        System.out.print("n : ");       
        n=input.nextInt();
        
        System.out.print("r : ");       
        r=input.nextInt();
        
        System.out.println("C(n,r) = n! / (r! * (n-r)!)");
        
        int nFakt=faktoriyel(n);       
        int rFakt=faktoriyel(r);       
        int n_rFakt=faktoriyel(n-r);

        
        int sonuc=nFakt/(rFakt*n_rFakt);
                

        System.out.print("C("+ n + "," + r+") = " + sonuc );
        

        
    }
    public static int faktoriyel(int n){
       int total=1;
        for (int i = 1; i < n; i++) {
            total=i*total;
        }
       return total;
    }
}
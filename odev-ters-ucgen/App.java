package hesap.makinesi;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        int n=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz  :");
        n = input.nextInt();
        
        for (int i = n; i >= 0 ; i--) 
        {
            for (int j = (n - i); j > 0; j--) {
                 System.out.print(" ");
            }
            for (int k = (2 * i + 1); k >=1 ; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

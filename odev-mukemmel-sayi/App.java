package hesap.makinesi;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        int sayi=0,toplam=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz  :");
        sayi = input.nextInt();
       
        /*Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların)
        toplamı kendisine eşit olan sayıya mükemmel sayı denir.*/
       
        for (int i = 1; i <sayi; i ++) 
        { 
            if (sayi% i == 0) 
            { 
                toplam = toplam + i; 
            } 
        }
        
        
        if (toplam==sayi) 
              System.out.println(sayi+" Mükemmel sayıdır");
        else        
          System.out.println(sayi+" Mükemmel sayı değildir.");
    }
}

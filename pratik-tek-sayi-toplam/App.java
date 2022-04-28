package hesap.makinesi;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        int sayi,sayac=0,sayiToplam=0,ort;
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Sayi Giriniz : ");
            sayi = input.nextInt();
            if (sayi % 2 == 0 && sayi % 4 == 0) 
                sayiToplam+=sayi;  
        }
        while(sayi>0);
        
        System.out.print(" çift ve 4'ün katları olan sayıları toplamı: " + sayiToplam);
    }
}
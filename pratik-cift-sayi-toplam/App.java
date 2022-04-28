package hesap.makinesi;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        int sayi,sayac=0,sayiToplam=0,ort;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi Giriniz : ");
        sayi = input.nextInt();
        int i=0;
        while(i<sayi){
            i++;
            if (i % 3 == 0 && i % 4==0)
            {
                sayac++;
                sayiToplam+=i;
            }
        }
        ort = sayiToplam / sayac;
        System.out.println("3 ve 4'e tam bölünen sayıların ortalaması : " + ort);
    }
}
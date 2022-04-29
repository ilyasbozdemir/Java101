package hesap.makinesi;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int number = input.nextInt();
        
        int a = number, basamakSayisi = 0,basamakValue=0,basamakToplam=0;


        while (a != 0) {
           basamakValue=a%10;
           basamakToplam+=basamakValue;
           a /= 10;
        }
        System.out.println(basamakToplam);
    }

}
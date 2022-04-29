package hesap.makinesi;

import java.util.Scanner;

public class App {

    public static int recursivePattern(int sayi,int constSayi,boolean durum){
        System.out.print(sayi + " ");
        if (sayi > 0 && durum == true) {
            sayi -= 5;
        } else {
            durum = false;
            sayi += 5;
        }
        if (sayi == constSayi){
             System.out.print(sayi);
             return sayi;
        }
       return recursivePattern(sayi, constSayi, durum);
    }
    public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
       System.out.print("N Sayısı : ");
       int sayi  = scan.nextInt();
       recursivePattern(sayi,sayi,true);
    }
}

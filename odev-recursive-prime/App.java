package hesap.makinesi;

import java.util.Scanner;

public class App {
    
    static boolean isPrimeNumber(int n, int i){
   
        if (n <= 2)
                return (n == 2) ? true : false;
            if (n % i == 0)
                return false;
            if (i * i > n)
                return true;

            return isPrimeNumber(n, i + 1);
    }
    public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
       System.out.print("sayı  giriniz : ");
       int sayi  = scan.nextInt();
       boolean state =isPrimeNumber(sayi, 2);
       
       if (state)
            System.out.println(sayi + " sayısı ASALDIR !");
        else
            System.out.println(sayi + " sayısı ASAL değildir !");
      
    }
}

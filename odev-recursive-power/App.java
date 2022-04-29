package hesap.makinesi;

import java.util.Scanner;

public class App {
    
    public static int pow(int taban,int usdeger)
    {
        if (usdeger==0)
        return 1;
        else if(taban==1)
        return 1;
        else
            return taban * pow(taban, usdeger - 1);
}
    
    public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
       System.out.print("Taban değeri giriniz : ");
       int taban  = scan.nextInt();
      
       System.out.print("Üs değerini giriniz : ");
       int us = scan.nextInt();
       
       System.out.println(pow(taban, us));
    }
}

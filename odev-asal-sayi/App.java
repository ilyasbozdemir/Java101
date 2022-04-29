package hesap.makinesi;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
      
       int sayac = 0;
        for(int sayi=2;sayi<=100;sayi++)
        {
            boolean state=false;
            for (int i = 2; i < sayi; i++)
            {
               if (sayi % i == 0)
                {
                   state=true;
                   break;
                } 
            }
            if(!state)
            {
                System.out.print(sayi+" ");
                sayac++; 
            }
        }
    }
}

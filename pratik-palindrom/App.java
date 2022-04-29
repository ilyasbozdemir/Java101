package hesap.makinesi;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
      
        Scanner reader = new Scanner(System.in);
        System.out.print("sayı girin:");
        int palindrom = reader.nextInt();
        int temp = palindrom;        
        int length = String.valueOf(palindrom).length();
        int kalan,deger=0;
        for (int i = 0; i<length; i++){
             
            kalan = palindrom % 10;
            deger = deger * 10 + kalan;
            palindrom = palindrom /10;
        }
         
        if(deger == temp){
            System.out.println(deger + " Palindrom Sayidir.");
        }else{
            System.out.println(deger + " Palindrom Sayi Degildir.");
        }
    }
    
}

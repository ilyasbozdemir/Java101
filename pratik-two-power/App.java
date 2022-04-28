package hesap.makinesi;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Sınır Sayısını Girin : ");
        sayi=input.nextInt();
        for (int i = 0; i < sayi; i++)
        {
             System.out.print("4'ün katları : "+ Math.pow(4, i)+ "  "); 
             System.out.print("5'ün katları : "+ Math.pow(5, i)+ "\n");
             
        }
    }
}
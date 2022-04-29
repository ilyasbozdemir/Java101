package hesap.makinesi;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int n = input.nextInt();
        System.out.print("Harmonik Seri : ");
         
        for (int i = 1; i <= n; i++)
        {
            System.out.print(1.0/i + " ");
        }
    }

}
package hesap.makinesi;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        int yil;
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        yil = input.nextInt();
        String Mesaj="";
       
        boolean durum=(yil % 100 == 0);
        if(durum){
            
            Mesaj=(yil % 400 == 0)
                ? "bir artık yıldır !"
                : "bir artık yıldır değildir !";
        }
        else {
             Mesaj=(yil % 4 == 0)
                ? "bir artık yıldır !"
                : "bir artık yıldır değildir !";
        }       
       System.out.println(yil + " "+ Mesaj);

    }
}
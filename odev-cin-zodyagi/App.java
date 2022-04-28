package hesap.makinesi;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        int dogumYili;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz :");
        dogumYili = input.nextInt();
        String[]burclar=
        {
            "Maymun",
            "Horoz",
            "Köpek",
            "Domuz",
            "Fare",
            "Öküz",
            "Kaplan",
            "Tavşan",
            "Ejderha",
            "Yılan", 
            "At",
            "Koyun",
        };
        System.out.print("Çin Zodyağı Burcunuz :" + burclar[dogumYili % 12]);
       
    }
}
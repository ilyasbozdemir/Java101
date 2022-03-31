
import java.util.Scanner;

/**
 * @author ilyasBozdemir
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        int matematik,fizik,kimya,turkce,tarih,muzik;
        double ortalama;
        Scanner input=new Scanner(System.in);
        System.out.print("Matematik dersi notunuzu girin : ");
        matematik=input.nextInt();
        System.out.print("Fizik dersi notunuzu girin : ");
        fizik=input.nextInt();
        System.out.print("Kimya dersi notunuzu girin : ");
        kimya=input.nextInt();
        System.out.print("Turkce dersi notunuzu girin : ");
        turkce=input.nextInt();
        System.out.print("Tarih dersi notunuzu girin : ");
        tarih=input.nextInt();
        System.out.print("Muzik dersi notunuzu girin : ");
        muzik=input.nextInt();
        ortalama = ( matematik + fizik + kimya + turkce + tarih + muzik ) / 6;

        boolean sonuc = ortalama >= 60;
        
        String durum = sonuc ? " Gecti" : " Kaldı";
        
        System.out.println("Ortalama : " + ortalama + durum);
        
    }
}

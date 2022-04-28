package hesap.makinesi;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        int mesafe,yas,yolculukTipi;
        boolean isError=false;
        double toplamTutar=0.0,perKm=0.10,normalTutar=0.0,yasIndirimTutari=0.0,
                yasIndirimi=0.0,indirimliTutar=0.0,gidisDonusIndirimi=0.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe = input.nextInt();
        if (mesafe<0) 
             isError=true; 
        else
            normalTutar=mesafe * perKm;
        System.out.print("Yaşınızı giriniz : ");
        yas = input.nextInt();
        if (yas<0) 
             isError=true;
        else
           {
               if (yas<12) 
               {
                   yasIndirimTutari=0.50;
               }
               if (yas>=12 && yas<=24) {
                    yasIndirimTutari=0.10;
               }
               if (yas>65) {
                    yasIndirimTutari=0.30;
               }
               yasIndirimi = normalTutar*yasIndirimTutari;
           }
        indirimliTutar = normalTutar - yasIndirimi;
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
        yolculukTipi = input.nextInt();
        if (yolculukTipi == 1 || yolculukTipi == 2) 
        {
            if (yolculukTipi==2) {
                gidisDonusIndirimi=indirimliTutar*0.20;
                 toplamTutar=(indirimliTutar-gidisDonusIndirimi)*2;
            }
            else
             toplamTutar=(indirimliTutar-gidisDonusIndirimi);
        }
        else
           isError=true; 
        if (isError) 
             System.err.print("Hatalı Veri Girdiniz !");
        else
            System.out.print("Toplam Tutar = " + toplamTutar);
    }
}
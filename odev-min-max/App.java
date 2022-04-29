package hesap.makinesi;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        int n1=0,sayi=0, enBuyukSayi=0,enKucukSayi=0;
        Scanner input = new Scanner(System.in);
        System.out.print("n1 Sayısını Giriniz  :");
        n1 = input.nextInt();
       
        int i = 0;
        while(i < n1){
             System.out.print((i+1)+". Sayıyı giriniz: ");
             sayi=input.nextInt();
             if(enKucukSayi == 0 ) 
                 enKucukSayi = sayi;
            if(enBuyukSayi == 0)
                enBuyukSayi=sayi;
            enKucukSayi=(enKucukSayi>sayi)
                    ? sayi 
                    : enKucukSayi;
            enBuyukSayi=(enBuyukSayi<sayi)
                    ?sayi
                    :enBuyukSayi;
             i++;
        }
        System.out.print("En küçük sayı : "+enKucukSayi+"En büyük sayı : "+enBuyukSayi);
    }
}

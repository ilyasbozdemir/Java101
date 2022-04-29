package hesap.makinesi;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        //EBOB : İki ya da daha fazla doğal sayının ortak bölenlerinin en büyüğüne bu sayıların en büyük ortak böleni, kısaca EBOB‘u denir.
        //EKOK : İki ya da daha fazla doğal sayının ortak katlarının en küçüğüne bu sayıların en küçük ortak katı, kısaca EKOK‘u denir.
        int n1=0, n2=0,ebob=0,ekok=0,buyukSayi=0,kucukSayi=0;
        Scanner input = new Scanner(System.in);
        System.out.print("n1 Sayısını Giriniz  :");
        n1 = input.nextInt();
        
        System.out.print("n2 Sayısını Giriniz  :");
        n2 = input.nextInt();
        
        buyukSayi=n1;
        kucukSayi=n2;
        
        if (n1<n2) {
            kucukSayi=n1;
            buyukSayi=n2;
        }
        //EBOB bulma
       
        int i = 1;
        while(i < kucukSayi){
             if (kucukSayi%i==0 && buyukSayi %i==0) {
                ebob=i;
            }
             i++;
        }
        System.out.println("EBOB("+n1+","+n2+") = " +ebob);
        //EKOK bulma
        int max = n1 * n2;
        
        int j = max;
        while (j > 0){
            
           if(j % n1 == 0 && j % n2 == 0) {
                ekok = j;
            }
            j--;
        }   
        
        System.out.println("EKOK("+n1+","+n2+") = " +ekok);
    }
}

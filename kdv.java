import java.util.Scanner;
/**
 * @author ilyasBozdemir
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        
        double tutar  = 0;
        double kdvOrani = 18;

        Scanner input = new Scanner(System.in);
        System.out.print("Ucret Tutarini Giriniz  : ");
        tutar = input.nextDouble();

        double kdvDahil = (1 + (kdvOrani/100)) * tutar;
        double kdvTutari = kdvDahil - tutar;
        if(tutar > 1000)
        {
            kdvOrani = 8;
        }

        System.out.println("KDV Dahil : " + kdvDahil);
        System.out.println("KDV Haric : " + tutar);
        System.out.println("KDV Tutari : " + kdvTutari);


    }
}

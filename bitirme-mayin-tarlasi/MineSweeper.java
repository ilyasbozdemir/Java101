
/*
Oyun Kuralları :
Oyun metin tabanlıdır.
Çift boyutlu diziler üzerinden oynanmalı ve MineSweeper sınıfı içerisinde tasarlanmalı.
Matris boyutunu yani satır ve sütun sayısını kullanıcı belirlemeli.
Diziye ait eleman sayısının çeyreği (elemanSayisi / 4) kadar rastgele mayın yerleştirilmeli. 
Örneğin dizi 4x3 boyutunda ise eleman sayısı (satırSayısı * sütunSayısı) formülü ile hesaplanmalı ve boyutu 12 olmalı.
Bu durumda mayın sayısı 12 / 4 = 3 adet olmalıdır. (ipucu : bu mayınların konumlarını tutacak ikinci bir dizi oluşturabilirsiniz.)
Kullanıcı matris üzerinden bir nokta seçmeli. Nokta seçimi için satır ve sütun değerlerini girmeli.
Seçilen noktanın dizinin sınırları içerisinde olup olmadığını kontrol edilmeli ve koşul sağlanmazsa tekrar nokta istenmeli.
Kullanıcının girdiği noktada mayın var ise oyunu kaybetmeli.
Mayın yok ise, ilgili noktaya değen tüm konumlarına bakılmalı 
(sağı, solu, yukarısı, aşağısı, sol üst çapraz, sağ üst çapraz, sağ alt çapraz,
sol alt çapraz) ve etrafındaki mayınların sayısının toplamı ilgili noktaya yazılmalı. 
Noktaya değen herhangi bir mayın yok ise "0" değeri atanmalı.
Kullanıcı hiç bir mayına basmadan tüm noktaları seçebilirse oyunu kazanmalı.
*/
package bitirme.mayin.tarlasi;
import java.util.Random;
import java.util.Scanner;
/**
 * @author ilyasBozdemir
 */

public class MineSweeper {
    int rowNumber;
    int colNumber;

    
    private int elemanSayisi;  
    private int mineCount;  
    private int safeZoneCount;


    public MineSweeper(int _rowNumber, int _colNumber) {
        rowNumber = _rowNumber;
        colNumber = _colNumber;
        //
        elemanSayisi = rowNumber * colNumber;
        mineCount = (elemanSayisi / 4);      
        safeZoneCount = elemanSayisi-mineCount;
        //
    }

    public boolean mineControl(int row,int col) 
    {
        return false;
    }

    public void place_a_Mine()
    {
         Random rnd = new Random();
         int konum = rnd.nextInt(colNumber * rowNumber);
         int x = konum  / colNumber,
             y = konum % colNumber;
           
         
        
    }
    
    public void showMine() //Mayınları Göster
    {
         System.out.println("Mayinlarin Konumu");
         
    }

    public void printField()//Alani Yazdır
    {
        
    }
    public void dataInput(int row,int col)//
    {
        
    }
    public void Run()//oyunun ana methodu
    {
        Scanner input = new Scanner(System.in);
        int inputData = 0, row, col, count = 0;
        
        place_a_Mine();// mayınlari yerleştir
        printField();// alanı ekrana yazdır.
        
        showMine();//mayınları göster
        System.out.println("===========================");
        System.out.println("Mayin Tarlasi Oyununa Hoşgeldiniz !");
        
        while(count != safeZoneCount)
        {
            // safeZoneCount yani mayınsız bolge sayısı kadar hakkımız var
            // count == safeZone durumunda oyunu kazanmış oluyor oyuncu
            count++;
            System.out.print("Satır sayısını giriniz : ");
            row=input.nextInt();
            System.out.print("Sutun sayısını giriniz : ");
            col=input.nextInt();
            if (!mineControl(row,col)) 
            {
                dataInput(row,col);
                printField();
            }
            else
            {
                 System.out.print("Game Over!!");
                 break;
            } 
        }
        if (count == safeZoneCount) 
        {
            System.out.print("Oyunu Kazandiniz !");
        }
    }
}
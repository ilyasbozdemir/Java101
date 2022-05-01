package bitirme.mayin.tarlasi;
import java.util.Scanner;
/**
 * @author ilyasBozdemir
 */
public class MineSweeper {
    int rowNumber;
    int colNumber;

    String[][] data;
    String[][] mines;


    private int elemanSayisi;
    private int mineCount;
    private int safeZoneCount;


    public MineSweeper(int _rowNumber, int _colNumber) {
        rowNumber = _rowNumber;
        colNumber = _colNumber;
        //
        elemanSayisi = rowNumber * colNumber;
        mineCount = (elemanSayisi / 4);
        safeZoneCount = elemanSayisi - mineCount;
        //
        data = new String[rowNumber][colNumber];
        mines = new String[rowNumber][colNumber];
        //
    }

    private boolean mineControl(int row, int col) {
        boolean state = mines[row][col] == "*";
        if (state) {
            return true;
        }
        return false;
    }

    private void place_a_Mine() {
        int rndPoint = 0, x = 0, y = 0, i = 0;

        int[] UniqueNumber = new int[mineCount];

        while (i != mineCount) {
            rndPoint = (int)(Math.random() * rowNumber * colNumber);

            for (int j = 0; j < UniqueNumber.length; j++) {

                if (rndPoint != UniqueNumber[j]) {
                    UniqueNumber[i] = rndPoint;
                    i++;
                }
            }
        }

        for (int j = 0; j < rowNumber; j++) {
            for (int k = 0; k < colNumber; k++) {
                for (int l = 0; l < UniqueNumber.length; l++) {

                    x = UniqueNumber[l] / colNumber;
                    y = UniqueNumber[l] % colNumber;

                    if (x == j && y == k) {
                        mines[j][k] = "*";
                    } else {
                        mines[j][k] = "-";
                    }
                }
            }
        }

        //başta oyun alanını yaratmak adına
        for (int j = 0; j < rowNumber; j++) {
            for (int k = 0; k < colNumber; k++) {
                data[j][k] = "-";
            }
        }
    }

    private void showMine() //Mayınları Göster
    {
        System.out.println("Mayinlarin Konumu");
        for (int j = 0; j < rowNumber; j++) {
            for (int k = 0; k < colNumber; k++) {
                System.out.print(mines[j][k] + " ");
            }
            System.out.println();
        }
    }

    private void printField() //Alani Yazdır
    {
        for (int j = 0; j < rowNumber; j++) {
            for (int k = 0; k < colNumber; k++) {
                System.out.print(data[j][k] + " ");
            }
            System.out.println();
        }
    }

    private boolean Top(int row, int col) {
        
        if (mines[row-1][col] == "*") {
            return true;
        }
        return false;
    }
    private boolean Bottom(int row, int col) {
       
        if (mines[row+1][col] == "*") {
            return true;
        }
        return false;
    }
    private boolean Left(int row, int col) {
       
        if (mines[row][col-1] == "*") {
            return true;
        }
        return false;
    }
    private boolean Right(int row, int col) {
       
        if (mines[row][col+1] == "*") {
            return true;
        }
        return false;
    }

    private boolean RightTop(int row, int col) {
       
        if (mines[row-1][col+1] == "*") {
            return true;
        }
        return false;
    }
    private boolean LeftTop(int row, int col) {
        
        if (mines[row-1][col-1] == "*") {
            return true;
        }
        return false;
    }
    private boolean RightBottom(int row, int col) {
        
        if (mines[row+1][col+1] == "*") {
            return true;
        }
        return false;
    }
    private boolean LeftBottom(int row, int col) {
       
        if (mines[row+1][col-1] == "*") {
            return true;
        }
        return false;
    }


    private void dataInput(int row, int col) //
    {
       int count = 0;
       boolean[] durumlar= new boolean [8];
       if (row - 1 >= 0 && row - 1 >= 0) {
            if (col - 1 >= 0 && col - 1 >= 0) {
                if (row + 1 >= rowNumber && row + 1 >= rowNumber) {
                    if (col + 1 >= colNumber && col + 1 >= colNumber) {
                        durumlar[0]= Top(row, col);    
                        durumlar[1]= Bottom(row, col);
                        durumlar[2]= Left(row, col);
                        durumlar[3]= Right(row, col); 
                        durumlar[4]= RightTop(row, col);
                        durumlar[5]= LeftTop(row, col);
                        durumlar[6]= RightBottom(row, col); 
                        durumlar[7]= LeftBottom(row, col);
                         for (var durum: durumlar) {
                             if (durum) {
                                 count++;
                             }
                         }
                           data[row][col] = count + "";
                    }
                }
            }
        }
       else  {
        System.err.print("veri girme hatası");   
       }  
    }
    public void Run() //oyunun ana methodu
    {
        Scanner input = new Scanner(System.in);
        int inputData = 0, row, col, count = 0;

        place_a_Mine(); // mayınlari yerleştir
        showMine(); //mayınları göster
        System.out.println("===========================");
        printField(); // alanı ekrana yazdır.
        System.out.println("===========================");
        System.out.println("Mayin Tarlasi Oyununa Hosgeldiniz !");

        while (count != safeZoneCount) {
            // safeZoneCount yani mayınsız bolge sayısı kadar hakkımız var
            // count == safeZone durumunda oyunu kazanmış oluyor oyuncu
            count++;
            System.out.print("Satır sayisini giriniz : ");
            row = input.nextInt();
            System.out.print("Sutun sayisini giriniz : ");
            col = input.nextInt();
            if (!mineControl(row, col)) {
                dataInput(row, col);
                printField();
            } else {
                System.out.print("Game Over!!");
                break;
            }
        }
        if (count == safeZoneCount) {
            System.out.print("Oyunu Kazandiniz !");
        }
    }
}
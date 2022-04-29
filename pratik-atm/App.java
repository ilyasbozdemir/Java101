package hesap.makinesi;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
       
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
          while (right > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) 
            {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    String msg ="1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap";
                    
                    System.out.println(msg);
                    
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    int price=0;
                    switch(select){ 
                        
                        case 1:   
                             System.out.print("Para miktarı : ");
                              price = input.nextInt();
                             balance += price;
                            break; 
                        case 2:    
  
                            System.out.print("Para miktarı : ");
                             price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Bakiye yetersiz.");
                        } else {
                            balance -= price;
                        }
                            break;  
                        case 3:   
                            System.out.println("Bakiyeniz : " + balance);
                            break; 
                        case 4:    
 
                            break; 
                        default:  
                            System.out.println("Tekrar görüşmek üzere.");
                            break;
                    }
                }
            }
        }
                
    }
}

package odev.array.count;
public class App {
    public static void main(String[] args) {
        int [] arrList = 
        {
            10, 20, 20, 10, 10, 20, 5, 20, 25, 30, 45, 10, 50, 5, 10
        };
        System.out.println("Tekrar Sayilari");
        int value = arrList[0], count = 1,arrIndex = 1;
        
        for (int i = 0; i < arrList.length; i++) 
        {
            for (int j = arrIndex; j < arrList.length; j++)
                if (value == arrList[j])
                {
                    count++;
                    if (arrIndex < arrList.length)
                         arrIndex +=1;
                }
            
            String message = value + " sayisi " +
                             count + " kere tekrar edildi.";
            System.out.println(message);
             if (arrIndex == arrList.length)
                break;
            value = arrList[arrIndex];
            count = 0;
        }
    }
}

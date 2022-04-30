
package odev.employee;

/**
 * @author BozdemirHome
 */
public class Employee {
  
    String name; 
    double salary;
    int workHours;
    int hireYear;
    
    /*
    Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktır.
    tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
    Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
    Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
    
    bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı 
    her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
    raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
    Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
    Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
    Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
    toString() : Çalışana ait bilgileri ekrana bastıracaktır.
    
    */
    public Employee(String name,double salary,int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public double tax(){
         if(salary < 1000){
            return 0;
        }
        else{
            return this.salary * 0.03;
        }
    }
    public double bonus(){
       if (workHours >= 40){
            return  ((workHours-40)*30);
        }
        else return 0;
    }
    public double raiseSalary(){
        int nowYear=2021;
        
        int year= nowYear-this.hireYear;
        
        if(year<10){
            return this.salary*0.05;
        }
        else if(year>9&&year<20){
            return this.salary*0.1;
        }
        else return this.salary*0.15;
    }
    
    
    public  void ToString(){
    
        double totalSalary=(this.salary-tax()+bonus()+raiseSalary());
        double taxBonusSalary=(this.salary-tax()+bonus());
        
        System.out.println("----------------->>");
        System.out.println("Adı : "+this.name );
        System.out.println("Maaşı : "+this.salary ); 
        System.out.println("Çalışma Saati : "+this.workHours ); 
        System.out.println("Başlangıç Yılı : "+this.name );     
        System.out.println("Vergi : "+this.tax() ); 
        System.out.println("Bonus : "+this.bonus() );
        System.out.println("Maaş Artışı  : " + this.raiseSalary() );
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + taxBonusSalary );
        System.out.println("Toplam Maaş : "+ totalSalary );
        System.out.println("----------------->>");
        System.out.println();
    }
    
}

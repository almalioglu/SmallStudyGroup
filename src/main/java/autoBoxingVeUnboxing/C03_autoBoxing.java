package autoBoxingVeUnboxing;

import java.util.Scanner;
public class C03_autoBoxing {
    //kullanicidan aldiginiz iki tane ondalikli sayiyi toplayip tam kismini yazdirin
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen iki tane ondalikli sayi giriniz");
        double sayi= scan.nextDouble();
        double sayi1= scan.nextDouble();
        System.out.println((int)(sayi1+sayi));//java kesinlikle sorumluluk almaz tamamen kullaniciya birakir
        Double sayi2=sayi+sayi1;//AutoBoxing olur
        int sayi3= sayi2.intValue();//unBoxing olur
        System.out.println("toplanan sayilarin tam kismi : "+sayi3);

    }
}

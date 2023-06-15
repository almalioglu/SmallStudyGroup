package passByValue;

import java.util.Scanner;

public class C01_passByValue {
    public static void main(String[] args) {
        /*
     kullanicidan bir int deger alalim ve
     bu degeri 3 katina cikaran bir method olusturalim
     olusturdugumuz degeri method icinde
     ve main method icinde ayri ayri yazdiralim
     */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz..");
        int sayi=scan.nextInt();
        katla(sayi);

    }

    private static void katla(int number) {//burdaki sayi bizim yukardaki sayidan farkli //passByValue oluyor
                                  // ismine number dedik sayi'nin kopya degerini kullaniyor sayi da diyebilirdik
        System.out.println("Girdiginiz sayi :" +number);

        number=number*3;

        System.out.println("Girdiginiz sayinin 3 kati  :" +number);
    }
}

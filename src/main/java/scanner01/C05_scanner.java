package scanner01;

import java.util.Scanner;

public class C05_scanner {
    public static void main(String[] args) {
        //Soru 5) Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin
        //Isminiz: Mehmet
        //Soyisminiz: Bulut
        //Kursumuza katiliminiz alinmistir,tesekkur ederiz.
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim= scan.nextLine();
        System.out.println("lutfen soyIsminizi giriniz");
        String soyIsim= scan.nextLine();
        System.out.println("Isminiz : "+isim.toUpperCase().charAt(0)+isim.substring(1));
        System.out.println("soyIsminiz : "+soyIsim.toUpperCase().charAt(0)+soyIsim.substring(1));
        System.out.println("Kursumuza katiliminiz alinmistir,tesekkur ederiz.");

    }
}

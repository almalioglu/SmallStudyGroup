package scanner01;

import java.util.Scanner;

public class C06_scanner {
    //Soru 6) Kullanicidan ismini ve soyismini alip aralarinda
    //bir bosluk olusturarak asagidaki sekilde yazdirin
    //Isim - soyisim: Mehmet Bulutluoz
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi ve soyisminizi giriniz");
        String isim= scan.nextLine();
        System.out.println(isim.toUpperCase().charAt(0)+isim.substring(1,isim.indexOf(" "))+" "+isim.toUpperCase().charAt(isim.indexOf(" ")+1)+isim.substring(isim.indexOf(" ")+2));
       // System.out.println("isim - soyisim : "+isim.toUpperCase().charAt(0)+isim.substring(1)+" "+isim.toUpperCase().charAt(isim.indexOf(" "+1))+isim.substring(isim.indexOf(" "+2)));

    }
}

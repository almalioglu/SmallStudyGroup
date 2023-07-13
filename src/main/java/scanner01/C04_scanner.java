package scanner01;

import java.util.Scanner;

public class C04_scanner {
    public static void main(String[] args) {
        //Soru 4) Kullanicidan dikdortgenler prizmasinin uzun,
        //kisa kenarlarini ve
        //yuksekligini isteyip prizmanin hacmini hesaplayip yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen dikdortgenler prizmasinin kisa kenarini giriniz");
        int kisaKenar= scan.nextInt();
        System.out.println("lutfen dikdortgenler prizmasinin uzun kenarini giriniz");
        int uzunKenar= scan.nextInt();
        System.out.println("lutfen dikdortgenler prizmasinin yuksekligini giriniz");
        int yukseklik= scan.nextInt();
        System.out.println("prizmanin hacmi : "+(kisaKenar*uzunKenar*yukseklik));


        System.out.println("lutfen dikdortgenler prizmasinin kisa kenarini uzun kenarini ve yuksekligini sirasiyla giriniz");
        int kisaKenar1= scan.nextInt();
        int uzunKenar1= scan.nextInt();
        int yukseklik1= scan.nextInt();
        System.out.println("prizmanin hacmi : "+(kisaKenar1*uzunKenar1*yukseklik1));
    }
}

package methodCreation01;

import java.util.Scanner;

public class C02_HesapMakinasi {
    //static int ogrenciNo=100;
    public static void main(String[] args) {
        System.out.println("iki sayinin dort islemini yapan hesaplama merkezine hosgeldiniz");
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen iki tane sayi giriniz");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        toplama(sayi1,sayi2);
         carpma(sayi1,sayi2);
          bolme(sayi1,sayi2);
       cikartma(sayi1,sayi2);
        System.out.println("isleminiz sonu ermistir tekrar bekleriz");
       // System.out.println(5.7+3.4);



     //  int ogrenci1=ogrenciNoAtama();
     //  int ogrenci2=ogrenciNoAtama();
     //  System.out.println(ogrenci1);
     //  System.out.println(ogrenci2);
    }

    public static void cikartma(double v, double v1) {
        System.out.println(v - v1);
    }

    private static void bolme(double v, double v1) {
        System.out.println(v/v1);
    }

    private static void carpma(double v, double v1) {
        System.out.println(v*v1);
    }

    public static void toplama(double a,double b){
        System.out.println(a+b);
    }
   static String str(){
        return "a";
   }
   static boolean bool(){
        return true;
   }
   static int sayi(){
        return 5;
   }
   static char cha(){
        return 'a';
   }
   static double doub(){
        return 5;
   }//return typelar birebir uygun olmasi gerekiyor







}

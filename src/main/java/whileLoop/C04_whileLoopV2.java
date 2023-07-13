package whileLoop03;

import java.util.Random;
import java.util.Scanner;

public class C04_whileLoopV2 {
    public static void main(String[] args) {
        Random rnd=new Random();
        int sayi=rnd.nextInt(100);
        Scanner scan=new Scanner(System.in);
        int kullaniciSayi=-1;
        int tahminsayisi=10;
        while (tahminsayisi>0){
            System.out.println("lutfen tahminde bulunmak icin 1 ile 100 arasinda tamsayi giriniz");
            kullaniciSayi= scan.nextInt();
            if (kullaniciSayi>sayi){
                System.out.println("lutfen daha kucuk bir tamsayi degeri giriniz");
            } else if (kullaniciSayi<sayi) {
                System.out.println("lutfen daha buyuk bir tamsayi degeri giriniz");
            }else {
               System.out.println("bilgisayarin tuttugu sayiyi buldunuz");
               break;
            }


        tahminsayisi--;
            System.out.println("kalan tahmin sayisi : "+tahminsayisi);}



    }
}

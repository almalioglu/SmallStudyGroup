package whileLoop03;

import java.util.Random;
import java.util.Scanner;

public class C04_whileLoop {
    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
        // Random rnd=new Random();
        // int sayi=rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur
        Random rnd=new Random();
        int sayi=rnd.nextInt(100);
        Scanner scan=new Scanner(System.in);
        int kullaniciSayi=-1;
        int tahminsayisi=0;
        while (sayi!=kullaniciSayi){
            System.out.println("lutfen tahminde bulunmak icin 1 ile 100 arasinda tamsayi giriniz");
            kullaniciSayi= scan.nextInt();
            tahminsayisi++;
            if (kullaniciSayi>sayi){
                System.out.println("lutfen daha kucuk bir tamsayi degeri giriniz");
            } else if (kullaniciSayi<sayi) {
                System.out.println("lutfen daha buyuk bir tamsayi degeri giriniz");
            }

        }
        System.out.println("bilgisayarin tuttugu sayiyi : "+tahminsayisi+". tahminde buldunuz");

    }
}

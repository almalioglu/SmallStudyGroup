package arrayArrayList01;

import java.util.*;

public class C07_List {
    public static void main(String[] args) {
        //icinde 200 tane 1000'den kucuk pozitif tamsayi olan bir list olusturun
        //kullanicidan bir sayi isteyip
        //listede var olup olmadigini kullaniciya yazin
        Random rnd=new Random();
        int sayi=0;
        List<Integer> sayiListesi=new ArrayList<>();
        while (sayiListesi.size()<200){
            sayi= rnd.nextInt(1001);//1000 dersek 1000 kabul olmaz
            if (!sayiListesi.contains(sayi)){
                sayiListesi.add(sayi);
            }
        }
        System.out.println(sayiListesi);
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen tahmin icin bir sayi giriniz");
        sayi= scan.nextInt();
        if (sayiListesi.contains(sayi)){
            System.out.println("tebrikler sayiyi buldunuz");
        }else System.out.println("lutfen tekrar deneyiniz kaybettiniz");

    }
}

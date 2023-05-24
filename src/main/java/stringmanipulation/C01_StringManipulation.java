package stringmanipulation;

public class C01_StringManipulation {
    public static void main(String[] args) {
         /*
        charAt() strindeki verdigimiz indexteki harfi bize dondurur indexler 0'dan baslar
        length() karakter sayisini verir
        subString() girdigimiz ilk indexten baslayarak ikinci(ikinci index disinda) girdigimiz indexe kadar olan araligi verir eger ikinci indexi girmezsek sonuna kadar yazdirir
        toUpperCase()(buyultmek)-toLowerCase()(kucultmek) karakterlerin tamamini kucultmek ya da buyultmek icin kullanilir
        contains() icerme durumunu kontrol eder
        trim() bastaki ve sondaki bosluklari siler
        replace()-replaceAll() karakterleri degistirmek icin kullaniriz replaceAll : bir grup datayi degistirmeyi saglar
        equals()- equalsIgnoreCase() esit mi diye kontrol eder IgnoreCase ise kucuk buyuk goz ardi eder
        split() aldigimiz indexten bosluk birakarak ikiye boler
        endsWith() icine girdigimiz degerin stringin sonundaki harfin ya da kelimenin dogru oldugunu kontrol eder
        isEmpty() karakter olup olmadigini kontrol eder String str=""; karakter olmadiginda true verir null deger icin true verir
        isBlank() icinde sadece bosluk olup olmadigini kontrol eder birde karakter yoksa true verir String str=""; //bosluk disinda herhangi bir karakter varsa false verir
        indexOf() girilen karakterin stringdeki ilk gordugu karaterin kacinci indexte oldugunu dondurur
        lastİndexOf() girilen karakterin stringdeki sondan baslayak ilk gordugu karakterin (bastan)indexini bize dondurur
        startsWith() icinde girdigimiz degerin string basindaki harfin ya da kelimenin dogru olup olmadigin kontrol eder
        concat() stringleri birlestirmeye yarar
        valueOf() String'i int cevirir
         */

        //soru 1)Girilen iki String veriyi karşılaştıran Java kodu yazınız.
        String str="Ali Can";
        String str1="Ali can";
        System.out.println(str.equalsIgnoreCase(str1));//true
        System.out.println(str.equals(str1));//false


    }

}

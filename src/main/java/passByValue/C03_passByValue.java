package passByValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_passByValue {
    public static void main(String[] args) {
         /*
        bir list olusturalim iki ayri method'dan
        birinde sadece elemanlari degistirelim
        digerinde yeni bir list atayip,
        ayni sayida yeni eleman ekleyelim
        ve her iki method call'dan sonra
        kendi listemizi main method icerisinde kontrol edelim
        */
        List<Integer> arr = new ArrayList<>();
        arr.add(11);
        arr.add(22);
        arr.add(33);
        arr.add(44);
        System.out.println("methodtan önce  :" + arr);
        //elemanDegistir(arr);
        System.out.println("methodtan sonra  :" + arr);
        listDegistir(arr);
        //listlerde passbyValue yapabilmek icin
        // yeni bir liste olusturmamiz gerekiyo cunku listin yapisi degismiyor
        System.out.println("listdegistir m.dan sonra  :" + arr);
    }

    private static void listDegistir(List<Integer> arr) {
        List<Integer> newArr = new ArrayList<>();
        newArr.add(3);
        newArr.add(5);
        newArr.add(8);
        newArr.add(13);
        System.out.println(newArr);
    }

    private static void elemanDegistir(List<Integer> arr) {
        arr.set(0, 1);
        arr.set(1, 2);
        arr.set(2, 3);
        arr.set(3, 4);
        System.out.println(arr);
    }
}


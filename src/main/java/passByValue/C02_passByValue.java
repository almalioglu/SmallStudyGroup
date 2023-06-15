package passByValue;

import java.util.Arrays;
import java.util.Random;

public class C02_passByValue {
    public static void main(String[] args) {
         /*
      4 elemanli bir array olusturalim
      bu array'in 2. ve 4. elemanlarini
      100'den kucuk rastgele bir sayi ile degistirelim
      sonra ayri bir method'da ve yeni halini yazdiralim
       */
        int arr[] = {3, 5, 8, 13};
        //arraylerde eleman sayisi degismedigi icin passByValue gecerli degil
        // System.out.println(Arrays.toString(arr));
        //Random rnd=new Random();//random classi bize random sayi uretmek icin olusturulan bir class
        // arr[1]=rnd.nextInt(100);
        // arr[3]= rnd.nextInt(100);
        // System.out.println(Arrays.toString(arr));
        // System.out.println("methoddan once : "+arr);//
        System.out.println("methoddan once : "+Arrays.toString(arr));//{3,5,8,13};
          // elemanDegistir(arr);//{};
        // System.out.println("methoddan sonra : "+Arrays.toString(arr));//{3,5,8,13};
        // System.out.println("methoddan sonra : "+arr);
        arrayDegistir(arr);
        System.out.println("methoddan sonra : "+Arrays.toString(arr));

    }

    private static void arrayDegistir(int[] arr) {
        arr=new int[3];//yapısı burda degistigi icin passByValue yapti
        Random rnd=new Random();
        arr[0]=rnd.nextInt(100);
        arr[1]=rnd.nextInt(100);
        arr[2]= rnd.nextInt(100);
        System.out.println(Arrays.toString(arr));

    }

//         private static void elemanDegistir(int[] arr) {
//            Random rnd=new Random();//random classi bize random sayi uretmek icin olusturulan bir class
//            arr[1]=rnd.nextInt(100);
//            arr[3]= rnd.nextInt(100);
//            // System.out.println("method icinde : "+Arrays.toString(arr));
//             System.out.println("method icinde : "+arr);
//         }

}

package arrayArrayList01;

import java.util.Arrays;

public class C03_array {
    public static void main(String[] args) {
        /*
        3.soru Verilen bir array'in tum elemanlarini toplayan bir program yazalim,
        */
        int arr2[]={3,5,8,13,21,34,55};
        System.out.println(Arrays.toString(arr2));

        int arr[]={5,7,10,12,30,1307};
        System.out.println(Arrays.toString(arr));
        int toplam=0;
        for (int i = 0; i < arr.length; i++) {
            toplam=toplam+arr[i];//toplam+=arr[i];
        }
        System.out.println(toplam);
        toplam=0;
        for (int w:arr
        ) {
            toplam+=w;//toplam=toplam+w
        }
        System.out.println(toplam);
        toplam=0;
        for (int w:arr2) {
            toplam+=w;
        }
        System.out.println("arr2 toplam  :" +toplam);

    }
}

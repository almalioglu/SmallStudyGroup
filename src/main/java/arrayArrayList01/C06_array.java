package arrayArrayList01;

import java.util.Arrays;

public class C06_array {
    public static void main(String[] args) {
        /*
        9.soru-Verilen bir array'e yeni bir element ekleyin
        */
        int arr[]={5,7,10,12,30,1307,123,321,777};//57
        int sayi=57;
        int yeniArr[]=new int[arr.length+1];
        for (int i = 0; i <yeniArr.length ; i++) {
            if (i < arr.length) {
                yeniArr[i] = arr[i];
            } else yeniArr[i] = sayi;
        }
        System.out.println(Arrays.toString(yeniArr));

    }
}

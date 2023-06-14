package arrayArrayList01;

import java.util.Arrays;

public class C02_array {
    public static void main(String[] args) {
        /*
        2.soru bir array olusturun ve olusturdugunuz arraydeki sayilari kucukten buyuge siralayin
         */
        int arr[]={40,25,15,70,17};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}

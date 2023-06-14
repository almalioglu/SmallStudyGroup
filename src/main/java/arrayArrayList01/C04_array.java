package arrayArrayList01;

import java.util.Arrays;

public class C04_array {
    public static void main(String[] args) {
        /*
        4.soru Verilen 3 elemanli bir array in tum elemanlarini bir soldaki konuma tasiyacak bir program yazin.
        Ornek; array (1,2,3) ise output (2, 3, 1) olacak
        */
        int arr[]={1,2,3};
        int input=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1){
                arr[arr.length-1]=input;
            }else arr[i]=arr[i+1];
        }

        System.out.println(Arrays.toString(arr));

    }
}

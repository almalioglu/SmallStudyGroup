package multidimencionalarrays01;

import java.util.Arrays;

public class C02mda {
    public static void main(String[] args) {
        /*
        soru 2) verilen bir multi-dimensional array in
        tum elementlerini yazdiran bir method olusturun
        */
        int sayilar[][]= {{1,1,2},{3,5,8},{13,21,34,55}};
        elementyazdir(sayilar);

    }

    private static void elementyazdir(int[][] sayilar) {
        for (int []a:sayilar
             ) {
            for (int w:a
                 ) {
                System.out.print(w+" ");

            }
            System.out.println("\n******************");

        }
    }


}

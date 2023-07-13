package whileLoop03;

import java.util.Scanner;

public class C02_whileLoop {
    public static void main(String[] args) {
        //  kullanicidan pozitif bir tamsayi alip
        //  while loop ile sayidan kucuk pozitif tamsayilari yazdiralim
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen pozitif bir tamsayi giriniz");
        int sayi= scan.nextInt();
        //for (int i = 1; i<=sayi ; i--) {
        //    System.out.print(i+" ");
        //}
        if (sayi>0){
            int counter=1;
        while (counter<=sayi){
            System.out.print(counter+" ");

        counter++;}
        }else System.out.println("lutfen pozitif bir sayi giriniz");

    }
}

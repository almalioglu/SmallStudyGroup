package typeCasting;

import java.util.Scanner;

public class C02_typeCasting {
    //kullicindan bir karakter aliniz ve aldiginiz karakterin sayisal degerini yazdiriniz
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
        int sayi=scan.next().charAt(0);
        System.out.println(sayi);
       // char karakter=scan.next().charAt(0);
       // System.out.println((int)karakter);

    }
}

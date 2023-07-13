package typeCasting;

import java.util.Scanner;

public class C01_typeCasting {
    //kullanicidan aldiginiz bir sayinin ascii degerine gore karakterini yazdirin
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        char karakter1=(char) scan.nextInt();
        // int sayi= scan.nextInt();
        // char karakter=(char) sayi;
        System.out.println(karakter1);
        //System.out.println((char) sayi);


    }
}

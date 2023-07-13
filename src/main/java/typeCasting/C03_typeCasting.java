package typeCasting;

import java.util.Scanner;

public class C03_typeCasting {
    //kullanicidan bir karakter alin ve ascii degerinin bir fazlasinin karakter degerini yazdirin
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");//a
        char karakter=scan.next().charAt(0);//a
        System.out.println(karakter);//
        System.out.println((char) (karakter+1));//b//98 : sayisal degerini//a1
        //char bir degeri bir sayi ile toplarsam ascii degere gidip toplama islemi yapıyor
        //Stringle topladigim zaman ise concat yapiyor

    }
}

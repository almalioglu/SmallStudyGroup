package ifElse01;

import java.util.Scanner;

public class C04_ifElse {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
        değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
        1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
        Sesli harfler: a,e,i,o,u
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        String str= scan.next().toLowerCase();
        str=str.replaceAll("[^a-zA-Z]","=");
        str=str.replaceAll("[a,e,i,u,o]","*");

        System.out.println(str);
        boolean sesliMi=str.equals("a")||str.equals("e")||str.equals("i")||str.equals("u")||str.equals("o");
        // if (str.contains("*")||str.length()!=1){
        //     System.out.println("hatali bir giris yaptiniz");
        // } else if (sesliMi){
        //     System.out.println("sesli");
        // }else System.out.println("sessiz");

        if (sesliMi){
            System.out.println("evet harf cok sesliydi");
        }
        if (!str.equals("*")&&!str.contains("=")&&str.length()==1){
            System.out.println("sessiz bir harf");
        }
        if (str.length()!=1) {
            System.out.println("ben sana bir harf gir demistim");
        }
        if (str.contains("=")){
            System.out.println("ben sana harf gir demistim");
        }
    }
}

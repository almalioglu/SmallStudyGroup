package ifElse01;

import java.util.Scanner;

public class C03_ifElse {
    public static void main(String[] args) {
        /*
       Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir gun ismi giriniz");
        String gunIsmi= scan.next().toLowerCase();
        boolean haftaicimi=gunIsmi.equals("pazartesi")||gunIsmi.equals("sali")||gunIsmi.equals("carsamba")||gunIsmi.equals("persembe")||gunIsmi.equals("cuma");
        if (gunIsmi.equals("pazar")||gunIsmi.equals("cumartesi")){
            System.out.println("haftasonu");
        } else if (haftaicimi){
            System.out.println("haftaici");
        }else System.out.println("gecersiz bir gun girdiniz");

        if (haftaicimi){
            System.out.println("haftaici");
        }
    }
}

package scanner01;

import java.util.Scanner;

public class C02_scanner {
    //Soru 2) Kullanicidan karenin bir kenar uzunlugunu alin ve
    // karenin cevresini ve alanini hesaplayip yazdirin

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen cevresini ve alanini hesaplamak istediginiz karenin bir kenar uzunlugunu veriniz");
        int kenar= scan.nextInt();
        System.out.println("karenin cevresi : "+(kenar * 4));
        System.out.println("karenin alani : "+(kenar * kenar));


    }
}

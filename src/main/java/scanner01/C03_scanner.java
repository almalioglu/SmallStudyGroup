package scanner01;

import java.util.Scanner;

public class C03_scanner {
    //Soru 3) Kullanicidan yaricap isteyip cemberin cevresini ve
    // dairenin alanini hesaplayip yazdirin cevre formulu 2πrdir
    // (pi sayisini 3 alabilirsiniz)dairenin alani ise π r²dir(pi sayisini 3 alabilirsiniz)
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen cevresini ve alanini hesaplamak istediginiz dairenin yaricapini giriniz");
        int r= scan.nextInt();
        System.out.println("dairenin cevresi : "+(2*3*r));
        System.out.println("dairenin alani : "+(3*r*r));
    }
}

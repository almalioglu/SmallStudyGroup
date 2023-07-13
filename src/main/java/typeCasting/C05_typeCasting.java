package typeCasting;

public class C05_typeCasting {

    public static void main(String[] args) {

        int sayi=256;
        byte sayi1=(byte) sayi;//127//-128//256
        System.out.println(sayi1);
        int sayi3=sayi1;
        System.out.println(sayi3);
        //veri kaybi soz konusu oldu ondan dolayi type casting yaparken buyukten kucuge giderken araliga dikkat etmemiz gerekiyor
    }
}

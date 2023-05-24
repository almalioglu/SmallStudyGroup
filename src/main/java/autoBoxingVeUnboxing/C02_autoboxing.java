package autoBoxingVeUnboxing;

public class C02_autoboxing {
    public static void main(String[] args) {
        Integer sayi=257;
        int sayi1=500;

        byte sayi2=(byte) sayi1;
        byte sayi3=sayi.byteValue();
        System.out.println(sayi2);
        System.out.println(sayi3);


    }
}

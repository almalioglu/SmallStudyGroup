package constructor03;

public class Main {
    public static void main(String[] args) {
        C02_Telefon tlf1=new C02_Telefon();
        System.out.println(tlf1.marka);
        System.out.println(tlf1.model);
        System.out.println(tlf1.fiyat);
        C02_Telefon tlf2=new C02_Telefon("Xiomi","redmi note 11 pro","11000TL");
        System.out.println(tlf2.toString());
        System.out.println(tlf2.marka);
        System.out.println(tlf2.model);
        System.out.println(tlf2.fiyat);
        C02_Telefon tlf3=new C02_Telefon("Iphone","14 Pro Max");

        System.out.println(tlf3.toString());
    }
}

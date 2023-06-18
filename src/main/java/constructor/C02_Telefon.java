package constructor;

public class C02_Telefon {
    //soru 2)telefon adli bir constructer olusturun ve
    //olusturdugunuz constructer'a marka model ve fiyat parametreleri ekleyin
    //ve main classi olusturup o class icinden cagirip birkac tane telefon ekleyin
    String marka;
    String model;
    String fiyat;
    C02_Telefon(String marka,String model,String fiyat){
        System.out.println(marka);
        System.out.println(model);
        System.out.println(fiyat);
        this.marka=marka;
        this.model=model;
        this.fiyat=fiyat;

    }

    public C02_Telefon(String marka, String model) {
        System.out.println(marka);
        System.out.println(model);
        this.marka=marka;
        this.model=model;
    }
}

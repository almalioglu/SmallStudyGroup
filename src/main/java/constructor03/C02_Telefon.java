package constructor03;

public class C02_Telefon {
    String marka="Belirtilmedi";
    String model="Belirtilmedi";
    String fiyat="Belirtilmedi";
C02_Telefon(){
    System.out.println("marka model fiyat belirtilmedi");
}
C02_Telefon(String marka, String model, String fiyat){

    this.marka=marka;
    this.model=model;
    this.fiyat=fiyat;
    System.out.println("marka model fiyat belirtildi");

}

    public C02_Telefon(String marka, String model) {
    this.marka=marka;
    this.model=model;
        System.out.println("marka model belirtildi ama fiyat belirtilmedi");
    }


    @Override
    public String toString() {
        return "C02_Telefon{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", fiyat='" + fiyat + '\'' +
                '}';
    }
}

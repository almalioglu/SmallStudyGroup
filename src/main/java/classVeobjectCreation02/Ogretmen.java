package classVeobjectCreation02;

public class Ogretmen {
    String isim="isim belirtilmedi";
    String soyIsim="soyIsim belirtilmedi";
    String brans="brans belirtilmedi";
    int yas=-1;

    @Override
    public String toString() {
        return "Ogretmen{" +
                "isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", brans='" + brans + '\'' +
                ", yas=" + yas +
                '}';
    }
}

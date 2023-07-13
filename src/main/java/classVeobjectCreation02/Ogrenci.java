package classVeobjectCreation02;

public class Ogrenci {
    String isim="isim belirtilmedi";
    String soyIsim="soyisim belirtilmedi";

    @Override
    public String toString() {
        return "Ogrenci{" +
                "isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", ogrenciNo='" + ogrenciNo + '\'' +
                ", sinif='" + sinif + '\'' +
                '}';
    }

    String ogrenciNo="ogrenciNo belirtilmedi";
    String sinif="sinifi belirtilmedi";

    public static void main(String[] args) {
        Ogrenci ogrenci1=new Ogrenci();
        ogrenci1.isim="Furkan";
        ogrenci1.soyIsim="Can";
        ogrenci1.ogrenciNo="557";
        ogrenci1.sinif="8/b";
        ogrenci1.yazdir();
        Ogrenci ogrenci2=new Ogrenci();
        ogrenci2.yazdir();
        ogrenci2.toString();//sout icinde yazmamiz gerekiyor cunku return ettigi icin degeri bize donduruyor

    }
    public void yazdir(){
        System.out.println("isim : "+isim);
        System.out.println("soyIsim : "+soyIsim);
        System.out.println("sinif : "+sinif);
        System.out.println("ogrenciNO : "+ogrenciNo);
    }

}

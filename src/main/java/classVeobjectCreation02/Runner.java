package classVeobjectCreation02;

public class Runner {
    public static void main(String[] args){
        Ogretmen ogretmen1=new Ogretmen();
        ogretmen1.isim="Ahmet";
        ogretmen1.soyIsim="soykan";
        ogretmen1.yas=32;
        ogretmen1.brans="Matematik";
        System.out.println(ogretmen1.toString());
        Ogrenci ogrenci1=new Ogrenci();
        ogrenci1.isim="Furkan";
        ogrenci1.soyIsim="Kaplan";
        ogrenci1.sinif="8/b";
        ogrenci1.ogrenciNo="730";
        System.out.println(ogrenci1.toString());


    }
}

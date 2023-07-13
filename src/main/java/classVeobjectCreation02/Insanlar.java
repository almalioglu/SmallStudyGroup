package classVeobjectCreation02;

public class Insanlar {
    String isim="isim belirtilmedi";

    public static void main(String[] args) {
        Insanlar insan1=new Insanlar();
        insan1.isim="Mehmet";
        System.out.println(insan1.isim);//"Mehmet";
        Insanlar insan2=new Insanlar();
        System.out.println(insan2.isim);//"isim belirtilmedi";

    }
}

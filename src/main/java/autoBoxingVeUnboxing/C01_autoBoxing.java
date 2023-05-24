package autoBoxingVeUnboxing;

public class C01_autoBoxing {
    public static void main(String[] args) {
        int sayi=50;
        String str="Java cok guzel";
        Integer sayi1=sayi;//autoBoxing//wrapper classlar java tarafindan bize icinde methodlar olan primitive data turlerinin classlari
        System.out.println(sayi1.doubleValue());//50.0 yazdirdi cunku double gibi davrandi
        int sayi2=sayi1;//unBoxing
        System.out.println(sayi2);//50
        double sayi3=57.6;
        Double sayi5=sayi3;
        int sayi4= (int) sayi3;//java sorumluluk kabul etmez tamamen kullaniciya birakir
        int sayi6= sayi5.intValue();//
        System.out.println("kisa yoldan yaptigimi : "+sayi4);
        System.out.println("uzun yoldan yaptigimiz ama guvenilir olan : "+sayi6);


    }
}

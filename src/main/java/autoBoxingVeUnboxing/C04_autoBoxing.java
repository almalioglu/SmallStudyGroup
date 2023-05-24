package autoBoxingVeUnboxing;

public class C04_autoBoxing {
    public static void main(String[] args) {
        double sayi=50.5;//autoboxing olur
        Double sayi1=sayi;//autoboxing olur

        Double ondalikliSayi=5.5;//unBoxing olur
        double ondalikliSayi1=ondalikliSayi;//unBoxing olur

        Double rakam=(double)5;//wrapper classa deger atarken birebir uygun variable olmasi zorunlu
        //bunu yaptigim zaman parantezin icindeki degeri dondurur
    }
}

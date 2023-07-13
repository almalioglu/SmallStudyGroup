package typeCasting;

public class C04_typeCasting {
    //bir int deger ve bir double degeri toplayin
    //ayni sayilari toplayip sadece tam kismini alin
    public static void main(String[] args) {
        int sayi=8;
        double sayi1=2.5;
        System.out.println(sayi+sayi1);//10.5//double deger dondurdu otomatik olarak buyuk olani secti
        System.out.println((int)(sayi1+sayi));//10
        //java sorumluluk almaz sorumlulugu kullanica birakir
    }
}

package ifElse01;

public class C01_ifElse {
    public static void main(String[] args) {
        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        int sayi4=40;

        if (sayi1<sayi2){
            System.out.println("buyuk olan sayi : "+sayi2);
        }else System.out.println("buyuk olan sayi : "+sayi1);//tek satirlik islem yapicaksam eger susle parantezi kullanmayabilirim

        System.out.println("if'in disindayiz");

        if (sayi3<sayi4){
            System.out.println("buyuk olan sayi : "+sayi4);
            System.out.println("kucuk olan sayi : "+sayi3);
        }else {System.out.println("buyuk olan sayi : "+sayi3);
              System.out.println("kucuk olan sayi : "+sayi4);}//burda kullanmak zorundayim

    }
}

package methodCreation01;

public class C01_methodCreation {
    public static void main(String[] args) {
        System.out.println("Small Study bugun basladi");
        int sayi=10;
        hosgeldiMesaji();
        System.out.println(ikinciMethod());
        System.out.println();
        hosgeldiMesaji();

    }

    private static void hosgeldiMesaji(){//işlem yapmicak isek bunu kullanıyoruz
        System.out.println("Hosgeldiniz");
    }
    private static String ikinciMethod(){//işlem yapipi bir şeyler olucaksak bunu kullaniyoruz

        return "a";
    }

}

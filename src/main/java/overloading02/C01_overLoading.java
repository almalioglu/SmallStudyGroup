package overloading02;

public class C01_overLoading {
    public static void main(String[] args) {
        /*
       3 tane carpim isimli method olusturalim 1. methdodda 2 tane int deger carpalim
       2. methodda 1 tane double 1 tane int deger carpalim
       3. methodda 2 tane double deger carpalim
       */      //a,//b
        carpim(2.5,3.4,7.5);
        carpim(2.5,3.4);
        carpim(5.2,3);
        carpim(5,3.6);
        carpim(5,9);
        carpim("a","b");
//autoWiding kendine en uygun olani secmesi

    }

    private static void carpim(String a, String b) {
        System.out.println(a+b);
    }

    private static void carpim(double a, double b) {
        System.out.println(a*b);
    }

    public static void carpim(double a, double b, double c) {
        System.out.println(a*b);
    }
    public static void carpim(double a, int b) {
        System.out.println(a*b);
    }
    public static void carpim(int a, double b) {
        System.out.println(a*b);
    }
    public static void carpim(int a, int b) {
        System.out.println(a*b);
    }
}

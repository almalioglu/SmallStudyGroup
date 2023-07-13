package overloading02;

public class C04_overLoading {
    public static void main(String[] args) {
        toplam(5.6,7.6);
        toplam(5,7.6);
        toplam(5,7);

    }

    public static void toplam(double a, double b) {
        System.out.println(a+b);
    }
    static void toplam(int a,double b){
        System.out.println(a+b);

    }
    private static void toplam(int a,int b){
        System.out.println(a+b);
    }
}

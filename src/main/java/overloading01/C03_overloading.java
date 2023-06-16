package overloading01;

public class C03_overloading {
    public static void main(String[] args) {
        C03_overloading obj1=new C03_overloading(3,5);
        C03_overloading obj2=new C03_overloading(3,5.2);
        C03_overloading obj3=new C03_overloading(3.5,5);
        C03_overloading obj4=new C03_overloading(3.8,5.7);
    }
    C03_overloading(int a,int b){
        System.out.println(a+b);
    }
    C03_overloading(int a,double b){
        System.out.println(a+b);
    }
    C03_overloading(double a,int b){
        System.out.println(a+b);
    }
    C03_overloading(double a,double b){
        System.out.println(a+b);
    }
}






package overloading02;

public class C03_overloading {


    C03_overloading(){
        System.out.println("1. cons");
    }
    C03_overloading(int a){
        System.out.println(a);
    }
    C03_overloading(double a){

    }

    public static void main(String[] args) {
        C03_overloading obj1=new C03_overloading();
        C03_overloading obj2=new C03_overloading(4);
        C03_overloading obj3=new C03_overloading(4.5);
    }

}

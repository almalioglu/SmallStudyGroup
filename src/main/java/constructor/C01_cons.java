package constructor;

public class C01_cons {
    // soru 1) birkac tane constructer cagirip bu constructerlari inceleyelim
    int yas=15;
    public static void main(String[] args) {
        C01_cons obj1=new C01_cons(9);
        System.out.println(obj1.yas);

    }
    C01_cons(){
        System.out.println("defualt constructor silindi ");
    }
    C01_cons(int yas1){
        System.out.println(yas1);
        yas=yas1;
    }
}

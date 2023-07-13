package methodCreation01;

public class C04_methodCreation {
    public static void main(String[] args) {
        C04_methodCreation obj1=new C04_methodCreation();//referans olarak objeyi kullandim bundan dolayi static olan bir methodun icinde cagirabildim
        obj1.yazdir();
    }

    public void yazdir(){
        System.out.println("bu method static degil");
    }//static olmadigi icin static olan main methodun icinden cagiramadim

}

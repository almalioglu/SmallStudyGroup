package constructor;

public class C04_Student {
    String name;
    int age;
    String phone;
    C04_Student(String name){
        this.name=name;
    }
    C04_Student(){
        name="Hasan";
    }

    public static void main(String[] args) {
        C04_Student s1=new C04_Student("Ali Can");
        System.out.println(s1.name);
        System.out.println(s1.age);
        C04_Student s2=new C04_Student();
        System.out.println(s2.name);
        System.out.println(s2.age);
    }
}

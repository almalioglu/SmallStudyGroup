package collections01;

import java.util.HashMap;

public class c03_map {
    public static void main(String[] args) {
        HashMap<Integer,String> map1=new HashMap<>();
        map1.put(1,"Furkan");
        map1.put(1,"Ahmet");
        map1.put(2,"Ahmet");
        System.out.println(map1);

        Teacher teacher=new Teacher();
        Teacher teacher2=new Teacher();
        teacher.isim="ahmet";
        teacher.soyIsim="Kisacik";
        teacher2.isim="ahmet";
        teacher2.soyIsim="bulut";
        HashMap<Integer,Teacher>map2=new HashMap<>();
        map2.put(1,teacher);
        map2.put(2,teacher2);
        System.out.println(map2);

    }
}

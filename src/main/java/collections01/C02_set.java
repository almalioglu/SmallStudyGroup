package collections01;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class C02_set {
    public static void main(String[] args) {
        HashSet<String>set1=new HashSet<>();
        set1.add("3");
        set1.add("5");
        set1.add("7");
        set1.add("9");
        set1.add("11");
        set1.add("13");
        set1.add("15");
        set1.add("1");
        set1.add("2");
        System.out.println(set1);
        TreeSet<Integer> set2=new TreeSet<>();
        set2.add(9);
        set2.add(6);
        set2.add(4);
        set2.add(3);
        System.out.println(set2);
        LinkedHashSet<Integer> set3=new LinkedHashSet<>();
        set3.add(4);
        set3.add(6);
        set3.add(2);
        set3.add(9);
        System.out.println(set3);
    }
}

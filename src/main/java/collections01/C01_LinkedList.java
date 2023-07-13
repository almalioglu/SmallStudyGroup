package collections01;

import java.util.*;

public class C01_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll1=new LinkedList<>();
        Deque<Integer> ll2=new LinkedList<>();//Deque --> iki uclu
        Queue<Integer> ll3=new LinkedList<>();//Queue -->kuyruk,tek tarafli
        List<Integer> ll4=new LinkedList<>();
        //List<Integer> ll5=new ArrayList<>();

        ll2.add(11);
        ll2.addFirst(12);

        ll2.add(13);
        ll2.add(14);
        ll2.removeLast();
        System.out.println(ll2);

    }
}

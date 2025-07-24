package ArrayList;
import java.util.*;

import CLASS.pub;

public class Clasroom {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);//apending elements
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.set(0,1);//setting a particular value at thre given index length remains same
        System.out.println(list);
        list.add(1,9);//adds the element at the given index length increases by one 
        System.out.println(list.contains(3));
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
            
        }
    }
}

package Text.Generic;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo1 {
    public static void method(ArrayList<?> list){
        Iterator<?> it = list.iterator();
        while (it.hasNext()){
            Object n = it.next();
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("董明佳");
        list.add("打篮球");
        list.add("很菜");
        method(list);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        method(list1);
    }
}

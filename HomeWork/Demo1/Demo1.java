package HomeWork.Demo1;

import java.util.ArrayList;
import java.util.Collection;

//二、给定以下代码，请定义方法public static int listTest(Collection<String> list,String s)
// 统计集合中指定元素出现的次数，如"a":2,"b": 2,"c" :1, "xxx":0。
public class Demo1 {
    public static void listTest(Collection<String> list, String s) {
        int i = 0;
        for (String s1 : list) {
            if(s1.equals(s)){
                i++;
            }
        }
        System.out.println("字符"+s+"个数为："+i);
    }

    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("b");
        list.add("a");
        list.add("b");

        listTest(list,"a");
        listTest(list,"b");
        listTest(list,"c");
        listTest(list,"d");

    }
    
}

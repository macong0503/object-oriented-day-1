package HomeWork.Demo5;

import java.util.ArrayList;

public class Demo5 {
    //六、定义一个方法listTest(ArrayList<String> al),
    // 要求使用isEmpty()判断al里面是否有元素。

    public static  void listTest(ArrayList<String> al){
        System.out.println("al集合是否为空集合："+al.isEmpty());
    }

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("a");
        listTest(al);
    }
}

package HomeWork.Demo4;

import java.util.ArrayList;

public class Demo4 {
    //五、定义一个方法listTest(ArrayList<String> al, String s),
    // 要求使用contains()方法判断al集合里面是否包含s。
    public static void listTest(ArrayList<String> al, String s){
        System.out.println("al集合中是否存在"+s+"字符："+al.contains(s));
    }

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("a");
        al.add("b");
        al.add("c");
        al.add("a");

        listTest(al,"a");

    }
}

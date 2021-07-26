package HomeWork.Demo6;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo6 {
    //定义一个方法listTest(ArrayList<Integer> al, Integer s)，
    // 要求返回s在al里面第一次出现的索引，如果s没出现过返回-1。
    public static int listTest(ArrayList<Integer> al, Integer s) {
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i) == s) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(1);
        al.add(1);
        al.add(2);
        al.add(5);
        System.out.println("集合为："+al);
        System.out.println("请输入要查询的数值：");
        int i = new Scanner(System.in).nextInt();
        System.out.println("第一个出现的位置是"+listTest(al, i));
    }
}
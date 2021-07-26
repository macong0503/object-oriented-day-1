package HomeWork.Test03;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//十一、编写一个泛型方法，实现任意引用类型数组指定位置元素交换。
public class Demo03 {
    public static <E> void method(E[] e,int a , int b){

        E temp;
        temp = e[a] ;
        e[a] = e[b];
        e[b] = temp;

    }

    public static void main(String[] args) {
        String[] s = new String[]{"aaa","bbbb","abc"};
        System.out.println("转变前："+Arrays.toString(s));
        method(s,0,2);
        System.out.println("转变后："+Arrays.toString(s));
    }
}

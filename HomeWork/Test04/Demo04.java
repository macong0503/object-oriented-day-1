package HomeWork.Test04;

import java.util.Arrays;

public class Demo04 {
    public static void main(String[] args) {
        String[] s =new String[]{"aaa","bbb","ccc"};
        System.out.println("反转数组前：");
        for (String s1 : s) {
            System.out.print(s1 + "  ");
        }
        System.out.println();
        method(s);
    }
    public static <E> void method(E[] e){
        System.out.println("反转数组后：");
        for (int i = e.length-1; i >=0 ; i--) {
            System.out.print(e[i] + " ");
        }
    }

}

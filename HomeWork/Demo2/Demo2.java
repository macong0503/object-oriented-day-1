package HomeWork.Demo2;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
    //三、定义一个方法，要求此方法把int数组转成存有相同元素的集合
    // (集合里面的元素是Integer)，并返回。
    public static ArrayList<Integer>  method(int[] ints){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < ints.length; i++) {
            list.add(ints[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println("返回的集合为："+method(new int[]{1, 2, 3, 4, 5}));
    }
}

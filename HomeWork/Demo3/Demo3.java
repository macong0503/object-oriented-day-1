package HomeWork.Demo3;

import java.util.ArrayList;
import java.util.Arrays;

//定义一个方法，要求此方法把int数组转成存有相同元素的集合(集合里面的元素是Integer)，并返回。
public class Demo3 {


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(9);
        list.add(10);
        System.out.println("集合为："+list);
        Object[] objects = list.toArray();
        System.out.println("转换完的数组为：");
        for (Object object : objects) {
            System.out.print(object + "  ");
        }
    }
}

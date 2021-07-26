package HomeWork.Test02;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

//产生10个1-100的随机数，并放到一个数组中，
// 把数组中大于等于10的数字放到一个list集合中，并打印到控制台。
public class random {
    public static void main(String[] args) {
        ArrayList<Integer> randomlist = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int a =random.nextInt(100)+1;
            randomlist.add(a);
        }
        System.out.println("随机数的数组为："+randomlist);
        for (int j = 0; j <randomlist.size() ; j++) {
            if (randomlist.get(j)>10){
                list.add(randomlist.get(j));
            }
        }
        System.out.println("随机数数组中大于10的数组为"+list);
    }
}

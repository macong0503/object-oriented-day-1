package Text.Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
* Collection中常见的方法
* */
public class CollectionDemo1 {
    public static void main(String[] args) {

        //创建对象的多态
        Collection<String> coll = new ArrayList<>();
        //使用方法
        //添加功能boolean add(E e)
        coll.add("迪丽热巴");
        coll.add("吴亦凡");
        coll.add("胡鑫");
        System.out.println(coll);//[迪丽热巴, 吴亦凡, 胡鑫]
        //判断功能boolean contains(object o)
        System.out.println(coll.contains("董明佳"));//true
        //移除功能
        System.out.println(coll.remove("迪丽热巴"));//true
        //元素个数int size()
        System.out.println(coll.size());//2

        /*
        * object[] toArray()返回一个包含此集合中所有元素的数组
        * */

        Object[] objects = coll.toArray();
        for (int i = 0; i < objects.length ; i++) {
            System.out.println(objects[i]);
        }

        System.out.println(coll.isEmpty());//false 判断是否为空
        coll.clear();// 清空
        System.out.println(coll.isEmpty());//true

    }
}

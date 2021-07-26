package Text.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("董明佳");
        coll.add("胡鑫");
        coll.add("吴亦凡");
        //迭代器遍历
        Iterator<String> it = coll.iterator();
        while (it.hasNext()){//通过it.hasNext（）来判断是否循环完，相当于i<it.leanth
            String str = it.next();//将it里的元素赋值给str
            System.out.println(str);
        }
        //增强for循环
        for (String s : coll) {
            System.out.println(s);
        }
    }
}

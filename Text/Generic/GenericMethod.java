package Text.Generic;
/*
* 自定义泛型方法：
* 修饰符 <代表泛型的变量> 返回值类型 方法名(参数){}
* 使用：在方法被调用的时候再确定泛型的类型
* */
public class GenericMethod {
    public <E> void methodA(E e){
        System.out.println(e);
    }
}

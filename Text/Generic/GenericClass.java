package Text.Generic;
/*
* 自定义泛型类：
* 修饰符 class 类名<代表泛型的变量>{}
* Element - E
* Type - T
* 使用泛型：在创建对象的时候规定泛型类型即可
* */
public class GenericClass<E> {
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}

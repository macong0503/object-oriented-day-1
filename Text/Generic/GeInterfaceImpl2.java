package Text.Generic;
//在实现类中不定义参数类型，在创建对象时定义
public class GeInterfaceImpl2<I> implements GenericInterface<I> {
    @Override
    public void method(I i) {
        System.out.println(i);
    }
}

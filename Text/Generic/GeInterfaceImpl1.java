package Text.Generic;
//在实现类时就定义参数类型
public class GeInterfaceImpl1 implements GenericInterface<String> {
    @Override
    public void method(String s) {
        System.out.println(s);
    }
}

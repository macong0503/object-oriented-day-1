package Text.Generic;

public class GeInterfaceImplTest {
    public static void main(String[] args) {
        GeInterfaceImpl1 g = new GeInterfaceImpl1();
        g.method("蔡徐坤");
        GeInterfaceImpl2<String> g2 = new GeInterfaceImpl2<>();
        g2.method("打篮球");
    }
}

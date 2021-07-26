package Text.Generic;

public class GenericClassTest {
    public static void main(String[] args) {
        GenericClass<String> g = new GenericClass<>();
        g.setName("胡鑫");
        System.out.println(g.getName());
        GenericClass<Integer> g2 = new GenericClass<>();
        g2.setName(10);
        System.out.println(g2.getName());
    }
}

package Text.StringBuilder;

/*
String字符串，它的值一旦创建就不能再改变
字符串的底层是个字符数组，不能改变
string字符串用+拼接字符串的时候，占用了很多空间，效率低
StringBuilder(StringBuffer)字符串缓冲区
底层是个扩容的的数组，初始化容量是16
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        StringBuilder b1 = s.append("hello");
        s.append(100).append("abc").append(true);
        System.out.println(s);
        System.out.println(b1);
    }
}

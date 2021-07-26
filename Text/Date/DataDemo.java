package Text.Date;

import java.util.Date;

public class DataDemo {
    /*
    *Date日期类:
    * 1.java.utiL.Date(注意:不要倒错包!! !)
    * 2.表示的是特定的时间:年月日时分秒毫秒
    * 3.构造方法(大多已经弃用，不建议使用，并不是不能使用
    * public Date()
    * public Date(Long date)
    * */
    public static void main(String[] args) {
        //Mon Jul 26 10:01:32 CST 2021 系统时间
        System.out.println(new Date());
        //Thu Jan 01 08:00:00 CST 1970 处于东八区 基准时间
        System.out.println(new Date(0L));
        //1627264978261 自基准时间以来的毫秒时
        System.out.println(new Date().getTime());
    }
}

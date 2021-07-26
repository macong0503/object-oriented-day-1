package Text.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DataDemo03 {
    /*
     * 清使用日期时间相关的AP工，计算出一个人已经监生了多少天。
     * 思路:
     * 1.获取当前时间对应的毫秒值
     * 2.获取自己出生日期对应的毫秒值两个时间相减（当前时间-出生日期)
     * */

    public static void main(String[] args) throws ParseException {
        System.out.println("请输入出生日期：格式为yyyy-MM-dd");
        String s = new Scanner(System.in).next();
        SimpleDateFormat str =new SimpleDateFormat("yyyy-MM-dd");

        Date birDate = str.parse(s);
        Date toDate = new Date();
        long de =toDate.getTime()- birDate.getTime();
        if (de<0){
            System.out.println("还没出生");
        }else
        System.out.println(de/1000/60/60/24);

    }
}

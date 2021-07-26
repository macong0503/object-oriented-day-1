package Text.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataDemo2 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        Date data =new Date();
        System.out.println(data);
        String str =df.format(data);
        System.out.println(str);

        String str1 = "2018年08月08日 08:08:08 888";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss SSS");
        Date date =sdf.parse(str1);
        System.out.println(date);

        /*
        * 清使用日期时间相关的AP工，计算出一个人已经监生了多少天。
        * 思路:
        * 1.获取当前时间对应的毫秒值
        * 2.获取自己出生日期对应的毫秒值两个时间相减（当前时间-出生日期)
        * */



    }
}

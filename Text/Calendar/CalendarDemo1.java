package Text.Calendar;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo1 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH)+1;
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"年"+month+"月"+dayOfMonth+"日");//2021年7月26日
        int week = cal.get(Calendar.DAY_OF_WEEK)-1;
        System.out.println(week);//Calendar中周日为第一天,可以-1

        cal.set(Calendar.YEAR,2022);
        System.out.println(cal.get(Calendar.YEAR));//2022 可以加负数即为减

        cal.add(Calendar.YEAR,+2);
        System.out.println(cal.get(Calendar.YEAR));//2024

        Date date = cal.getTime();
        System.out.println(date);//Fri Jul 26 11:18:27 CST 2024


    }
}

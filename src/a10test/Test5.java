package a10test;

import java.time.LocalDate;
import java.util.Calendar;

public class Test5 {
    public static void main(String[] args) {
        //判断一个年份是平年还是闰年
        //二月29天是闰年
        //一年366天是闰年

        //JDK7 日历类
        Calendar c = Calendar.getInstance();
        c.set(2000,2,1);//2代表三月
        c.add(Calendar.DAY_OF_MONTH,-1);
        int i = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(i);

        //JDK8日历类
        LocalDate ld = LocalDate.of(2004, 3, 1);
        LocalDate ld2 = ld.minusDays(1);
        int j = ld2.getDayOfMonth();
        System.out.println(j);

        System.out.println(ld.isLeapYear());

    }
}

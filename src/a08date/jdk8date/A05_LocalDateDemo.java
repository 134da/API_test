package a08date.jdk8date;

import java.time.LocalDate;
import java.time.Month;
import java.util.Locale;

public class A05_LocalDateDemo {
    public static void main(String[] args) {

        //获取当前时间的日历对象
        LocalDate nowDate = LocalDate.now();
        System.out.println(nowDate);

        //获取指定时间的日历对象
        LocalDate ldDate = LocalDate.of(2023, 1, 1);
        System.out.println(ldDate);

        //get获取指定值
        int year = ldDate.getYear();
        System.out.println("year:"+year);

        //获取月
        //1
        Month m = ldDate.getMonth();
        System.out.println(m);
        System.out.println(m.getValue());

        //2
        int month = ldDate.getMonthValue();
        System.out.println("month:"+month);

        //获取日
        int day = ldDate.getDayOfMonth();
        System.out.println("day:"+day);

        //获取一年的第几天
        int dayOfYear = ldDate.getDayOfYear();
        System.out.println("dayOfYear:"+dayOfYear);


        // is 判断
        // with 表示修改
        // minus 表示减少
        // plus  表示增加

    }
}

package a08date.jdk7date;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo1 {
    public static void main(String[] args) {


        //获取一个日历对象  日历是抽象类 不能直接new  通过静态方法获得子类对象
        Calendar c = Calendar.getInstance();

        //修改日历时间
        Date d = new Date(0L);
        c.setTime(d);

        System.out.println(c);

        //日历里面的数据是通过数组存储的
        //根据数组索引可以获取数据
        //0 : 纪元
        //1 : 年
        //2 : 月
        //3 : 一年中的第几周
        //4 : 一个月中的第几周
        //5 : 一个月中的第几天(日期)
        //......

        //月份 范围是0~11 0代表1月 11代表12月
        //星期 星期天是一周的第一天
        //  1 星期天...... 7 星期六

        //获取年


        c.set(Calendar.YEAR,2000);
        c.set(Calendar.MONTH,11);
        c.set(Calendar.DAY_OF_MONTH,10);

        //调用方法在这个基础上增加一个月
        c.add(Calendar.MONTH,-1);

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DAY_OF_MONTH);
        int week = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(year + ", " + month + ", " + date + ", " + week);
    }
}

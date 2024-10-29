package a08date.jdk7date;

import java.util.Date;

public class DateDemo1 {

    public static void main(String[] args) {

        //创建Date对象
        Date d = new Date();
        System.out.println(d);

        //创建对象 指定一个时间
        Date d2 = new Date(0);
        System.out.println(d2);

        //修改时间  setTime
        //设置1000毫秒 也就是一秒
        d2.setTime(1000L);
        System.out.println(d2);

        //getTime 获取当前时间的毫秒值
        System.out.println(d.getTime());
        System.out.println(d2.getTime());

    }
}
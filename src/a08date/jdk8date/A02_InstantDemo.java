package a08date.jdk8date;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class A02_InstantDemo {
    public static void main(String[] args) {

        //jdk8的时间对象 Instant



        //1 获取当前时间的Instant对象
        Instant now =Instant.now();
        System.out.println(now);

        //2 根据 秒/毫秒/纳秒 获取Instant对象
        Instant instant1 = Instant.ofEpochMilli(9999L);
        System.out.println(instant1);

        Instant instant2 = Instant.ofEpochSecond(1L);
        System.out.println(instant2);

        Instant instant3 = Instant.ofEpochSecond(1L, 1000000000);
        System.out.println(instant3);

        //3 指定时区
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(time);

        //4 判断 isXXXX()
        Instant instant4 = Instant.ofEpochMilli(0L);
        Instant instant5 = Instant.ofEpochMilli(1000L);

        //比较 isBefore()  表示4在不在五前面 是就返回ture
        boolean result1 = instant4.isBefore(instant5);
        System.out.println(result1);

        //比较 isAfter()  表示4在不在五后面 是就返回ture
        boolean result2 = instant4.isAfter(instant5);
        System.out.println(result2);

        //5 minusXXXX()减少时间的方法
        Instant instant6 = Instant.ofEpochMilli(3000L);
        System.out.println(instant6);
        //减少一秒
        Instant instant7 = instant6.minusSeconds(1);
        System.out.println(instant7);

        //plusXXXX() 增加时间的方法


    }
}

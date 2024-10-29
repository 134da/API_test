package a08date.jdk8date;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class A04_DateTimeFormatterDemo {
    public static void main(String[] args) {

        //时间对象  atZone设定时区
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));

        //使用DateTimeFormatter解析/格式化时间
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EEEE a");

        //输出格式化后的time
        System.out.println(dtf1.format(time));


    }
}

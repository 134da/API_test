package a08date.jdk8date;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class A03_ZonedDateTimeDemo {
    public static void main(String[] args) {

        //获取带时区的时间对象
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        //获取指定时间的带时区对象
        ZonedDateTime time1 = ZonedDateTime.of(2023, 10, 1,
                11, 12, 12, 0,
                ZoneId.of("Asia/Shanghai"));
        System.out.println(time1);

        //通过Instant+时区 获取指定时间对象
        //获取instant对象
        Instant instant = Instant.ofEpochMilli(0L);
        //设置zoneId 时区
        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        //通过ofInstant()设置带时区的ZonedDataTime对象
        ZonedDateTime time2 = ZonedDateTime.ofInstant(instant, zoneId);
        System.out.println(time2);

        //修改时间 withXxx
        ZonedDateTime time3 = time2.withYear(2000);
        System.out.println(time3);

        //减少时间 minusXxx
        ZonedDateTime time4 = time3.minusYears(1);
        System.out.println(time4);

        //增加时间 plusXxx
        ZonedDateTime time5 = time4.plusYears(1);
        System.out.println(time5);

        //JDK8新增的时间对象是不可变的
        //增加 修改 减少 调用者不变 但是对象地址会是新的地址
    }
}

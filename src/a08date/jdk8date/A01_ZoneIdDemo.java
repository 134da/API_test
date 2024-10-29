package a08date.jdk8date;

import java.time.ZoneId;
import java.util.Set;

public class A01_ZoneIdDemo {
    public static void main(String[] args) {

        //获取所有时区的名称
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds.size());
        System.out.println(zoneIds);

        //获取系统的默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        //获取指定的时区
        ZoneId zoneId1 = ZoneId.of("Africa/Nairobi");
        System.out.println(zoneId1);

    }
}

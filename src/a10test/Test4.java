package a10test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Test4 {
    public static void main(String[] args) throws ParseException {
        //计算你活了多少天
        //分别使用 JDK7 和 JDK8  的时间方法
        String birthday = "2000年6月3日";


        //JDK7
        //空参创建SimpleDateFormat对象
        //定义一样的时间格式  字符串传递进去就能解析
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        //用parse()函数解析字符串 然后获得date对象
        Date date = sdf.parse(birthday);
        //获取生日当天的毫秒值
        long birthdayTime = date.getTime();
        //获取当前时间的毫秒值
        long today = System.currentTimeMillis();
        long time = today - birthdayTime;
        System.out.println("距离出生一共过了" + time / 1000 / 60 / 60 / 24 + "天");



        //JDK8的时间
        //使用日历类
        LocalDate ld1 = LocalDate.of(2000, 6, 3);
        LocalDate ld2 = LocalDate.now();
        System.out.println(ld1);
        System.out.println(ld2);
        //jdk8的工具类 ChronoUnit
        long between = ChronoUnit.DAYS.between(ld1, ld2);
        System.out.println(between);

    }
}

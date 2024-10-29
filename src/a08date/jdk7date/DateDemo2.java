package a08date.jdk7date;

import java.util.Date;
import java.util.Random;

public class DateDemo2 {
    public static void main(String[] args) {

        //定义两个Date对象 比较哪一个在前 哪一个在后

        Random r = new Random();

        //创建两个时间对象
        Date d1 = new Date(Math.abs(r.nextInt()));
        Date d2 = new Date(Math.abs(r.nextInt()));
        long time1 = d1.getTime();
        long time2 = d2.getTime();
        System.out.println(time1);
        System.out.println(time2);

        if (time1 > time2) {
            System.out.println("第一个时间在后 第二个时间在前");
        } else if (time2 > time1) {
            System.out.println("第二个时间在后 第一个时间在前");
        }else {
            System.out.println("两个时间相同");
        }


    }
}

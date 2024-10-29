package a08date.jdk7date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class SimpleDateDemo1 {

    public static void main(String[] args) throws ParseException {


        //method();

        //定义一个字符串 用来解析时间
        String str = "2024-11-11 11:11:11";
        //空参创建SimpleDateFormat对象
        //定义一样的时间格式  字符串传递进去就能解析
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //用parse()函数解析字符串 然后获得date对象
        Date date = sdf.parse(str);
        //打印
        System.out.println(date);
        //可以根据解析的date对象得出毫秒值
        System.out.println(date.getTime());


    }

    private static void method() {
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date d1 = new Date(0L);
        String str1 = sdf.format(d1);
        System.out.println(str1);

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

        String str2 = sdf2.format(d1);
        System.out.println(str2);

        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy年MM月dd日 a HH:mm:ss EEEE");

        String str3 = sdf3.format(d1);
        System.out.println(str3);
    }

}

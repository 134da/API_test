package a08date.jdk7date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateDemo2 {
    public static void main(String[] args) throws ParseException {

        String str = "2000-11-11";
        //解析
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(str);
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        String s = sdf1.format(date);
        System.out.println(s);
        //格式化
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        String result = sdf2.format(date);
        System.out.println(result);


    }
}

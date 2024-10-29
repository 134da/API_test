package a07regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo6 {
    public static void main(String[] args) {

        String str = "Java自动diawjdioan，大、Java8急跌都地地i安慰你那Java11的戒备"+"因为九点半Java17机iiii得到那你的啊啊啊Java17";

        //获取正则表达式的对象
        Pattern p = Pattern.compile("Java\\d{0,2}");

        //获取一个文本匹配器的对象
        //p使用匹配规则 匹配str对象  匹配规则存在m对象中
        Matcher m = p.matcher(str);

        //循环获取对象
        //m.find() 匹配一次  有匹配的结果输出ture
        while (m.find()){
            String s = m.group();
            System.out.println(s);
        }

    }
}

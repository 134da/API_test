package a07regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo9 {
    public static void main(String[] args) {

        String str = "java自动diawjdioan，大、Java8急跌都地地i安慰你那JaVa11的戒备"+
                "因为九点半JAva17机iiii得到那你的啊啊啊JAVa17";
        //按照规则  但是只获取java文本 不获取版本号
        String regex1 = "((?i)Java)(?=8|11|17)";
        //获取整体
        String regex2 = "((?i)Java)(8|11|17)";
        String regex3 = "((?i)Java)(?:8|11|17)";
        //获取除了8 11 17的java
        String regex4 = "((?i)Java)(?!8|11|17)";

        Pattern p = Pattern.compile(regex4);
        Matcher m = p.matcher(str);
        while (m.find()){
            System.out.println(m.group());
        }


    }
}

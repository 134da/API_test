package a07regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo10 {
    public static void main(String[] args) {

        String s = "abbbbbbbbbbbbbbbbaaaaaaaaaaaaaaaa";

        //贪婪爬取 ab+ 尽可能多的匹配  结果是abbbbbbbbbbb
        //非贪婪爬取 ab+ 尽可能少的匹配 结果是ab

        //Java中  默认是贪婪爬取
        //在数量词 + * (加号 星号)后面加上问号  表示非贪婪爬取

        //设定正则表达式
        String regex = "ab+?";

        //设置规则格式
        Pattern p = Pattern.compile(regex);
        //对字符串使用规则
        Matcher m = p.matcher(s);

        while (m.find()){
            System.out.println(m.group());
        }


    }
}

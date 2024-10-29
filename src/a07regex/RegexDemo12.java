package a07regex;

public class RegexDemo12 {
    public static void main(String[] args) {

        //代表第三组数据和第一组一样
        //开头和末尾的字符(单个)一模一样
        String regex1 = "(.).+\\1";
        System.out.println("a234a".matches(regex1));
        System.out.println("a234aa".matches(regex1));

        //判断开始部分和结束部分是不是有一样的 可以有多个字符
        String regex2 = "(.+).+\\1";
        System.out.println("abc123ijiabd".matches(regex2));

        //开始部分的内容也要一样 aaa之类的
        //正则表达式 从左到右的左括号开始 算第几个组
        String regex3 = "((.)\\2*).+\\1";
        System.out.println("aaa21jibbbaaa".matches(regex3));





    }
}

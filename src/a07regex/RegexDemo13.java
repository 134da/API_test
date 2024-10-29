package a07regex;

public class RegexDemo13 {
    public static void main(String[] args) {


        String str = "我要学学编编编编程程程程程程程程程程";

        //把重复的替换成单个的

        //   (.)\1 代表一个重复字符
        //   + 代表后续的所有重复
        //  $1 代表替换成第一个组

        String newstr = str.replaceAll("(.)\\1+", "$1");
        System.out.println(newstr);

    }
}

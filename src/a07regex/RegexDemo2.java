package a07regex;

public class RegexDemo2 {
    public static void main(String[] args) {


        /*
        []表示单个字符 和括号里面的内容匹配
        [abc]   匹配a, b, c
        [^abc]  匹配非a, b, c   ^表示取反
        [a-dA-Z] 匹配a~d A~Z 满足其中之一即可
        [a-d[A-Z]] 同上效果
        [a-z&&[def]]  &&表示交集  既要满足前面也要满足后面
        [a-z&&[^def]]
        [a-z&&[^d-f]]


        .      点表示任意字符 (单个)
        \d      表示数字[0-9]
        \D      表示非数字[^0-9]
        \s      表示空白字符[\t,\n,\x0B,\f,\r]
        \S      表示非空白字符
        \w      表示单词[a-zA-Z_0-9] 字母 数字 下划线
        \W      表示非单词字符


        X?      表示X出现了一次或者没有出现    1/0
        X*      表示X出现了0次或者多次        >=0
        X+      表示X出现了一次或者多次       >0
        X{n}    表示X恰好出现了n次          =n
        X{n,}   表示X至少出现了n次          >=n
        X{n,m}  表示X至少出现了n次 不超过M次    >=n  <=m


         */
        String ab = "(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d";


        /*

        []          表示里面的内容只出现一次
        ()          表示括号内的内容分组
        ^           表示取反
        &&          表示交集 要写两个 不能写一个
        |           写在方括号外表示并集
        .           任意字符   \n表示回车符号 .不能匹配\n
        \           转义字符 java的特性
        \\d         表示0-9
        \\D         表示非0-9
        \\s         表示空白字符
        \\S         表示非空白字符
        \\w         表示单词字符 数字字母下划线
        \\W         表示非单词
        ?           0次或者1次
        *           0次或者多次
        +           1次或者多次
        {}          表示具体次数的范围
        (?i)        忽略后面的字符的大小写判断
        a((?i)b)c   只忽略b的大小写

         */








    }
}

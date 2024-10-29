package a07regex;

public class RegexDemo11 {
    public static void main(String[] args) {

        String s = "小诗诗jsia51341ojdoia小丹丹djiaownb123dabg小惠惠";


        //写字符串替换规则

        //方法也会创建文本解析器的对象 然后查询并替换
        String resut1 = s.replaceAll("[\\w&&[^_]]+", "vs");

        System.out.println(resut1);

        String s2 = "小诗诗a小丹丹a小惠惠";
        //字符串切割函数
        String[] arr = s2.split("a");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }


    }
}

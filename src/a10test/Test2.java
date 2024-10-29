package a10test;

public class Test2 {
    public static void main(String[] args) {

        //实现parseInt()方法


        //定义字符串 把它转换成int类型
        //字符只能是数字  第一位不能为0 长度是1-10位

        String str = "1234567890";
        System.out.println(Integer.parseInt(str)+1);

        //通过正则表达式测试字符串是否符合要求
        if (!str.matches("[1-9]\\d{0,9}")) {
            System.out.println("数据错误");
        } else {
            System.out.println("数据正确");

            //数据正确 开始解析数字
            int temp = 0;
            int number = 0;
            for (int i = 0; i < str.length(); i++) {
                //提取每一个数字
                temp = str.charAt(i) - '0';
                number = number * 10 + temp;

            }

            System.out.println(number);
            System.out.println(number + 1);


        }

    }
}

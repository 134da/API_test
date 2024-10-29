package a10test;

public class Test3 {

    public static void main(String[] args) {

        //写一个模拟转换成二进制的方法
        //toBinaryString()

        System.out.println(toBinaryString(123));
        System.out.println(Integer.toBinaryString(123));

    }

    private static String toBinaryString(int number) {
        //10进制转换成2进制  除以2 得到余数 继续除以2
        //第一次除出来的是最低位 所以要倒着拼接

        //创建字符串数组 用来拼接字符串
        StringBuilder sb = new StringBuilder();

        int temp = 0;

        //循环用来除以二
        while (true){

            if (number == 0){
                break;
            }

            //这是余数
            temp = number % 2;

            sb.insert(0,temp);
            //除以2 然后循环继续获得余数
            number = number/2;


        }
        return sb.toString();


    }

}

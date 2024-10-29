package a05biginteger;

import java.math.BigInteger;

public class BigInterDemo2 {
    public static void main(String[] args) {

        //创建对象
        BigInteger bd1 = BigInteger.valueOf(10);
        BigInteger bd2 = BigInteger.valueOf(2);

        //加法
        BigInteger bd3 = bd1.add(bd2);
        System.out.println(bd3);

        //除法 获取余和商
        BigInteger[] arr= bd1.divideAndRemainder(bd2);
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        //比较是否相同
        boolean result = bd1.equals(bd2);
        System.out.println(result);

        //次幂
        BigInteger bd4 = bd1.pow(2);
        System.out.println(bd4);

        //max
        BigInteger bd5 = bd1.max(bd2);
        System.out.println(bd5);

        //转换输出类型 intValue()  doubleValue()
        BigInteger bd6 = BigInteger.valueOf(200);
        double v = bd6.doubleValue();
        System.out.println(v);


    }
}

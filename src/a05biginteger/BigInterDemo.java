package a05biginteger;

import java.math.BigInteger;
import java.util.Random;

public class BigInterDemo {
    public static void main(String[] args) {


        //BigInter 获取一个大数
        Random r = new Random();
        //BigInterger(a, random) 按照a的参数决定范围 [0 ~ 2的a次方-1] 4的话就是0~15
        // random对象负责输出随机数
        BigInteger bd1 = new BigInteger(4, r);
        System.out.println(bd1);

        // 获取一个指定的大数 通过字符串传递 默认是十进制
        BigInteger bd2 = new BigInteger("100");
        System.out.println(bd2);

/*        BigInteger bd3 = new BigInteger("abc");
        System.out.println(bd3);*/

        // 也可直接指定进制 但是字符串要符合进制形式
        BigInteger bd4 = new BigInteger("1111",2);
        System.out.println(bd4);

        //通过指定方式获取对象 BigInterger.valueOf()  内部有优化
        //取值范围在long范围内
        BigInteger bd5 = BigInteger.valueOf(9223372036854775807L);
        System.out.println(bd5);

        System.out.println(Long.MAX_VALUE);

        //valueOf()会先创建好-16 ~ 16 多次创建就不会重复创建了 会直接调用
        BigInteger bd6 = BigInteger.valueOf(16);
        BigInteger bd7 = BigInteger.valueOf(16);

        System.out.println(bd6 == bd7);

        BigInteger bd8 = BigInteger.valueOf(17);
        BigInteger bd9 = BigInteger.valueOf(17);

        System.out.println(bd8 == bd9);


    }
}

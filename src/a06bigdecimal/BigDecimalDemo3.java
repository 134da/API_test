package a06bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo3 {
    public static void main(String[] args) {

        //加法
        BigDecimal bd1 = BigDecimal.valueOf(10.0);
        BigDecimal bd2 = BigDecimal.valueOf(3.0);
        BigDecimal bd3 = bd1.add(bd2);
        System.out.println(bd3);

        //减法
        BigDecimal bd4 = bd1.subtract(bd2);
        System.out.println(bd4);

        //乘法
        BigDecimal bd5 = bd1.multiply(bd2);
        System.out.println(bd5);

        //除法  除不尽的话 需要指定余下几位
        BigDecimal bd6 = bd1.divide(bd2,2, RoundingMode.HALF_UP);
        System.out.println(bd6);


    }
}

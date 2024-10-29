package a06bigdecimal;

import java.math.BigDecimal;

public class BigDecimalDemo2 {
    public static void main(String[] args) {

        //通过传递double来传递小数  不建议使用
        BigDecimal bd1 = new BigDecimal(0.01);
        BigDecimal bd2 = new BigDecimal(0.09);

        //有误差 因为double显示的小数有误差
        System.out.println(bd1);
        System.out.println(bd2);


        //通过字符串来传递小数
        BigDecimal bd3 = new BigDecimal("0.01");
        BigDecimal bd4 = new BigDecimal("0.09");
        BigDecimal bd5 = bd3.add(bd4);
        //精确的结果
        System.out.println(bd3);
        System.out.println(bd4);
        System.out.println(bd5);


        //通过静态方法获取对象
        BigDecimal bd6 = BigDecimal.valueOf(10);//10.0
        BigDecimal bd7 = BigDecimal.valueOf(10.0);
        System.out.println(bd6);
        System.out.println(bd6 == bd7);

        //如果要显示的数据比较小 在double取值范围内 建议用静态方法
        //如果要显示的数据比较大 超过double取值范围外 建议使用构造方法
        //如果传递的是0~10之间的整数 包含0和10 那么方法会返回提前创建好的对象 不会重新创建(new)


    }
}

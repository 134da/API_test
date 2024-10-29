package a01math;

public class MathDemo1 {
    public static void main(String[] args) {
        /*
            abs(int a)              获取绝对值
            ceil(double a)          向上取整
            floor(double a)         向下取整
            round(float a)          四舍五入
            max(int a, int b)       获取两个int中的较大值
            min(int a, int b)       获取两个int中的较小值
            pow(double a, double b) 返回a的b次幂
            sqrt(double a)          返回a的平方根
            cbrt(double a)          返回a的立方根
            random()                返回值为double的随机值，范围[0.0, 1.0)
         */


        //abs 绝对值获取
        System.out.println(Math.abs(88));
        System.out.println(Math.abs(-88));
        //因为int的最小值是-2147483648 最大值是2147364847
        //所以int的最小值的负数没办法获取出来绝对值（超出int范围）
        //System.out.println(Math.abs(-2147483648));
        //absExact会提醒最小值溢出  Overflow to represent absolute value of Integer.MIN_VALUE
        //System.out.println(Math.absExact(-2147483648));

        System.out.println("--------------------------");

        //进一法 往数轴的正方向进一
        System.out.println(Math.ceil(12.34));//13
        System.out.println(Math.ceil(12.54));
        System.out.println(Math.ceil(-12.34));//-12
        System.out.println(Math.ceil(-12.54)); //负数会往正数方向进位

        System.out.println("--------------------------");

        //去尾法 往数轴负方向进位
        System.out.println(Math.floor(12.34));//12
        System.out.println(Math.floor(12.54));
        System.out.println(Math.floor(-12.34));//-13
        System.out.println(Math.floor(-12.54));//往数轴负方向进位

        System.out.println("--------------------------");

        //四舍五入 总体来说 从数轴上来说靠近哪边就向哪边进位
        System.out.println(Math.round(12.34));//12
        System.out.println(Math.round(12.54));//12
        System.out.println(Math.round(-12.34));//-12
        System.out.println(Math.round(-12.54));//-13

        System.out.println("--------------------------");

        //获取两个数中的较大的那个
        System.out.println(Math.max(20, 30));
        //获取两个数中的较小的那个
        System.out.println(Math.min(20, 30));

        System.out.println("--------------------------");

        //获取a的b次幂
        System.out.println(Math.pow(2, 3));// 8.0
        //如果指数是小数 那就是开根号
        System.out.println(Math.pow(4, 0.5));// 2.0
        //如果指数是负数 那就是倒数的次幂
        System.out.println(Math.pow(2, -2)); // 1/4
        //开根号和倒数次幂有单独的方法 Math.pow建议一般传大于1的正整数
        System.out.println(Math.sqrt(4));// 2.0 这是平方根
        System.out.println(Math.cbrt(8));// 2.0 这是立方根

        System.out.println("--------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random());//[0.0, 1.0)
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.floor(Math.random() * 100) + 1);

        }


    }
}

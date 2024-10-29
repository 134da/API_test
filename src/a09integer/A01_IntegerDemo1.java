package a09integer;

import java.time.Instant;

public class A01_IntegerDemo1 {
    public static void main(String[] args) {
        //用构造方法创建包装类
        Integer i1 = new Integer(1);
        Integer i2 = new Integer("1");

        System.out.println(i1);
        System.out.println(i2);

        //用静态方法调用包装类
        Integer i3 = Integer.valueOf(123);
        Integer i4 = Integer.valueOf("123");
        Integer i5 = Integer.valueOf("123", 8);

        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);

        //

    }
}

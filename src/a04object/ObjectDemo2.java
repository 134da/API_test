package a04object;

public class ObjectDemo2 {
    public static void main(String[] args) {

        Student s1 = new Student("张三",21);
        Student s2 = new Student("张三",21);


        boolean result1 = s1.equals(s2);
        System.out.println(result1);

        //一般equals 默认使用object中的方法 比较的是地址值
        //重写之后 默认比较的是对象内部的值


    }
}

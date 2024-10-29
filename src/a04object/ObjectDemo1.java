package a04object;

public class ObjectDemo1 {
    public static void main(String[] args) {


        // 返回字符串 .toString() 返回对象的字符串形式
        Object obj = new Object();
        //记录obj这个对象的字符串形式也就是地址值
        String str1 = obj.toString();
        System.out.println(str1);

        Student stu = new Student();
        String str2 = stu.toString();
        System.out.println(str2);

        //System : 类名
        //out : 静态变量
        //System.out : 获取打印对象
        //println() : 方法
        //参数表示打印的内容
        System.out.println(stu);


        //可以通过重写对象里面的toString用来输出对象内的属性值


    }
}

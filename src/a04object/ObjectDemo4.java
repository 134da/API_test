package a04object;

public class ObjectDemo4 {
    public static void main(String[] args) throws CloneNotSupportedException {

        int[] data = {1,2,4,5,6,7,8,8,9,10};
        User u1 = new User(1,"zhangsan", "123455", "qiff",data);

        //clone会创建一个新对象 并把原对象中的数据复制到新对象中
        //重写Object中的clone方法
        //创建对象并调用
        User u2 = (User) u1.clone();

        System.out.println(u1);
        System.out.println(u2);


    }
}

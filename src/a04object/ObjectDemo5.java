package a04object;

import java.util.Objects;

public class ObjectDemo5 {
    public static void main(String[] args) {

        Student s1 = null;
        Student s2 = new Student("张三",21);


        boolean result = Objects.equals(s1, s2);
        System.out.println(result);


        Student s3 = new Student();
        Student s4 = null;
        System.out.println(Objects.isNull(s3));
        System.out.println(Objects.isNull(s4));

        //isNull  nonNull 判断是空 或者 判断不是空

        System.out.println(Objects.nonNull(s3));
        System.out.println(Objects.nonNull(s4));



    }
}

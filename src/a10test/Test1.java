package a10test;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        //录入1~100的整数 添加到集合中 直到所有数据和超过200

        //创建集合来录入数据
        ArrayList<Integer> list = new ArrayList<>();

        //键盘录入 循环录入 直到和大于200  范围错误的数不录入
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个1~100的整数");
            //记录一整行内的所有数据
            String number = sc.nextLine();
            //字符串转换成int类型的数据
            int num = Integer.parseInt(number);
            //异常过滤
            if (num < 1 || num > 100) {
                System.out.println("当前数字不是1~100之间");
                continue;
            }
            //正确的数字添加进去
            list.add(num);
            int temp = 0;
            //求和
            for (int i = 0; i < list.size(); i++) {
                temp = temp + list.get(i);
            }
            if (temp > 200) {
                System.out.println("输入的数据满足要求");
                break;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");

        }

    }

}

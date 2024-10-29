package a01math;

public class MathDemo3 {
    public static void main(String[] args) {

        //求自幂数
        int count = 0;
        //三位 水仙花数
        for (int i = 100; i < 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;

            //判断
            double sum = Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3);
            if (sum == i){
                count++;
                System.out.println(i);
            }

        }
        System.out.println(count);
    }
}

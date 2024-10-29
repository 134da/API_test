package a01math;

public class MathDemo2 {
    public static void main(String[] args) {


        //用平方根优化找质数
        int a = 999;

        System.out.println(isPrime(a));


    }

    private static boolean isPrime(int number) {
        int count = 0;
        for (int i = 2; i < number; i++) {
            count++;
            if (number % i == 0) {
                return false;
            }

        }
        System.out.println(count);
        return true;
    }

    private static boolean isPrime2(int number) {
        int count = 0;
        for (int i = 2; i < Math.sqrt(number); i++) {
            count++;
            if (number % i == 0) {
                return false;
            }

        }
        System.out.println(count);
        return true;
    }
}

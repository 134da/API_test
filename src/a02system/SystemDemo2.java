package a02system;

public class SystemDemo2 {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 2; i < 100000; i++) {
            boolean flag = isPrime2(i);
            if(flag){
                System.out.println(i);
            }

        }
        long end = System.currentTimeMillis();

        System.out.println(end - start);


    }


    private static boolean isPrime(int number) {
        int count = 0;
        for (int i = 2; i < number; i++) {
            count++;
            if (number % i == 0) {
                return false;
            }

        }

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

        return true;
    }
}

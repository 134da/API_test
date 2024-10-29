package a02system;

public class SystemDemo3 {
    public static void main(String[] args) {
        //拷贝数组
        int [] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int [] arr2 = new int[10];
        //arraycopy参数
        // 1 数据源
        // 2 从第几个数开始拷贝
        // 3 目的地
        // 4 拷贝目的地的 从哪里开始粘贴
        // 5 拷贝多少个数据

        System.arraycopy(arr1, 0,arr2,4,3);

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");

        }


    }
}

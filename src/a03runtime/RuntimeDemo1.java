package a03runtime;

import java.io.IOException;

public class RuntimeDemo1 {
    public static void main(String[] args) throws IOException {
        Runtime ta = Runtime.getRuntime();



        // 获取Runtime对象
        //Runtime r1 = Runtime.getRuntime()

        // exit 停止虚拟机 是System.exit()的底层代码
        //Runtim.getRuntime.exit(0)

        //获取cpu线程数
        System.out.println(ta.availableProcessors());

        //java可以获取总内存大小
        System.out.println(ta.maxMemory() / 1024 / 1024);

        //java已经获取的大小
        System.out.println(ta.totalMemory() / 1024 / 1024);

        //java已经空闲未使用的内存大小
        System.out.println(ta.freeMemory() / 1024 / 1024);

        //运行cmd命令

        //cmd常见参数
        /* shutdown 关机
            -s : 默认在一分钟之后关机
            -s -t 指定关机时间
            -a : 取消关机操作
         */
        ta.exec("shutdown -a");

    }

}

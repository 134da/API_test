package a07regex;

public class RegexDemo1 {
    public static void main(String[] args) {

        //检测qq号是否正确  体验正则表达式

        String qq = "11234561111111117890";
        System.out.println(checkQQ(qq));

        //通过正则表达式
        System.out.println(qq.matches("[1-9]\\d{5,19}"));

    }

    public static boolean checkQQ(String qq) {
        //1, 6到20位之间 0 不能在开头 全部都必须是数字
        int len = qq.length();
        if (len < 6 || len > 20) {
            return false;
        }

        //0不在开头
        if (qq.startsWith("0")) {
            return false;
        }

        //必须全是数字
        for (int i = 0; i < qq.length(); i++) {
            char c = qq.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }

        }
        return true;
    }

}

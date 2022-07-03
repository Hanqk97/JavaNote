package JavaBase;

public class WeiCal {
    static int a=-0b00111100;
    static int b=0b00001101;

    public static void main(String[] args) {
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~a);
        System.out.println(a<<2);
        System.out.println("a>>3:"+(a>>3));
        System.out.println("a>>>3:"+(a>>>3));
        System.out.println(Integer.toBinaryString(a>>>3));
        System.out.println(Integer.toBinaryString(a>>3));
        System.out.println(""+a+b);
        System.out.println(a+b+"");
        /**
         * @author 作者名
         * @version 版本号
         * @since 指需要的最早的jdk版本
         * @param 参数名
         * @return 返回值情况
         * @throws 异常抛出情况
         */
    }
}

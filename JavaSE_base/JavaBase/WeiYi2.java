package JavaBase;

public class WeiYi2 {
    static int a=-16;
    public static void main(String[] args) {
        System.out.println("a>>3:"+(a>>2));
        System.out.println("a>>>3:"+(a>>>2));
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(a>>2));
        System.out.println(Integer.toBinaryString(a>>>2));
    }

}

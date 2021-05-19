package JavaBase;

public class ExtendNumber {
    public static void main(String[] args) {
        //整数拓展
        int x=0b10;
        int i1=10;
        int i2=020;
        int i3=0x15;
        System.out.println(x);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

        //浮点数拓展
        float a1=0.1f;
        double a2=1.0/10;
        System.out.println(a1==a2);

        float b1=123122423124f;
        float b2=b1+1;
        System.out.println(b1==b2);

        //字符拓展
        char a='a';
        char b='上';

        System.out.println((int)a);
        System.out.println((int)b);

        char c='\u0061';
        System.out.println(c);
        
    }
}
